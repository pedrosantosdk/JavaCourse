package com.javacourse.lesson20;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        double[][] studentGrades = new double[3][4];

        studentGrades[0][0] = 10;
        studentGrades[0][1] = 7;
        studentGrades[0][2] = 9;
        studentGrades[0][3] = 9.5;

        studentGrades[1][0] = 9;
        studentGrades[1][1] = 8;
        studentGrades[1][2] = 7;
        studentGrades[1][3] = 9;

        studentGrades[2][0] = 6;
        studentGrades[2][1] = 8;
        studentGrades[2][2] = 9;
        studentGrades[2][3] = 7.5;

        // We can use a for loop inside another for loop to get the elements of a two-dimensional array:
        for (int i = 0; i < studentGrades.length; i++){
            for (int j = 0; j < studentGrades[i].length; j++){
                System.out.print(studentGrades[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Calculating the average of each student: ");

        double sum = 0;
        for (int i = 0; i < studentGrades.length; i++){
            sum = 0;
            for (int j = 0; j < studentGrades[i].length; j++){
                sum += studentGrades[i][j];
            }
            System.out.println("Student " + (i+1) + " average is = " + (sum/4));
        }

        // To create a two-dimensional array, add each array within its own set of curly braces:
        double[][] student2Grades = {{7, 8, 9, 10}, {8, 6, 7, 10}};

        System.out.println("Student 2 Grade Array Output: ");

        for (int i = 0; i < student2Grades.length; i++){
            for (int j = 0; j < student2Grades[i].length; j++){
                System.out.print(student2Grades[i][j] + " ");
            }
            System.out.println();
        }


    }
}
