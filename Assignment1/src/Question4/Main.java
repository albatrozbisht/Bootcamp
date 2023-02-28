package Question4;

public class Main {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        sum of rows
        for(int i=0;i<arr.length;i++){
            int sum_r=0;
            for(int j=0; j<arr[0].length;j++){
                sum_r += arr[i][j];
            }
            System.out.println("Sum of "+i+"th row: "+sum_r);
        }
//        sum of colums
        for(int i=0;i<arr.length;i++){
            int sum_c=0;
            for(int j=0; j<arr[0].length;j++){
                sum_c += arr[j][i];
            }
            System.out.println("Sum of "+i+"th column: "+sum_c);
        }
    }
}

//Output:
//        Sum of 0th row: 6
//        Sum of 1th row: 15
//        Sum of 2th row: 24
//        Sum of 0th column: 12
//        Sum of 1th column: 15
//        Sum of 2th column: 18