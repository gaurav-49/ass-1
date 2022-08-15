package com.company.functionalities;

import com.company.models.Address;
import com.company.models.Customer;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Functionalities {

    public Customer getCustomerWithExactMatchingName(List<Customer> customerList, String name){

        return customerList.stream()
                .filter(customer -> customer.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
    
    public Customer getCustomerWithMatchingAddress(List<Customer> customerList, Address address){
        return customerList.stream()
                .filter((customer -> customer.getAddress().toString().equalsIgnoreCase(address.toString())))
                .findFirst()
                .orElse(null);
    }

    public List<Customer> getAllCustomersHavingAccountBalanceGreaterThan(List<Customer> customerList, double amount){
        List<Customer> customers = customerList.stream()
                .filter(customer -> customer.getAccount().getBalance()>amount)
                .collect(Collectors.toList());
        return customers;
    }

    public List<String> convertToListName(List<Customer> customerList){
        List<String> nameList = customerList.stream()
                .map(customer -> customer.getName())
                .collect(Collectors.toList());

        return nameList;
    }

    public String convertCustomerListToString(List<Customer>customerList){
        String answer = customerList.stream()
                .map(customer -> customer.toString())
                .collect(Collectors.joining(" "));

        return answer;
    }

    public List<String> changeCase(List<String> nameList){
        List<String> newList =  nameList.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        return newList;
    }

    public List<String> sortNameList(List<String> nameList){
        List<String> newList =  nameList.stream()
                .sorted()
                .collect(Collectors.toList());

        return newList;
    }





}
