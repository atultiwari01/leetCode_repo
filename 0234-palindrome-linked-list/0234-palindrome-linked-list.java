/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> address = new ArrayList<>();
        ListNode temp = head;

        while(temp!=null){
            address.add(temp.val);
            temp = temp.next;
        }
        for(int i = 0 ; i<(address.size())/2;i++){
            if(address.get(i) != address.get(address.size()-i-1)){
                return false;
            }
        }
        return true;
    }
}