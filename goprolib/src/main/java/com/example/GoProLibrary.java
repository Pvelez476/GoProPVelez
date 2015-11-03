package com.example;

public class GoProLibrary {

        int goproSelect;

        public GoProLibrary(String name){
            System.out.println("The GoPro you need is: " + name);

        }
        public void setPrice( int price) { goproSelect = price; }

        public int getPrice( ){
            System.out.println("The Price is :" + goproSelect);
            return goproSelect;

        }

        public static void main (String []args){
            GoProLibrary myGopro = new GoProLibrary("Hero+");

            myGopro.setPrice(0b11000111);

            myGopro.getPrice( );

        }
    }


