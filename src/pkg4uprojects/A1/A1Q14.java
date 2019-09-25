/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4uprojects.A1;

/**
 *
 * @author marley
 */
public class A1Q14 {

    //method that collects given data
    public static boolean splitArray(int[] a) {
        //put the array and empty groups/variable through the helper array
        return arrayHelper(a, 0, 0, 0);
    }

    //data goes in here
    public static boolean arrayHelper(int[] a, int start, int group1, int group2) {
        //base case
        //if starting position is greater/equal to the length of a...
        if (start >= a.length) {
            //returns true or false
            return group1 == group2;
        }

        //add to the first group, if possible
        if (arrayHelper(a, start + 1, group1 + a[start], group2)) {
            //returns true
            return arrayHelper(a, start + 1, group1 + a[start], group2);

        } else {
            //returns true/false if adding to the second group is possible/impossible
            return arrayHelper(a, start + 1, group1, group2 + a[start]);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test code (2, 2)
        int[] twoTwo = {2, 2};
        System.out.println(splitArray(twoTwo));

        //test code (2, 3)
        int[] twoThree = {2, 3};
        System.out.println(splitArray(twoThree));

        //test code (5, 2, 3)
        int[] fiveTwoThree = {5, 2, 3};
        System.out.println(splitArray(fiveTwoThree));
    }

}
