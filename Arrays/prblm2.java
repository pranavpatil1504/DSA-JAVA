// Given an array arr of size n and an integer x. Find if there's a triplet in the array which sums up to the given integer x.

// Examples

// Input:n = 6, x = 13, arr[] = [1,4,45,6,10,8]
// Output: 1
// Explanation: The triplet {1, 4, 8} in the array sums up to 13.
// Input: n = 6, x = 10, arr[] = [1,2,4,3,6,7]
// Output: 1
// Explanation: Triplets {1,3,6} & {1,2,7} in the array sum to 10. 
// Input: n = 6, x = 24, arr[] = [40,20,10,3,6,7]
// Output: 0
// Explanation: There is no triplet with sum 24. 
// Expected Time Complexity: O(n2)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ n ≤ 103
// 1 ≤ arr[i] ≤ 105



//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int X = Integer.parseInt(inputLine[1]);
            int A[] = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.find3Numbers(A, n, X);
            System.out.println(ans ? 1 : 0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean find3Numbers(int arr[], int n, int x) {
        
        for (int i = 0; i < n - 2; i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            
            for (int j = i + 1; j < n; j++){
                int op = x - arr[i] - arr[i];
                
                if (map.containsKey(op)){
                    return true;
                }
                
                map.put(arr[j], j);
            }
        }
        return false;
    }

}
