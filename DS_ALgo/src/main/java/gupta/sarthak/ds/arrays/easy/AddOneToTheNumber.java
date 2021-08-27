package gupta.sarthak.ds.arrays.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*

*Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
 * The digits are stored such that the most significant digit is at the head of the list.
 *
*

* */
public class AddOneToTheNumber {
    public class Solution {
        public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
            int carry = 0;
            ArrayList<Integer> a = new ArrayList<>();
            for(int i = A.size() - 1; i >= 0; i--){
                int num;
                if(i == A.size() - 1){
                    num = (A.get(i) + carry + 1) % 10;
                    carry = (A.get(i) + carry + 1) / 10;
                }else{
                    num = (A.get(i) + carry) % 10;
                    carry = (A.get(i) + carry) / 10;
                }
                carry = (A.get(i) + carry) / 10;
                a.add(num);
            }
            if(carry > 0){
                a.add(1);
            }
            Collections.reverse(a);
            Iterator<Integer> it = a.iterator();
            int i = 0;
            while(it.hasNext() && it.next() == 0){
                i++;
            }
            a.subList(0 , i).clear();
            return a;
        }
    }

}
