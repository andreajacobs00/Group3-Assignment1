/*
 * BankAccount POJO Class
 * Author: Haydn Abrahams
 * Date: 24 March
 */
package za.ac.cput.domain;

import java.util.Date;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private String accountType;
    private Date expirationDate;

    public BankAccount() {
    }
/*    public BankAccount(Builder builder) {
        this.accountHolderName = builder.accountHolderName;
        this.accountNumber = builder.accountNumber;
        this.accountType = builder.accountType;
        this.expirationDate = builder.expirationDate;
    }
*/
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
/*    public static class Builder {
        private String accountHolderName;
        private int accountNumber;
        private String accountType;
        private Date expirationDate;

        public Builder setAccountHolderName(String accountHolderName) {
            this.accountHolderName = accountHolderName;
            return this;
        }

        public Builder setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        public Builder setExpirationDate(Date expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Builder copy(BankAccount bankAccount) {
            this.accountHolderName = bankAccount.accountHolderName;
            this.accountNumber = bankAccount.accountNumber;
            this.accountType = bankAccount.accountType;
            this.expirationDate = bankAccount.expirationDate;
            return this;
        }
        public BankAccount build() {
            return new BankAccount(this);
        }
    } */
 }
