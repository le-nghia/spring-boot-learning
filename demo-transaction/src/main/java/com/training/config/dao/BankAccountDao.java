package com.training.config.dao;

import com.training.config.entity.BankAccount;
import com.training.config.exception.BankTransactionException;
import com.training.config.model.BankAccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class BankAccountDao {
    @Autowired
    private EntityManager entityManager;

    public BankAccountDao() {
    }

    public BankAccount findById(Long id){
        return this.entityManager.find(BankAccount.class, id);
    }

    public List<BankAccountInfo> listBankAccountInfo(){
        String sql = "select new " + BankAccountInfo.class.getName()//
                + "(e.id, e.fullName, e.balance)"//
                + "from " + BankAccount.class.getName()+ " e ";

        Query query = entityManager.createQuery(sql, BankAccountInfo.class);
        return query.getResultList();
    }
    /**
     * Mandatory: Bắt buộc phải có transaction đã được khởi tạo trước đó.
     *
     */
    @Transactional(propagation = Propagation.MANDATORY)
    public void addAmount(Long id, double amount) throws BankTransactionException {
        BankAccount account = this.findById(id);
        if (account == null){
            throw new BankTransactionException("Account not found: "+ id);
        }
        double newBalance = account.getBalance()+amount;
        if (account.getBalance()+amount < 0){
            throw new BankTransactionException(
                    "The money thi the account '"+ account.getFullName()+"' is not enough ("+ account.getBalance()+")");
        }
        account.setBalance(newBalance);
    }

    /**
     * Không bắt ngoại lệ BankTransactionException trong phương thức này.
     * @param fromAccountId
     * @param toAccountId
     * @param amount
     * @throws BankTransactionException
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = BankTransactionException.class)
    public void sendMoney(Long fromAccountId, Long toAccountId, double amount) throws BankTransactionException{
        addAmount(toAccountId, amount);
        addAmount(fromAccountId, -amount);
    }
}
