package com.company;
public class Avg {
    double []marks=new double[100];

    double avg;
    int end;
    public double setMarks() {
        double sum=0;
        for(int i = 0; i<=end; i++){
            sum+=marks[i];
        }
        avg = sum/(end);
        return avg;
    }

}
