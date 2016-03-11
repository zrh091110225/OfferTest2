# 剑指Offer笔试题2

*题目来源：*[牛客网](http://www.nowcoder.com/ta/coding-interviews?page=1)

### 题目一 调整数组序列使奇数位于偶数序列前

**描述:**  
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/ReOrderArrayTest.java)  

*要求:奇数和奇数,偶数和偶数的相对位置不变*
解法一: 从最后面开始,两个两个比较,如果遇到相邻两个数左边的是偶数,右边的是奇数,则互换位置;否则换下一个; 时间复杂度较高O(n^2);
解法二: 在新建两个数组,分别存放奇数和偶数,一次遍历后将奇偶分开存入数组,然后在将两个数组中的数据返回,时间复杂度较低,但是空间复杂度较高;(未给出代码)


### 题目二 链表中倒数第k个节点

**描述:**  
输出链表中倒数第k个节点;

**解题思路:**

解法一: 使用栈,该方法会消耗较大资源,不建议使用;
解法二: 先复制两个节点,第一个节点从头走到k的位置; 然后两个节点以前执行.next,当第一个节点走到链表尾时,第二个节点即走到倒数k的位置;(该解法时间复杂度只有O(n),目前为止最佳解法)

### 题目三 反转链表

**描述:**  
输入一个链表，反转链表后，输出链表的所有元素。