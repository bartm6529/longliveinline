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
public class A1Q16 {

    public static int knapsack(int index, int[] values, int[] weights, int maxWeight) {
        //base case
        //if there are no more objects
        if (index == 0) {
            //nothing can be put in the knapsack
            return 0;
        }

        //if the weight of an item is greater than the maximum weight...
        if (weights[index - 1] > maxWeight) {
            //take away that item, it cannot fit
            return knapsack(index - 1, values, weights, maxWeight);
            //if it's smaller than the maximum weight...
        } else {
            //find the first sum and second sums of data
            int sum1 = values[index - 1] + knapsack(index - 1, values, weights, maxWeight - weights[index - 1]);
            int sum2 = knapsack(index - 1, values, weights, maxWeight);

            //find the maximum value of the two sums
            return Math.max(sum1, sum2);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test code
        //index should be the length of the values. It represents how many items there are
        int testIndex = 3;
        int[] testValues = {60, 100, 120};
        int[] testWeights = {10, 20, 30};
        int testMaxWeight = 50;
        System.out.println(knapsack(testIndex, testValues, testWeights, testMaxWeight));
    }

}
