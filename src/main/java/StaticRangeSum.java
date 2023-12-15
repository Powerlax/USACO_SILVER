import java.util.Scanner;

public class StaticRangeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        //compute prefix sum
        int[] prefix = new int[n+1];
        prefix[0] = 0; //placeholder to enable O(n) computation
        for (int i = 1; i<=n; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i = 0; i<q; i++) {
            int l = scanner.nextInt()+1;
            int r = scanner.nextInt()+1;
            System.out.println(prefix[r]-prefix[l-1]);
        }
    }
}
