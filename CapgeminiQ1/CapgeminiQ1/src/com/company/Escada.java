package com.company;

public class Escada {
    private int stars;

    public void setStars(int stars) {
        this.stars = stars;
    }

    public static void makeEscada(int stars){
        int count = stars - 1;
        for(int i = 0; i < stars; i++)
        {
            for(int a = 0; a < stars; a++)
            {
                if(a < count) {
                    System.out.print("  ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println();
            count = count - 1;
        }

    }
}
