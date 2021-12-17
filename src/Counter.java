// 1. 类方法的创建
// 2. final关键字
// 3. 使用implements关键字为类实现Comparable接口
// 4. @override装饰器的使用
// 5. 使用new关键字对类进行实例化
// 6. 创建特定类的数组
public class Counter implements Comparable<Counter>{
    private final String name;
    private int count = 0;
    public Counter(String id) {
        this.name = id;
    }
    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    public String toString() {
        return count + " " + name;
    }

    @Override
    public int compareTo(Counter counter) {
        if (this.count > counter.count) return +1;
        if (this.count < counter.count) return -1;
        return 0;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        Counter[] his = new Counter[n];
        for (int i=0; i<n; i++) {
            his[i] = new Counter("counter" + i);
        }

        for (int i=0; i<trials; i++){
            int index = StdRandom.uniform(n);
            his[index].increment();
        }

        for (int i=0; i<n; i++){
            StdOut.println(his[i]);
        }

    }

}
