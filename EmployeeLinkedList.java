package com.cambeeler;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNextNode(head);
        head = node;
        size += 1;
    }

    public EmployeeNode getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }
}
