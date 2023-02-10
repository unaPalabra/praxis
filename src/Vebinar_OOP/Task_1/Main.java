package Vebinar_OOP.Task_1;

import Vebinar_OOP.Task_1.Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 3);

//        System.out.println(matrix.getH());
//        System.out.println(matrix.getW());
//        matrix.pprint();

        Matrix m = new Matrix(new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        });
        m.pprint();
        System.out.println(m.getH());
        System.out.println(m.getW());

        m.sum(10);
        m.pprint();

        matrix.sum(-5);
        matrix.pprint();

        m.sum(matrix);

        Matrix n = new Matrix(new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        });

        m.sum(n);
        m.pprint();
    }
}