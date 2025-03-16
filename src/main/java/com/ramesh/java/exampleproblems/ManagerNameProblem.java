package com.ramesh.java.exampleproblems;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// We have list of Employee, get all the manager's name
@AllArgsConstructor
@ToString
@Getter
@Setter
class Employee {
    private Integer id;
    private String name;
    private Integer managerId;

    public Integer getId() {
        System.out.println("Id: " + this.id);
        return this.id;
    }

    public Integer getManagerId() {
        System.out.println("managerId: " + this.managerId);
        return this.managerId;
    }
}

public class ManagerNameProblem {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(1, "Ranga", null),
            new Employee(2, "Om", 1),
            new Employee(3, "Ram", 1),
            new Employee(4, "Aniketh", 2),
            new Employee(5, "Murgya", 3)
        );

        List<Integer> managerIds = employees
                .stream()
                .map(Employee::getManagerId)
                .distinct()
                .filter(Objects::nonNull)
                .toList();

        List<String> managerNames = employees
                .stream()
                .filter(employee -> managerIds.contains(employee.getId()))
                .map(Employee::getName)
                .toList();

        System.out.println(managerNames);
    }
}
