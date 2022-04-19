package BookDemo;

import org.jetbrains.annotations.NotNull;

public class SortTest {

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 10};
        SortTest st = new SortTest();
        st.mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /* 冒泡排序 O(n^2)
算法思想：
从数组中第一个数开始，依次遍历数组中的每一个数，通过相邻比较交换，每一轮循环下来找出剩余未排序数的中的最大数并”冒泡”至数列的顶端。

算法步骤：
（1）从数组中第一个数开始，依次与下一个数比较并次交换比自己小的数，直到最后一个数。
    如果发生交换，则继续下面的步骤，如果未发生交换，则数组有序，排序结束，此时时间复杂度为O(n)；
（2）每一轮”冒泡”结束后，最大的数将出现在乱序数列的最后一位。重复步骤（1）。

稳定性：稳定排序。

时间复杂度： O(n)至O(n2)，平均时间复杂度为O(n2)。

最好的情况：如果待排序数据序列为正序，则一趟冒泡就可完成排序，排序码的比较次数为n-1次，且没有移动，时间复杂度为O(n)。

最坏的情况：如果待排序数据序列为逆序，则冒泡排序需要n-1次趟起泡，每趟进行n-i次排序码的比较和移动，即比较和移动次数均达到最大值：
比较次数:Cmax=∑i=1n−1(n−i)=n(n−1)/2=O(n2)
移动次数等于比较次数，因此最坏时间复杂度为O(n2)。
    */

    public void bobbleSort(int arr[], int length) {
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /* 选择排序 O(n^2)
原理：从所有记录中选出最小的一个数据元素与第一个位置的记录交换；
     然后在剩下的记录当中再找最小的与第二个位置的记录交换，循环到只剩下最后一个数据元素为止。

稳定性：不稳定排序。

时间复杂度： 最坏、最好和平均复杂度均为O(n2)，因此，简单选择排序也是常见排序算法中性能最差的排序算法。
           简单选择排序的比较次数与文件的初始状态没有关系，在第i趟排序中选出最小排序码的记录，需要做n-i次比较，
           因此总的比较次数是：∑i=1n−1(n−i)=n(n−1)/2=O(n2)。
     */

    public void selectSort(int arr[], int length) {
        int index;
        int temp;
        for (int i = 0; i < length; i++) {
            index = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[index] < arr[j]) {
                    index = j;      //找到最小的下标
                }
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    /*直接插入排序 O(n^2)
    算法描述
原理：从待排序的n个记录中的第二个记录开始，依次与前面的记录比较并寻找插入的位置，每次外循环结束后，将当前的数插入到合适的位置。

稳定性：稳定排序。

时间复杂度： O(n)至O（n2），平均时间复杂度是O（n2）。

最好情况：当待排序记录已经有序，这时需要比较的次数是Cmin=n−1=O(n)。

最坏情况：如果待排序记录为逆序，则最多的比较次数为Cmax=∑i=1n−1(i)=n(n−1)2=O(n2)
     */

    public void insertSort(int arr[], int length) {
        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else break;
            }
        }
    }

    /*希尔排序（插入排序变种版） O(n^1.3)
   Shell 排序又称缩小增量排序, 由D. L. Shell在1959年提出，是对直接插入排序的改进。

原理： Shell排序法是对相邻指定距离(称为增量)的元素进行比较，并不断把增量缩小至1，完成排序。
Shell排序开始时增量较大，分组较多，每组的记录数目较少，故在各组内采用直接插入排序较快，
后来增量di逐渐缩小，分组数减少，各组的记录数增多，但由于已经按di−1分组排序，文件叫接近于有序状态，
所以新的一趟排序过程较快。因此Shell排序在效率上比直接插入排序有较大的改进。
在直接插入排序的基础上，将直接插入排序中的1全部改变成增量d即可，因为Shell排序最后一轮的增量d就为1。
稳定性：不稳定排序。
时间复杂度：O(n1.3)到O(n2)。Shell排序算法的时间复杂度分析比较复杂，
实际所需的时间取决于各次排序时增量的个数和增量的取值。研究证明，若增量的取值比较合理，Shell排序算法的时间复杂度约为O(n1.3)。
对于增量的选择，Shell 最初建议增量选择为n/2，并且对增量取半直到 1；D. Knuth教授建议di+1=⌊di−13⌋序列。
     */

    public void shellSort(int arr[], int length) {
        for (int i = length / 2; i > 0; i /= 2) {
            //  i控制循环的步长
            for (int j = i; j < length; j++) {
                //j控制循环的起始位置
                for (int k = j; k < length; k += i) {
                    if (arr[k] > arr[k + i]) {
                        int temp;
                        temp = arr[k];
                        arr[k] = arr[k + i];
                        arr[k + i] = temp;
                    } else break;
                }
            }
        }
    }


    /* 快数排序 O（nlog2n）至O(n2)，平均时间复杂度为O（nlgn）
算法原理：
(1)从待排序的n个记录中任意选取一个记录（通常选取第一个记录）为分区标准;

(2)把所有小于该排序列的记录移动到左边，把所有大于该排序码的记录移动到右边，中间放所选记录，称之为第一趟排序；

(3)然后对前后两个子序列分别重复上述过程，直到所有记录都排好序。

稳定性：不稳定排序。

时间复杂度： O（nlog2n）至O(n2)，平均时间复杂度为O（nlgn）。

最好的情况：是每趟排序结束后，每次划分使两个子文件的长度大致相等，时间复杂度为O（nlog2n）。

最坏的情况：是待排序记录已经排好序，第一趟经过n-1次比较后第一个记录保持位置不变，
          并得到一个n-1个元素的子记录；第二趟经过n-2次比较，将第二个记录定位在原来的位置上，
           并得到一个包括n-2个记录的子文件，依次类推，这样总的比较次数是：

Cmax=∑i=1n−1(n−i)=n(n−1)/2=O(n2)
     */

    public void quickSort(int arr[], int low, int high) {
        if (low >= high) return;
        int left = low;
        int right = high;
        int key = arr[left];
        int temp;
        while (left != right) {
            // 从右边找到第一个比temp 小的数字
            while (arr[right] >= key && left < right) {
                right--;
            }
            arr[left] = arr[right]; //发现小于基准的替换将其替换到左半区
            //从左边找到第一个比temp大的数
            while (arr[left] <= key && left < right) {
                left++;
            }
            arr[right] = arr[left]; //发现大于基准的将其替换到右半区

        }
        arr[left] = key;
        quickSort(arr, low, left - 1);
        quickSort(arr, left + 1, high);
    }

    /*堆排序
     将序列构建成大跟堆（小根堆)。
     */
    public void heapSort(int arr[]) {

    }

    /*
     交换数组中 arr[a] 与arr[b] 的位置
     */

    public void swap(int arr[], int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /*归并排序算法   O(nlogn)
    归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，
    即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列。
     */

    public void mergeSort(int arr[], int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    public void merge(int arr[], int low, int mid, int high) {
        int i = low; //左边指针
        int j = mid + 1; //右边指针
        int k = 0;
        int temp[] = new int[high - low + 1];

        //把整个数组中小的数字放入temp中
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        //把左边剩余的放入temp
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //右边同上
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        for (int m = 0; m < temp.length; m++) {
            arr[m + low] = temp[m];
        }

    }
}
