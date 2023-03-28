/** Customer.java
 * This sets the POJO class
 * Andrea Jacobs 218024266
 * 27 March 2023 */

package za.ac.cput.domain;

import java.util.Objects;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private Address address;
    //private Contact contactDetails;
    private BankAccount bankAccount;

    public Customer(String customerId, String firstname, String lastName, Address address, BankAccount bankAccount){
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.bankAccount = bankAccount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", bankAccount=" + bankAccount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerId, customer.customerId) && Objects.equals(bankAccount, customer.bankAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, bankAccount);
    }
}
