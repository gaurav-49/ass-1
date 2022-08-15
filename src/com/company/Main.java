package com.company;

import com.company.functionalities.Functionalities;
import com.company.models.Account;
import com.company.models.Address;
import com.company.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Functionalities functionalities = new Functionalities();
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer();
        Address address1 = new Address("21", "ramanandcolony","jehanabad","bihar");
        Account account1 = new Account("7633542367","HDFC0001",8500.2);
        customer1.setName("gaurav");

        customer1.setAddress(address1);
        customer1.setAccount(account1);

        Customer customer2 = new Customer();
        Address address2 = new Address("23", "streetc","nainital","uk");
        Account account2 = new Account("7633542328","HDFC00055",899.2);
        customer2.setName("nikhil");


        customer2.setAddress(address2);
        customer2.setAccount(account2);

        Customer customer3 = new Customer();
        Address address3 = new Address("22", "streetb","haldwani","uk");
        Account account3 = new Account("7633542368","HDFC0002",8334.2);
        customer3.setName("yash");


        customer3.setAddress(address3);
        customer3.setAccount(account3);

        Customer customer4 = new Customer();
        Address address4 = new Address("24", "streetd","haldwani","uk");
        Account account4 = new Account("7633542347","HDFC0009",87445.2);
        customer4.setName("siddhu");


        customer4.setAddress(address4);
        customer4.setAccount(account4);

        Customer customer5 = new Customer();
        Address address5 = new Address("25", "streeta","nainital","uk");
        Account account5 = new Account("7633542363","HDFC0008",899.2);
        customer5.setName("simpy");

        customer5.setAddress(address5);
        customer5.setAccount(account5);

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);


        System.out.println("------------Query1----------------");

        Customer query1 = functionalities.getCustomerWithExactMatchingName(customerList,"gaurav");
        System.out.println(query1.toString());

        //data setup for query 2

        Address addressToSearch = new Address("21", "ramanandcolony","jehanabad","bihar");

        System.out.println("------------Query2----------------");
        Customer query2 = functionalities.getCustomerWithMatchingAddress(customerList, addressToSearch);
        System.out.println(query2.toString());


        System.out.println("------------Query3----------------");
        List<Customer> query3 = functionalities.getAllCustomersHavingAccountBalanceGreaterThan(customerList, 8000.0);

        for(Customer k:query3){
            System.out.println(k.toString());
            System.out.println("-----");
        }

        System.out.println("------------Query4----------------");

        List<String> nameList = functionalities.convertToListName(customerList);
        for(String k:nameList){
            System.out.println(k);
            System.out.println("-----");
        }

        System.out.println("------------Query5----------------");

        String query5 = functionalities.convertCustomerListToString(customerList);
        System.out.println(query5);

        System.out.println("------------Query6----------------");
        List<String> query6 = functionalities.changeCase(nameList);
        for(String k:query6){
            System.out.println(k);
            System.out.println("-----");
        }

        System.out.println("------------Query7----------------");
        List<String> query7 = functionalities.sortNameList(nameList);
        for(String k:query7){
            System.out.println(k);
            System.out.println("-----");
        }



    }
}
