package com.learning.day10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Interview {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,1,5,3,7,3,20,32,9,1,2,5,7,9);
       int minL = list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
       int maxH= list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();

        System.out.println(addTwoStringNumbers("11111234567890", "2987645367890976522"));

    }

    public static String addTwoStringNumbers(String num1, String num2){
          int n1= num1.length()-1;
          int n2= num2.length()-1;

          int carry =0;

          StringBuilder ans= new StringBuilder();

          while(n1>=0 || n2>=0){
              if(n1<0){
                  int  number2 = num2.charAt(n2) -'0';
                  int sum = number2+carry;
                  carry= sum/10;
                  int lastdigit = sum%10;
                  ans.append((char)(lastdigit+'0'));
                  n2--;
              }else if(n2<0){
                  int  number1 = num1.charAt(n1) -'0';
                  int sum = number1+carry;
                  carry= sum/10;
                  int lastdigit = sum%10;
                  ans.append((char)(lastdigit+'0'));
                  n1--;
              }else{
                int  number1 = num1.charAt(n1) -'0';
                  int  number2 = num2.charAt(n2) -'0';
                  int sum = number1+number2+carry;
                   carry = sum/10;
                  int lastdigit = sum%10;
                  System.out.println(lastdigit);
                  ans.append((char) (lastdigit + '0'));
                 n1--;
                 n2--;
              }

          }
          return ans.reverse().toString();
    }

}
