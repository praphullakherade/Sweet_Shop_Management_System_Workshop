package com.sweetshopmanagementsystem;

import java.util.Set;

public class UserInterface   {
    void print(Set<Sweet> set){
//        for(int i = 0; i < set.size(); i++) {
//            System.out.println(set.get(i));
//        }
          for(Sweet sweet : set) {
              System.out.println(sweet);
          }
    }

    public void printDietSweets(Set<Sweet> set) {
        for (Sweet sweet : set) {
            if (sweet instanceof IDiet) {
                System.out.println(sweet);
            }
        }
    }
    public void printNormalSweets(Set<Sweet> set){
            for(Sweet sweet : set){
                if(sweet instanceof INormal) {
                    System.out.println(sweet);
                }
            }
    }
}
