package com.github.joaoh4547.objectpool.pools;

import com.github.joaoh4547.objectpool.entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeePool implements Pool<Employee>{

    private final List<Employee> employees = new ArrayList<>();

    public EmployeePool(){
        this.employees.add(new Employee("Thiago da Silva"));
        this.employees.add(new Employee("Rafael Alves"));
        this.employees.add(new Employee("Jonas Martins"));
    }

    @Override
    public Employee acquire() {
        if(this.employees.size() >0){
            return this.employees.remove(0);
        }
        return null;
    }

    @Override
    public void release(Employee object) {
        this.employees.add(object);
    }
}
