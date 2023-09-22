# CS497-HW2
1. The algorithm runs through the array once, generating a hashmap of the values and frequency. If a value is found in     the map, its frequency is retrieved, incremented, and stored. If it is not found, it is stored with a frequency of 1.    The frequency is then retrieved and checked to see if it is greater than half the length of the array. If it is, the     majority element has been found and the current element of the array is returned.
  The efficiency of this algorithm is O(n) as it loops through the array once performing close to constant time Hashmap    operations at each iteration, meaning the time complexity is dominated by the loop, which makes it linear.


