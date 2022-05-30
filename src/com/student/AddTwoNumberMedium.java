package com.student;

public class AddTwoNumberMedium {
    public static ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
    public static void main(String[] args) {
        while (l1!=null){
            System.out.print(l1.val);
            l1=l1.next;
        }
    }
}

