## ✨前言
众所周知，算法与JVM、源码以及高并发等并列，是大厂的必考知识点之一。因此，掌握数据结构与算法是很有必要的！
笔记分为**数据结构**与**算法**两大部分，从最基础的算法开始，从零开始掌握，争取每天能够学会一种数据结构/算法即可。
## 🚀快速开始
常见的排序算法有6种，分别为：冒泡排序、选择排序、插入排序、希尔排序、归并排序以及快速排序，下面全部十种经典排序算法的时间与空间复杂度表。
![img](https://img-blog.csdnimg.cn/img_convert/3af26595b2dbc49047a0c66e7ad4fd0f.png)
### 1.冒泡排序

> 实现思想：像水中的泡泡一样，按照从小到大或者从大到小的顺序(一般是从小到大)，依次将每一个元素遍历对比后面的元素取出来最小(大)的放到最前面的位置。

```java
package deepinsea;

import java.util.Arrays;

/**
 * @author deepinsea
 * @data 2021/6/10 13:44
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,8,5,6,9,7,1};
        System.out.println(Arrays.toString(arr));
        bubble(arr);	
        System.out.println(Arrays.toString(arr));
    }
    public static int[] bubble(int[] arr){
        // 外循环，需要遍历的元素个数
        for (int i = 0; i < arr.length-1; i++) {
            // 内循环，元素遍历的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
```
### **下一节**👉 [02 选择排序](./十大经典排序算法/02%20选择排序.md)