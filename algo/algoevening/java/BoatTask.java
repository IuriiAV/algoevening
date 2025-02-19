package algoevening.java;

import java.util.Arrays;

public class BoatTask {

    public static void main(String[] args) {
        int[] people = {10, 55, 70, 20, 90, 85};
        int[] people2 = {10,10,90,90};
        System.out.println(getNumberOfBoats(people,100));  //4
        System.out.println(getNumberOfBoats(people2,100)); //2
        System.out.println(getNumberOfBoats(new int[]{90,90,90,90,10,10,10,10}, 100)); // 4
        System.out.println(getNumberOfBoats(new int[]{2,3,70,80,90}, 100)); //30,70,95,99 // 3
        System.out.println(getNumberOfBoats(new int[]{1,29,70,95,99}, 100)); //30,70,95,99 //3

    }

    public static int getNumberOfBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boat = 0;
        // {10, 20, 55, 70, 85, 90};
        int currentWeight = 0;
        while (left <= right) {
            currentWeight = people[left] + people[right]; // 90 + 10 , 20 + 85, 90
            while (currentWeight <= limit && left < right) {
                  left ++;  // 1(20)//2(55)
                  currentWeight = currentWeight + people[left]; //110, 145
            }
            boat ++; //1//2//3
            right--; //4 (85)// 3 (70), //2 (55)
        }
//        if(left == right) {
//            boat++;
//        }

        return boat;
    }
}
