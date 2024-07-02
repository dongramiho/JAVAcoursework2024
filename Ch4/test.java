public class test {
    public static void main(String[] args) {
        int N = 5;
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
        a[i] = i;
        for (int i = 1; i < N; i++)
        if (a[i - 1] < a[i]) {
           int t = a[i];
           a[i] = a[i - 1];
           a[i - 1] = t;
        }
        for (int i = 0; i < N; i++)
        System.out.println(a[i]); }
    }
