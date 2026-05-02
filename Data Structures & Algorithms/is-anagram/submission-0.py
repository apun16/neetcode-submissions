class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        return sorted(s) == sorted(t)


## previous logic
# convert srings to lists of chars and see if char[i] exists in char[j] 
# and continue unitl full lists are checked then true else false
# 
# sorted() creates a new list to store the characters; scales linearly