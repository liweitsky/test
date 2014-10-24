package com.java.eight;

public class Main {
 
 @FunctionalInterface
 interface Action {
   void run(String s);
 }
 
 public void action(Action action){
   action.run("Hello!");
 }
 
 public static void main(String[] args) {
   new Main().action((String s) -> System.out.print("*" + s + "*"));
  }
 }