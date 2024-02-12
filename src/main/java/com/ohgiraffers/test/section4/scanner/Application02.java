package com.ohgiraffers.test.section4.scanner;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. Scanner 의 nextLine() 과 next() 에 대해 구분하여 사용할 수 있디.*/
        /* 필기.
        * nextLine() : 공백을 포함한 한 중을 입력을 위한 개행문자 전 까지 읽어서 문자열로 반환한다.(공백문자 포함)
        * next() : 공백문자나 개행문자 전까지를 읽어서 문자열로 반환한다. (공백문자 포함하지 않음)
        * */

        /* 목차. 1. Scanner 객체 생성 */
        Scanner sc = new Scanner(System.in);

        /* 목차2. 문자열 입력*/
        /* 목차. 2-1. nextLine() */
        System.out.print("인사말을 입력해주세요 : ");
        String greeting = sc.nextLine(); // 안녕하세요 반갑습니다.
        System.out.println(greeting);

        /* 목차. 2-2. next() */
        System.out.print("인사말을 입력해주세요 : ");
        String greeting2 = sc.next();
        System.out.println(greeting2); // 공백을 포함하지 않기 떄문에 출력하면 안녕하세요 반갑습니다 출력 하면 안녕하세요 만 나온다
        // 따로 관리를 하고 있기 떄문에 공백이 나오지 않고 따로 관리한다.



    }
}
