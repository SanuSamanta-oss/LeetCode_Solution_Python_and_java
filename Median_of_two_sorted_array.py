class Solution(object):
    def findMedianSortedArray(self , nums1 , nums2):

        arr = nums1 + nums2
        arr.sort()
        n = len(arr)

        if (n % 2) == 1:
            return n // 2
        else:
            mid1 = arr[n // 2 - 1]
            mid2 = arr[n // 2]

            return (mid1 + mid2) / 2.0



nums1 = list(map(int , input("Enter the elements of number one array: ").split()))
nums2 = list(map(int , input("Enter the elements of number two array: ").split()))

obj = Solution()
answer = obj.findMedianSortedArray(nums1, nums2)
print("Median of two sorted array: ",answer)

# Time Complexity: O((m + n) log(m + n))
# Space Complexity: O(m + n)