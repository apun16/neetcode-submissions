class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();

        // count characters in s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } 
            else {
                map.put(c, 1);
            }   
        }
        // subtract using t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}

/*
HashMap implements an associative array; map keys to values. 
When you put a key-value pair into a HashMap, the map passes key through Hash Function -> takes key + calculates integer ("hash code")
HashMap maintains an internal array (often called "buckets"); hash code is used to calculate an index in this array

HashMaps do not maintain order. If you need to retrieve items in alphabetical or numerical order, use a TreeMap or a sorted list
If you only have 5 or 10 items, the overhead of calculating hashes and managing the bucket array might actually be slower than a simple array search

When to Use a HashMap:
1. Frequency Counting
If you need to count how many times items appear in a dataset (like the anagram problem we discussed), a HashMap is the gold standard.

2. Caching (Memoization)
If you have a function that performs expensive calculations, you can store the results in a HashMap. Before running the calculation again, check if the "key" (input) already exists in the map.

3. Fast Lookups
Whenever you find yourself nested in loops trying to find a specific item—stop. If you can map your data by a unique identifier (ID, email, SSN), you can jump directly to that data in $O(1)$ time rather than searching a list in $O(n)$ time.

4. Relationship Mapping
Mapping a user to their permissions, a product ID to its price, or a country to its capital.

# Initialization
my_map = {} 
# or my_map = dict()

# Adding/Updating pairs
my_map["apple"] = 5
my_map["banana"] = 10

# Accessing (Throws KeyError if key doesn't exist)
price = my_map["apple"]

# Safe Access (Returns None or a default value)
price = my_map.get("orange", 0)

# Deleting
del my_map["apple"]

# Iterating
for key, value in my_map.items():
    print(f"{key}: {value}")

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialization (Key: String, Value: Integer)
        HashMap<String, Integer> map = new HashMap<>();

        // Adding/Updating pairs
        map.put("Apple", 50);
        map.put("Banana", 30);

        // Accessing
        int price = map.get("Apple");

        // Safe Access (Returns default if key missing)
        int orangePrice = map.getOrDefault("Orange", 0);

        // Checking existence
        if (map.containsKey("Apple")) {
            System.out.println("Apple is in the map");
        }

        // Deleting
        map.remove("Banana");

        // Iterating
        for (String key : map.keySet()) {
            System.out.println(key + " costs " + map.get(key));
        }
    }
}

1. put(key, value)
Stores a key-value pair in the map.
map.put('a', 3);

This means:
Store the key 'a' with value 3.

If 'a' is not already in the map, it gets added.
If 'a' already exists, its value is updated.

2. get(key)
Retrieves the value associated with a key.

map.get('a');
Returns the value (e.g., 3) if the key exists.
Returns null if the key does not exist.

3. containsKey(key)
Checks whether a key exists in the map.

map.containsKey('a');
Returns true if the key exists.
Returns false if it does not.

4. : in a loop
Used in a for-each loop.
for (char c : s.toCharArray())

This means:
Loop through each character in the string s.

Equivalent to:
char[] arr = s.toCharArray();
for (int i = 0; i < arr.length; i++) {
    char c = arr[i];
}
Example together
if (map.containsKey(c)) {
    map.put(c, map.get(c) + 1);
} else {
    map.put(c, 1);
}
If the character already exists in the map, increase its count.
If it does not exist, add it with count 1.
Simple way to think about it

A Map is like a lookup table:
put → add or update a value
get → read a value
containsKey → check if something exists
*/