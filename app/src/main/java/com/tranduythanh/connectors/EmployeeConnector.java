package com.tranduythanh.connectors;

import com.tranduythanh.models.Employee;
import com.tranduythanh.models.ListEmployee;

public class EmployeeConnector {
    public Employee login(String usr,String pwd)
    {
        ListEmployee le=new ListEmployee();
        le.generate_sample_dataset();
        for(Employee e : le.getEmployees())
        {
            if(e.getUsername().equalsIgnoreCase(usr) && e.getPassword().equals(pwd))
            {
                return e;
            }
        }
        return null;
    }
}
