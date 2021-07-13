package com.training.config.form;

public class SendMoneyForm {

    private Long formAccountId;
    private Long toAccountId;
        private Double amount;

    public SendMoneyForm() {
    }

    public SendMoneyForm(Long formAccountId, Long toAccountId, Double amount) {
        this.formAccountId = formAccountId;
        this.toAccountId = toAccountId;
        this.amount = amount;
    }

    public Long getFormAccountId() {
        return formAccountId;
    }

    public void setFormAccountId(Long formAccountId) {
        this.formAccountId = formAccountId;
    }

    public Long getToAccountId() {
        return toAccountId;
    }

    public void setToAccountId(Long toAccountId) {
        this.toAccountId = toAccountId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
