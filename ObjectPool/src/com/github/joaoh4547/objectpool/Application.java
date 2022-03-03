package com.github.joaoh4547.objectpool;

import com.github.joaoh4547.objectpool.entities.Employee;
import com.github.joaoh4547.objectpool.pools.EmployeePool;
import com.github.joaoh4547.objectpool.pools.Pool;

public class Application {
    public static void main(String[] args) {
        Pool<Employee> employeePool = new EmployeePool();
        Employee employee = employeePool.acquire();


        System.out.println(employee.getName());

        employeePool.release(employee);
        employee = employeePool.acquire();
        System.out.println(employee.getName());

    }
}
