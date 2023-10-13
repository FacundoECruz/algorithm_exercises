import utils.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise7 {

    public ListNode mergeLists(ListNode list1, ListNode list2) {
        List<Integer> vector = new ArrayList<>();
        while (list1 != null) {
            vector.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            vector.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(vector);
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        for (int i = 0; i < vector.size(); i++) {
            result.next = new ListNode(vector.get(i));
            result = result.next;
        }

        return temp.next;
    }

    public ListNode pointToTheOtherList(ListNode a, ListNode b) {
        ListNode temp = a.next;
        a.next = b;
        ListNode lastNode = getLastNode(b);
        lastNode.next = temp;
        return a;
    }

    private ListNode getLastNode(ListNode b) {
        ListNode temp = b;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public ListNode mergeLinkedList(ListNode a, ListNode b) {
        ListNode dummyNode = new ListNode(0);
        ListNode start = dummyNode;
        while (true) {
            if(a == null){
                start.next = b;
                break;
            }
            if(b == null){
                start.next = a;
                break;
            }

            if (a.val <= b.val) {
                start.next = a;
                a = a.next;
            } else {
                start.next = b;
                b = b.next;
            }
            start = start.next;
        }

        return dummyNode.next;
    }
}
