// 1. 获取i-n之间的随机整数: i + (int)(Math.random() * (i +1))
// 2. 交换两个数的值
// 3. 从终端读取所有字符串：StdOut.readAllStrings()

public class Knuth {

    private Knuth() {}

    public static void shuffle(Object[] a) {
        int n = a.length;
        for (int i=0; i < n; i++) {
            int chi = (int)(Math.random() * (i + 1));
            Object swap = a[chi];
            a[chi] = a[i];
            a[i] = swap;
        }
    }

    public static void shuffleAlternative(Object[] a) {
        int n = a.length;
        for (int i=0; i < n; i++) {
            int chi = i + (int)(Math.random() * (n-i));
            Object swap = a[chi];
            a[chi] = a[i];
            a[i] = swap;
        }

    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        for (int i=0; i < a.length; i++) {
            StdOut.println(a[i]);
        }

        Knuth.shuffle(a);

        System.out.println("-____________________________________");
        for (int i=0; i < a.length; i++) {
            StdOut.println(a[i]);
        }

        Knuth.shuffleAlternative(a);

        System.out.println("-____________________________________");
        for (int i=0; i < a.length; i++) {
            StdOut.println(a[i]);
        }



    }
}
