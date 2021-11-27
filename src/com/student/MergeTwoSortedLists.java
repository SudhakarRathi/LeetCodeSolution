package com.student;

public class MergeTwoSortedLists {

      static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nodeList = new ListNode();
        ListNode current = nodeList;
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
            System.out.println(current+"  -   "+current.next);
        }
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }
        return nodeList.next;
    }
      public static void main(String [] s){
          MergeTwoSortedLists listlink = new MergeTwoSortedLists();
          ListNode n1 = new ListNode(4);
          ListNode n2 = new ListNode(3,n1);
          ListNode n3 = new ListNode(2,n2);
          ListNode list1 = new ListNode(1,n3);
          /*
          ListNode list2 = [1,3,4]*/
//          listlink.mergeTwoLists(list1,list2);

          while (list1.val!=0){

              System.out.println(list1.val);
              list1 = list1.next;
          }
      }
}
