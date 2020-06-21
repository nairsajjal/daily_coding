//Problem: https://www.hackerrank.com/challenges/sherlock-and-valid-string
//Java 8
/*
Initial Thoughts:
Get every chars' frequency 
If there are more than two different frequencies
    NO
if 1 frequency 
    YES
if 2 frequency
    if 1 occurs only once and frequency is 1
        yes
    else
        if their difference 1 and one has frequency 1
            yes
        else
            no
examples:
abcde       -> Y
a           -> Y
aabb        -> Y
aaaabbbbc   -> Y
aaaabbbbcd  -> N
aabbcd      -> N
Time Complexity: O(n) //We have to look at every char
Space Complexity: O(n) //We store frequencies in a Hashmap
*/