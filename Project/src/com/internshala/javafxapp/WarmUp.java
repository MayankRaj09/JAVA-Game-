package com.internshala.javafxapp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WarmUp {


    public static void main(String[] args) {

   int numArray[]= new int[101];

        for (int i = 0; i <100 ; i++) {
            numArray[i]=i;
        }


        //Java 8 Feature

        int numbersarray[]= IntStream.rangeClosed(0,100).toArray();


        List<Integer>numlist=new ArrayList<>();

        for(int i=0;i<101;i++){


            numlist.add(new Integer(i));
        }

        List<Integer>numbersList=IntStream.rangeClosed(0,100)
                .mapToObj(i->new Integer(i))
                .collect(Collectors.toList());




    }



}
