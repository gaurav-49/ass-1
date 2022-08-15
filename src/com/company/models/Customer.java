package com.company.models;

public class Customer{
    private String name;

    private Account account = new Account();
    private Address address = new Address();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", account=" + account.toString() +
                ", address=" + address.toString() +
                '}';
    }
}
