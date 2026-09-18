class Solution(object):
    def lengthLongestofSubstring(self, s):
        seen = set()
        left = 0
        maximum = 0

        for right in range(len(s)):
            while s[right] in seen:
                seen.remove(s[left])
                left += 1

            seen.add(s[right])

            maximum = max(maximum , right - left + 1)

        return maximum

str = input("Enter a string (with or without duplicagte characters): ")

obj = Solution()
print("Longest Substring length : ", obj.lengthLongestofSubstring(str))

# Time Complexity = O(n)
# Space Complexity: O(n)