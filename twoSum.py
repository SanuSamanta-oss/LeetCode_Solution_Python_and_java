class Solution:
    def twoSum(self,nums,target):
        output = []
        for i in range(len(nums)):
            for j in range(i):
                if ((nums[i] + nums[j]) == target):
                    output.append(j)
                    output.append(i)
                    return output

# nums = [2, 7, 21, 4]
# target = 9
# solution = Solution()
# print(solution.twoSum(nums,target))

# Time Complexity: O(n²)
# Space Complexity: O(1)