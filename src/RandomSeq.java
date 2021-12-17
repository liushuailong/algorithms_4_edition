// 1. 将一个String转化为Int
// 2. 将一个String转化为Double
// 3. 生产一个0-1的随机数：StdRandom.uniform()
// 4. 生成一个lo-hi转化；之间的随机数：StdRandom.uniform(lo,hi)
// 5. 抛出自定义异常：throw
public class RandomSeq {

    public RandomSeq() {}

    public static void main(String[] args) {
        // 从命令行读取第一个参数，并转化为整数
        int n = Integer.parseInt(args[0]);
        int argsLength = args.length;
        // 判断当又一个参数时，返回0-1之间的随机数
        if (argsLength == 1) {
            for (int i = 0; i < n; i++) {
                // 生产随机数
                double temp = StdRandom.uniform();
                StdOut.println(temp);
            }
        } else if (argsLength == 3) {
            // 判断当有三个参数时， 返回lo-hi之间的随机数
            double lo = Double.parseDouble(args[1]);
            double hi = Double.parseDouble(args[2]);
            for (int i=0; i < n; i++) {
                double temp = StdRandom.uniform(lo, hi);
                StdOut.println(temp);
            }
        } else {
            // 抛出异常
            throw new IllegalArgumentException("Invalid number of arguments");
        }
    }
}
