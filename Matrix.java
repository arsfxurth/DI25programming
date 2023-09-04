public class Matrix {
    public int[][] matrix;
    public int[][] resultMatrix;
    public void matrix(){
        matrix = new int[5][5];
    }
    public void matrix(int a, int b){
        matrix = new int[a][b];
    }
    public void add(int row, int column, int value){
        if(row > 0 && row <= matrix.length && column > 0 && column <= matrix[0].length){
            matrix[column - 1][row - 1]=value;
        }
        else{
            System.out.println("Некорректный ввод данных");
        }
    }
    public int[][] multiply(Matrix matrix2){
        resultMatrix = new int[matrix.length][matrix[0].length];
        if(matrix[0].length != matrix2.matrix.length){
            System.out.println("Умножение невозможно");
            return null;
        }
        else{
            for(int i = 0; i < matrix.length; i++){
                for(int a = 0; a < matrix[0].length; a++){
                    resultMatrix[i][a] += matrix[i][a] * matrix2.matrix[i][a];
                }
            }
        }
        return resultMatrix;
    }
    @Override
    public String toString(){
        String list = "Итоговая матрица \n";
        for(int i = 0; i < matrix.length; i++){
            for(int a = 0; a < matrix[0].length; a++){
                list += resultMatrix[i][a] + " ";
            }
            list += "\n";
        }
        return list;
    }
}
