import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        N = Integer.parseInt(scan.nextLine());
        String values = scan.nextLine();
        int[] arr = new int[N];
        arr = Arrays.stream(values.trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = 0;
        int res1 = 0;
        int res2 = 0;
        for (int i = 0; i < N; i++) {
            if(i == 0) {
                max = Math.abs(arr[i]-arr[i+1]);
                res1 = arr[i];
                res2 = arr[2];
            }
            if (i != N - 1) {
                if (Math.abs(arr[i] - arr[i + 1]) < Math.abs(max)) {
                    max = Math.abs(arr[i] - arr[i + 1]);
                    res1 = arr[i];
                    res2 = arr[i + 1];
                }
            }
        }
            System.out.print(res1 + " ");
            System.out.print(res2);



    }
}