package Lesson10.Lesson10PracticaInterface;

public class Matrix implements IMatrix {

    private double[][] matrix;


    public Matrix(int rows, int cols) {
        matrix = new double[rows][cols];
    }


    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return 0;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex > this.getRows() || rowIndex < 0) {
            throw new IndexOutOfBoundsException("rowIndex>getRows");
        }
        if (colIndex > this.getColumns() || colIndex < 0) {
            throw new IndexOutOfBoundsException("colIndex>this.getColumns");
        }
        return matrix[rowIndex][colIndex];
    }
        @Override
        public void setValueAt ( int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {

        }

        @Override
        public IMatrix add (IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
            return null;
        }

        @Override
        public IMatrix sub (IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
            return null;
        }

        @Override
        public IMatrix mul (IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
            return null;
        }

        @Override
        public IMatrix mul ( double value){
            return null;
        }

        @Override
        public IMatrix transpose () {
            return null;
        }

        @Override
        public void fillMatrix ( double value){

        }

        @Override
        public double determinant () {
            return 0;
        }

        @Override
        public boolean isNullMatrix () {
            return false;
        }

        @Override
        public boolean isIdentityMatrix () {
            return false;
        }

        @Override
        public boolean isSquareMatrix () {
            return false;
        }

        @Override
        public void printToConsole () {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
