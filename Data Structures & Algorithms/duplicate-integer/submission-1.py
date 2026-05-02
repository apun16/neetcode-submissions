class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        comp = set()
        for n in nums:
            if n in comp:
                return True
            comp.add(n)

        return False

# Notes - set (UNORDERED)
# A set cannot contain two items with the same value; duplicates are automatically ignored or removed
# set whenever you need to store unique elements and perform fast lookups
# BFS/DFS on graphs or matrices, use a set to keep track of nodes you have already visited to avoid infinite loops
# find common elements (intersection &), combine collections without duplicates (union |), or find unique elements in one group versus another (difference -)
# converting an existing list to a set (e.g., unique_items = set(my_list)) is the standard way to remove duplicate entries instantly

# Using curly brackets
## fruits = {"apple", "banana", "cherry"}
# Using the set() constructor (useful for converting other iterables)
## numbers = set([1, 2, 2, 3])  # Result: {1, 2, 3}
# Note: Use set() for an empty set; {} creates an empty dictionary
## empty_set = set()

# add(x)
# - Adds a single element x
# remove(x)
# - Removes x; raises an error if not found.
# union(other)
# - Combines elements from both sets
# intersection(other)
# - Returns only items common to both sets
# difference(other)
# - Returns items in the first set but not the second