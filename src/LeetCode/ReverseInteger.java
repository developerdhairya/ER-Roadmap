package LeetCode;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger =new ReverseInteger();
        Scanner scanner=new Scanner(System.in);
        int inp=scanner.nextInt();
        System.out.println(reverseInteger.solution(inp));
    }



    public int solution(int num){
        boolean isNegative=false;
        if (num<0){
            num=Math.abs(num);
            isNegative=true;
        }
        long newNum=0;
        int rem;
        int i=0;

        while (num>0){
            rem=num%10;
            newNum=(newNum*10)+rem;
            num/=10;
            i+=1;
        }

        if (newNum< Integer.MAX_VALUE && newNum>Integer.MIN_VALUE){
            return isNegative?-1*(int)newNum:(int)newNum;
        }

        return 0;
    }




}











