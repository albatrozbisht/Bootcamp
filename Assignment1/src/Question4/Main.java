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
            System.out.println("Sum of row "+(i+1)+" is: "+sum_r);
        }
//        sum of columns
        for(int i=0;i<arr.length;i++){
            int sum_c=0;
            for(int j=0; j<arr[0].length;j++){
                sum_c += arr[j][i];
            }
            System.out.println("Sum of column "+(i+1)+" is: "+sum_c);
        }
    }
}

//Output:
//        Sum of row 1 is: 6
//        Sum of row 2 is: 15
//        Sum of row 3 is: 24
//        Sum of column 1 is: 12
//        Sum of column 2 is: 15
//        Sum of column 3 is: 18