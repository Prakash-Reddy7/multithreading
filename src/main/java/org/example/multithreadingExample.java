package org.example;

public class multithreadingExample {
    public static void main(String[] args) {
     Thread1 obj1= new Thread1();
     Thread2 obj2= new Thread2();
     obj2.start();
     obj1.show();

    }
}
  class Thread1 extends  Thread{
      public void show(){
          System.out.println("Thread1 is running");

     }
  }
  class Thread2 extends  Thread{
    public  void run(){
        System.out.println("Thread2 is running");
    }
  }
