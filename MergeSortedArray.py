"""
合并两个有序数组：
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
说明:
初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
示例:
输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
"""
class Solution:
    def merge(self, nums1, m: int, nums2, n: int):
        """
        Do not return anything, modify nums1 in-place instead.
        """
        last = m+n-1
        while n>0 and m>0:
            if nums2[n-1] >= nums1[m-1]:
                nums1[last] = nums2[n-1]
                n-=1
            else:
                nums1[last]=nums1[m-1]
                m-=1
            last = last - 1

        if n>0:
            for i in range(0, n):
                nums1[i] = nums2[i]
        return nums1
s=Solution()
print(s.merge([2,0],1,[1],1))
print(s.merge([4,5,6,0,0,0],3,[1,2,3],3))
