// 1. double 与 整型的除法
// 2. 字符串的拼接
// 3. 字符串的格式化（扩展）StdOut.printf()
public class Average {

    private Average() {}

    public static void main(String[] args) {
        double total = 0.0;
        int i = 0;
        while(!StdIn.isEmpty()) {
            double temp = StdIn.readDouble();
            total += temp;
            i++;
        }
        double avg = total / i;
        StdOut.println("avg: " + avg);
        StdOut.printf("avg: %f%n", avg);
    }

}
