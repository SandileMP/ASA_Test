package com.example.demo;

import javax.validation.constraints.Max;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

        public int solution(int[] A) {
            // write your code in Java SE 8
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i<A.length; i++){
                integers.add(A[i]);
        }
            int small = 0;
            Collections.sort(integers);
            for (int i = 0; i< integers.get(integers.size()-1); i++){
                if (integers.get(i)<i) {
                    if (!integers.contains(integers.get(i))) {
                        small = i;
                    }
                }
            }
            Integer integer = integers.get(integers.size() - 1);
            int next = integer+1;
            return small;
        }
    public int solutionB(int[] A) {
        // write your code in Java SE 8
        int small = 0;
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i<A.length; i++){
            if ( i < A[i]){
                for (int j = 0; j<A.length; j++){
                    if (i != A[j]){
                        small = i;
                    }
                }
            }
        }

        return small;
    }

    public int solutionC(int [] a){
            int hit = 0;
            for (int i = 0; i<a.length; i++){
                if (a[i] == -1){
                    hit++;
                }
            }
            return a.length-hit;

    }
    public String solutionD(String message, int K) {
            if (message.length() == K){
                return message;
            }else {
                String[] s = message.split(" ");
                String modified = "";
                String temp = "";
                for (int part = 0; part< s.length; part++){
                    if (modified.length()<=K) {
                        modified = modified + " " + s[part];
                        temp  = s[part];
                        modified = modified.trim();
                    }
                }
              if (modified.length()>K){
                  modified = modified.replace(temp, "");
                  modified = modified.trim();
                  System.out.println(modified.length());
              }


                return modified.trim();
            }

    }
    public static void main(String[] args) {
            int [] a = {1, 4, -1, 3, 2};
            String mess = "The quick brown fox jumps over the lazy dog";
            String s = new Solution().solutionD(mess, 39);
            System.out.println(s);

    }

}
