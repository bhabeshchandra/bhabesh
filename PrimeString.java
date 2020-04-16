package org.cap.ps;

public class PrimeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 1, 7, 5 };
        int n = arr.length; 
        System.out.println(countPair(arr, n));
	}

  static void findprimes(int maxm, int prime[]) 
    { 
        prime[0] = prime[1] = 1; 
      
        for (int i = 2; i * i <= maxm; i++) 
            if (prime[i] == 0) 
                for (int j = 2 * i; j <= maxm; j += i) 
                    prime[j] = 1; 
    } 
      
    static int countPair(int a[], int n) 
    { 
        // Find the maximum element of the array 
        int maxm = a[0]; 
          
        for(int i = 1; i < n; i++) 
            if(a[i] > maxm) 
            maxm = a[i]; 
          
        int [] prime = new int[maxm + 1]; 
          
        for(int i = 0; i < maxm + 1; i++) 
            prime[i] = 0; 
      
        findprimes(maxm, prime); 
      
        // Count pairs with at least prime 
        int count = 0; 
        for (int i = 0; i < n; i++) 
            for (int j = i + 1; j < n; j++) 
                if (prime[a[i]] == 0 || prime[a[j]] == 0) 
                    count++; 
      
        return count; 
    } 
      
}
