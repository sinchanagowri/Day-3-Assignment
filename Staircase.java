import java.io.*;


class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
          for(int i = n; i > 0 ; i--){
                        for(int j=1; j < i; j++){
                               System.out.print(" ");
                        }
                        for(int j = 0 ; j<= n-i ; j++){
                                System.out.print("#");
                        }
                        System.out.print("\n");
                }

}}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
