// 1. 取数组中的最后一个元素
// 2. 读取文件中的内容
// 3. 字符串写入文件
public class Cat {
    private Cat() {}

    public static void main(String[] args) {
        Out out = new Out(args[args.length - 1]);
        for (int i= 0; i < args.length - 1; i++) {
            In in = new In(args[i]);
            String temp = in.readAll();
            out.println(temp);
            in.close();
        }
        out.close();
    }
}
