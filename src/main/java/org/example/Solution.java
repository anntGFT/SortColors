package org.example;

public class Solution {

    public Solution(){

    }

    public void sortColors(int[] nums){

        int red = 0, white = 0, blue = 0, count = 0;

        for (int num : nums) {

            if (num == 0) {

                red++;
            } else if (num == 1) {

                white++;
            } else {

                blue++;
            }
        }

            while(red != 0){

                nums[count] = 0;
                count ++;
                red --;
            }

            while(white != 0){

                nums[count] = 1;
                count ++;
                white --;
            }

            while(blue != 0){

                nums[count] = 2;
                count ++;
                blue --;
            }
    }
}