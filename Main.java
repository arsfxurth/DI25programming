public class Main {
    public static void main(String[] args) {
        Matrix Matrix = new Matrix();
        Matrix Matrix2 = new Matrix();
        Matrix2.matrix(2, 2);
        Matrix2.add(1,1, 2);
        Matrix2.add(2,1, 6);
        Matrix2.add(1,2, 2);
        Matrix2.add(2,2, 5);
        Matrix.matrix(2, 2);
        Matrix.add(1,1, 2);
        Matrix.add(2,1, 3);
        Matrix.add(1,2, 5);
        Matrix.add(2,2, 2);
        Matrix.multiply(Matrix2);
        System.out.println(Matrix);
    }
}
