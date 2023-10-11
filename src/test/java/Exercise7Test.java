import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.ListNode;

public class Exercise7Test {

    ListNode a = new ListNode(3, new ListNode(6, new ListNode(9, null)));
    ListNode b = new ListNode(2, new ListNode(5, new ListNode(6, null)));

    Exercise7 exercise = new Exercise7();

    @Test
    public void node_of_a_should_point_to_node_of_b(){
        ListNode expected = new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(6, new ListNode(6, new ListNode(9, null))))));
        ListNode result = exercise.pointToTheOtherList(a, b);
        print(expected, result);
        Assertions.assertTrue(areEqualLists(expected, result));
    }

    private boolean areEqualLists(ListNode head1, ListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.val != head2.val) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1 == null && head2 == null;
    }
    private void print(ListNode expected, ListNode result){
        System.out.println("Expected");
        while(expected != null){
            System.out.println(expected.val);
            expected = expected.next;
        }
        System.out.println("Result");
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
