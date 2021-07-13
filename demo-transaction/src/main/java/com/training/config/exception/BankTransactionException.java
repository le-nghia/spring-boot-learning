package com.training.config.exception;

public class BankTransactionException extends Exception{

    private static final long serialVersionUID = -3128681006635764911L;

    public BankTransactionException(String message) {
        super(message);
    }
}
