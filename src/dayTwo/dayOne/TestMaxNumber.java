package dayTwo.dayOne;

import java.util.ArrayList;
import java.util.List;
/*
1. set int maxElement to the first element of the list
2. Iterate through the list and compare the declared max value to the current element of the list
3. if the current element of the list is grater then the declared maximum, set maxElement to the current element in the list.
 */
public class ReturnMax {
    public static int returnMaximumElement(List<Integer> list){
        int maxElement=list.get(0);
        for(Integer i : list){
            if(i>maxElement){
                maxElement=i;
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(8);
        list.add(2);
        list.add(19);
        System.out.println(returnMaximumElement(list));
    }
}