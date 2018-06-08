package com.cambeeler;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode nextNode;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public EmployeeNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(EmployeeNode nextNode) {
        this.nextNode = nextNode;
    }

}
