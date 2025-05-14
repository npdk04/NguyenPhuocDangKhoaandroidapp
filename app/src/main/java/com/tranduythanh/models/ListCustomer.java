package com.tranduythanh.models;

import java.util.ArrayList;

public class ListCustomer {
    private ArrayList<Customer> customers;

    public ListCustomer(){

        customers = new ArrayList<>();
    }

    public void addCustomer(Customer c){
        customers.add(c);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    public void generate_sample_dataset(){
        addCustomer( new Customer(1,"Khoa","khoa1903204@gmail.com","0978697690","khoa","123" ));
        addCustomer( new Customer(2,"Kha","kha@gmail.com","0948697690","kha","123" ));
        addCustomer( new Customer(3,"Khi","khi@gmail.com","0988697690","khi","123" ));
        addCustomer( new Customer(4,"Kho","kho@gmail.com","0978697690","kho","123" ));
        addCustomer( new Customer(5,"Khu","khu@gmail.com","0968697690","khu","123" ));
        addCustomer( new Customer(6,"Khe","khe@gmail.com","0976697690","khe","123" ));
        addCustomer( new Customer(7,"Khy","khy@gmail.com","0979697690","khy","123" ));
        addCustomer( new Customer(8,"Khe","khe@gmail.com","09744697690","khe","123" ));
        addCustomer( new Customer(9,"Khai","khai@gmail.com","0968697690","khai","123" ));
        addCustomer( new Customer(10,"Khoi","khoi@gmail.com","0778697690","khoi","123" ));
    }
}
