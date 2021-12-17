// 1. 从命令行获取参数
// 2. 如何读取本地文件，并从文件中所有整数到一列表中: class In()  methods: readAllInts()
// 3. 向终端输出内容：StdOut.println()
// 4. 对数组进行排序：Arrays.sort()
// 5. 从终端中读入数据(整数)：StdIn.readInt()
// 6. 使用二分查找法查询给定的一个整数是否在一个整数数组内
import java.util.Arrays;

public class BinarySearch {

    // 该类不可以被实例化；
    private BinarySearch() {};

    // 使用二分查找法判断给定的一个整数是否在一个整数数组中，在返回索引，不在返回 -1
    public static int indexOf(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > key) hi = mid -1;
            else if (arr[mid] < key )  lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        // 读取文件
        // In inputFile = new In(args[0]);
        In inputFile = new In("tinyAllowlist.txt");
        int[] allowList = inputFile.readAllInts();
        // 对数组进行排序
        Arrays.sort(allowList);
        // 循环从终端中数字，如果该数字不存在allowlist数组中，则输出该数字，否则输出该数字在数组的下标。
        while(!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int index = BinarySearch.indexOf(allowList, key);
            if (index == -1) {
                StdOut.println(key);
            } else {
                StdOut.println(index);
            }
        }
    }

}
