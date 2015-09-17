package ru.omgtu.Labs.Lab_1.Task_12;

import java.util.Scanner;

//Найти такую точку заданного на плоскости множества точек, сумма расстояний от которой до остальных минимальна.
public class Main {
    public static void main(String[] args) {
        int n = 3;
        Dot dot[]  = new Dot[n];
        double[] sumOfDistances = new double[n];


        dot[0] = new Dot(6,3,12);
        dot[1] = new Dot(2,-31,2);
        dot[2] = new Dot(8,24,5);



        for(int i = 0; i < n; i++) {
            for(int j = 1; j < n-1; j++)
                sumOfDistances[i] += dot[i].distanceTo(dot[j]);
        }

        int id = minDistancesDot(sumOfDistances, n);

        System.out.println("Сумма растояний от точки с координатами: ("+
                dot[id].x+","+dot[id].y+","+dot[id].z+") минимальна");


    }

    public static int minDistancesDot(double[] sumOfDistances, int numberOfdots)
    {
        double minSumOfDistances = 0;
        int idOfMinDot = 0;

        for(int i = 0; i < numberOfdots; i++)
        {
            if(minSumOfDistances > sumOfDistances[i])
            {
                minSumOfDistances = sumOfDistances[i];
                idOfMinDot = i;
            }
        }
        return idOfMinDot;
    }
}
