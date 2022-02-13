Focal length of Spherical Mirror

static int focal_length(int R, char Mirror)
{
    int f=R/2;
    if((R%2==1) && Mirror==')'){f++;}
    if(Mirror == ')'){f=-f;}
    return f;
}


Cuboid Perimeter

static int Perimeter(int L, int B, int H){
    return 4*(L+B+H);
}


Nobita and Profit

static int Profit(int C, int S){
    return S-C;
}


Shinchan and Kazama

static int Time(int A, int B, int S){
    if(B>A){
    return (B-A)/S;
    }
    return (A-B)/S;
    }


Simple Sum


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AssignmentSolutions {
	public static void main (String[] args) {
                      // Your code here
		int a;
		int b;
		int c; 
	Scanner scn = new Scanner(System.in);
	a = scn.nextInt();
	b = scn.nextInt();
	c = scn.nextInt();

    System.out.println(a+b+c);

            
	}
}


Fizzbuzz / Newton School


static void NewtonSchool(int n){
    for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){System.out.print("NewtonSchool ");}
            else if(i%5==0){System.out.print("School ");}
            else if(i%3==0){System.out.print("Newton ");}
            else{System.out.print(i+" ");}
    }
    }


Max Integer
    
    
static int  MaxInteger(int a ,int b, int c){
    if(a>=b && a>=c){return a;}
    if(b>=a && b>=c){return b;}
    return c;}


Triangle
    
*****
****
***
**
*


Outer Loop:

Row: 1 ,2 ,3,4,5: for (i=0; i<5; i++)
i = 0,1,2,3,4

Inner Loop:
Column: 5,4,3,2,1 for (j=n-i; j>=1; j--)

j = 5-0 = 5 = 5-i
j = 5-1 = 4 = 5-i
j = 5-2 = 3 = 5-i
j = 5-3 = 2 = 5-i
j = 5-4 = 1 = 5-i


static void Triangle()
{
int n =5;
int i=n;
int j=0;

for (i=0; i<n; i++)
{
for (j=n-i; j>=1; j--)
{
System.out.print("*");
}
System.out.println("");
}

}


Pattern Printing

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5


static void pattern(int n)
{
    int i=n;
    int j=0;

    for (i=1; i<=n; i++)
    {
        for (j=1; j<=i; j++)
        {
            System.out.print(j + " ");
        }
        System.out.println("");
    }
}



Basic Calculator

static int calculator(char ch, int a, int b)
    {
      if(ch == '+')
        return a+b;
      else if(ch == '-')
        return a-b;
        else if(ch == '*')
          return a*b;
         else return a/b;
       
    }


Armstrong Number

    static boolean isArmstrong(int N)
    {
        int num = N;
        int sum = 0;
        while(N > 0)
        {
            int digit = N%10;
            sum += digit*digit*digit;
            N  = N/10;
        }
       if(num == sum)
         return true;
         else return false;
    }
    

    

Single Digit


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) 
    {
    Scanner s = new Scanner(System.in);
    int digit_sum =0;
    int num = s.nextInt();
    int rem = 0;


    while (num > 0 || digit_sum > 9)
    {
        if (num == 0)
        {
            num = digit_sum; // 15
            digit_sum = 0;
        }

        rem = num % 10; //5 , 4, 3, 2,1   ---> num = 15, 5
        digit_sum = digit_sum + rem; //5, 9, 12, 14, 15 --> digit_sum = 0+5 = 5+1 = 6
        num = num / 10; // 1234, 123, 12, 1, 0  ---> num= 1
    }

    System.out.println(digit_sum);


	}
}

    
Buildings


// TC: O(N)
// SC: O(1)
// Author: @devangs

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long arr[] = new long[N];
		for(int i=0; i<N; i++){
			arr[i] = scn.nextLong();
		} 

		long currentTallest =0;
		int count =0;

		for(int i=0; i<N; i++){
			if(arr[i] > currentTallest){
				count++;
				currentTallest = arr[i];
			}
		}
		System.out.println(count);
	}
}


Simple Arrangement



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int arr[] = new int[n];
		int i=0;
		for (i=0; i<n; i++)
			arr[i] = s.nextInt();

		for (i=0; i<n; i++)
		{
			System.out.print(arr[arr[i]] + " ");
		}			
    }
}


Average me

// TC: O(N)
// SC: O(N)
// Author: @devangs

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for(int i=0;i<n;i++){
		    A[i]=sc.nextInt();
		}

		long sum=0; // MUST Use long to Avoid Overflow
		
		for(int i=0;i<n;i++){
		    sum = sum + A[i];
			// sum += A[i]; - SHORTHAND
		}
		
		long average = sum/n;
		System.out.print(average);
	}
}

/*
 int will always contain floor value of positive Decimal



int p = 4.8
p = 4

int q = -4.8
q = -4

floor (4.8) = 4
floor(-4.8) = -5




Constraint:-
1 <= n <= 100000: Size of Array
1 <= a[i] <= 100000: Values of Array

n values each of 100000
Max sum = 100000 * 100000 = 10^10 = 10 Billions

int: -2 Bn to + 2 Bn

Use int: OVERFLOW- Wrong Answer (WA) - Garbage Value
Use long: Pass: Upto 4 Trillions

int: 4 Bytes
long: 8 Bytes
long long int: 10 Bytes


1 <= n <= 5
1 <= a[i] <= 100

Max value of sum = 100 + 100 + 100 + 100 + 100
				= 100 * 5 = 500 (MAX)

*/



Alternate Sum product



// TC: O(N)
// SC: O(1)
// AUthor: @devangs

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum=0, product=1;
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<N;j++){
            
            if((j+1)%2==0){ // EVEN
                sum = sum+arr[j];
                
            }
            else{ // ODD
                product = product*arr[j];
                            }
        }
        System.out.print(sum+" ");
        System.out.print(product);
	}
}





Replace element


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}		

		for (int i=0;i<n;i++){
			if(i==0){
				System.out.print(arr[i]*arr[i+1]+" ");
			}
			else if(i==n-1){
				System.out.print(arr[i]*arr[i-1]+" ");
			}else{
				System.out.print(arr[i-1]*arr[i+1]+" ");
			}
		}
                      // Your code here
	}
}



Max numbers



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        long first = 0, second = 0, third = 0;
        long n, i;
        long arr[] = new long[100000];

        while(tc>0)
		{
            first = 0;
            second = 0;
            third = 0;
            n = (int) input.nextLong();
//            int arr[] = new int[a];
            for(i = 0; i<n; i++){
                arr[i] = (int) input.nextLong();
            }
            for(i = 0; i<n; i++){
                if(arr[i] > first){
                    third = second;
                    second = first;
                    first = arr[i];
                }
                else if(arr[i] > second){
                    third = second;
                    second = arr[i];
                }   
                else if(arr[i] > third){
                    third = arr[i];
                }       
            }
            System.out.println(first+" "+second+" "+third);
        tc--;
		}
    }
}


Max Sum Column 




import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		int sum=0;
		int ans=0;
		for(int i=0;i<n;i++){
		    sum=0;
		    for(int j=0;j<m;j++){
		        sum+=a[j][i];
		    }
		    if(sum>ans){ans=sum;}
		}
		System.out.print(ans);
		
	    
}
}


Diagonal Sum

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i,j;
            
        int mat[][] = new int[n][n];
  		for (i = 0; i < n; i++)
        for (j = 0; j < n; j++)
            mat[i][j] = in.nextInt();

		long principal = 0, secondary = 0;
        for (i = 0; i < n; i++) 
		{
            principal += mat[i][i];
            secondary += mat[i][n - i - 1];
        }

		System.out.println(principal + " " + secondary);
	}
}


Good cells


import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	int m= sc.nextInt();
   int a[][]= new int[n][m];
  
  for(int i=0;i<n;i++)
  {
      for(int j=0;j<m;j++)
	  {
   a[i][j]=sc.nextInt();
 	  }
 }

 
   int cnt=0;
  for(int i=1;i<n-1;i++)
  {
  for(int j=1;j<m-1;j++)
  {
  if(a[i-1][j]==1 && a[i+1][j]==1 && a[i][j-1]==1 && a[i][j+1]==1)
  {
    cnt++;
  }
  }
  }
  System.out.print(cnt);
}

   }


A Boolean Matrix Problem


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main 
{
	public static void main (String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n,m,i,j;

		 while(t>0)
		 {
	 n= s.nextInt();
	 m = s.nextInt();
	 int [][]a = new int[n][m];
 	boolean []b = new boolean[n];
 	for(i=0;i<n;i++)
	 {
    b[i]=false;
 	}

 for(i=0;i<n;i++)
 {
     for(j=0;j<m;j++)
	 {
        a[i][j] = s.nextInt();
        if(a[i][j]==1)
		{
            b[i]=true;
        }
     }
 }

 for(i=0;i<n;i++)
 {
        if(b[i])
		{
    for(j=0;j<m;j++)
		{
			System.out.print("1 ");
    	}
	}
    else
	{
      for(j=0;j<m;j++)
	  	{
			System.out.print("0 ");
        //cout<<0<<" ";
      	}
    }
	System.out.println();
    //cout<<endl;
 }
t--;
 	}
}
}


@channel 

Q: Row with maximum 1's


CODE: 

/*

TC: O(N*logN)
SC: O(N*M)
Author: @devangs

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main 
{

    static int first(int arr[], int low, int high)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
 
            if ((mid == 0 || (arr[mid - 1] == 0)) && arr[mid] == 1)
                return mid;
 
            else if (arr[mid] == 0)
                return first(arr, (mid + 1), high);
                 
            else
                return first(arr, low, (mid - 1));
        }
        return -1;
    }
 
    static int rowWithMax1s(int mat[][], int m , int n)
    {
        int max_row_index = 0, max = -1;
        int i, index;
        for (i = 0; i < m; i++) {
            index = first(mat[i], 0, n - 1);
            if (index != -1 && n - index > max) {
                max = n - index;
                max_row_index = i;
            }
        }
             return max_row_index;
    }
 
       

	public static void main (String[] args) 
    {
        Scanner in = new Scanner(System.in);
		int m = in.nextInt();
        int n = in.nextInt();
		int i,j;
            
        int mat[][] = new int[m][n];
  		for (i = 0; i < m; i++)
        {
        for (j = 0; j < n; j++)
            {
            mat[i][j] = in.nextInt();
            }
        }

    System.out.println(rowWithMax1s(mat,m,n));
  

	}
}



Fibonacci Numbers

static long  Fibonacci(long  n) 
{ 
   if (n == 0) 
  { return 0;}
   else if(n==1){
       return 1;
   }
return Fibonacci(n-1) + Fibonacci(n-2); 
} 

Sum of digits

static long  Sum(long  n) 
    {
       if(n==0)
    {
      return 0;
    }

return n%10+Sum(n/10);
    }


Sum of Product of Digits of a given number

    public static int sumOfProductOfDigits(int n1, int n2)
{
    if(n1 < 10 && n2 < 10)
        return n1*n2;
    return (n1%10)*(n2%10) + sumOfProductOfDigits(n1/10, n2/10);
}


Factorial - Recursion

static int Factorial(int N)
	{
if(N==0){
return 1;}

return N*Factorial(N-1);
	}


Power function

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)throws Exception {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            double X = Double.parseDouble(str[0]);
            int N = Integer.parseInt(str[1]);
            
            System.out.println(String.format("%.2f", myPow(X, N)));
        }
    }
    
    public static double myPow(double x, int n) {
        if (n == Integer.MIN_VALUE)
            n = - (Integer.MAX_VALUE - 1); 
        if (n == 0)
            return 1.0;
        else if (n < 0)
            return 1 / myPow(x, -n);
        else if (n % 2 == 1)
            return x * myPow(x, n - 1);
        else {
            double sqrt = myPow(x, n / 2);
            return sqrt * sqrt;
        }
    }
}


Searching an element in a sorted array


static int isPresent(long arr[], int n, long k)
	{
	    int left = 0;
			int right = n-1;
			int res = -1;
			while(left<=right){
				int mid = (left+right)/2;
				if(arr[mid] == k){
					res = 1;
					break;
				}else if(arr[mid] < k){
					left = mid + 1;
				}else{
					right = mid - 1;
				}
			}
			
			return res;
	}





    Candy Crush


    int cost(int n){
        if(n == 0)	return 0;
        int g = (n-1)/3 + 1;
        return g*g + cost(n-g);
    }


Q: Minimum Element in Sorted and Rotated Array

import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
	public static void main (String[] args) {
		//code
				Scanner s = new Scanner(System.in);
				int t = s.nextInt();
				for(int j=0;j<t;j++){
	            	int al = s.nextInt();
		            int a[] = new int[al];
		            for(int i=0;i<al;i++){
			        a[i] = s.nextInt();
		            }
			        binSearchSmallest(a);
				    
				}
	
	}
		public static void binSearchSmallest(int a[]) {
		int s=0;
		int e = a.length - 1;
		int mid = 0;
		while(s<=e){
			mid = (s+e)/2;
			if(a[s]<a[e]){
				System.out.println(a[s]);
				return;
			}
			if(a[mid]>=a[s]){
				s=mid+1;
			}
			else{
				e=mid;
			}
			
			if(s == e){
				System.out.println(a[s]);
				return;
			}
		}

	}
}





Q: Square Root of a Number Using Binary Search

int squareRoot(int n)
{
    int start = 1;
    int end = n;

    while(start<=end)
    {
        int mid = (start+end)/2;

        if(mid*mid == n)
        return mid; // perfect square

        if(mid*mid < n)
        start = mid+1;

        if(mid*mid > n) // 3*3>8
        end = mid-1; //3-1 = 2
    }

    return end; // res = i-1 after for loop
}








Javascript




Insertion Sort in Java

void insertionSort(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;
 
        /* Move elements of arr[0..i-1], that are
        greater than key, to one position ahead
        of their current position */
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}



Easy sorting


function easySorting(arr)
  {
    for(let i = 1; i < 5; i++)
    {
        let str = arr[i];
        let j = i-1;
        while(j >= 0 && (arr[j].toString().localeCompare(str)) > 0 )
        {
          arr[j+1] = arr[j];
          j--;
        }
        arr[j+1] = str;
    }
    return arr;
  }




Lucky Sevens

function lucky_sevens(arr) {
// if less than 3 elements then this challenge is not possible
if (arr.length < 3) {

console.log(false)
return;
}
// because we know there are at least 3 elements we can
// start the loop at the 3rd element in the array (i=2)
// and check it along with the two previous elements (i-1) and (i-2)
for (let i = 2; i < arr.length; i++) {
if (arr[i] + arr[i-1] + arr[i-2] === 7) {
console.log(true)
return;
}
}
// if loop is finished and no elements summed to 7
console.log(false)
}





Implementing Quick Sort

function quickSort(arr, low, high)
   {
        if(low < high)
        {
          let pi = partition(arr, low, high);

            quickSort(arr, low, pi-1); 
            quickSort(arr, pi+1, high);


        }
        return arr;
   }

   function partition(arr, low, high)
   {
     let pivot = arr[high];  
        let i = (low-1); // index of smaller element 
        for (let j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                let temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        let temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
   }



Even-Odd seperate sorting

function sortEvenOdd(arr, arrSize)
  {
      var even = [];
      var odd = [];
      
      for(let i = 0; i < arrSize; ++i)
      {
        if((arr[i]) % 2 === 0)
         even.push(arr[i]);
         else 
         odd.push(arr[i]);
      }
        even.sort((x, y) => (x - y));
        odd.sort((x, y) => (x - y));

       let res = [];
    
        for(let i = odd.length - 1; i >= 0; i--)
             res.push(odd[i]);
          
          
         for(let i = 0; i < even.length; i++)
            res.push(even[i]);

           return res;
           
  }



Compound interest

   function calculateCI(P, R, T)
    {
        let interest = P * (Math.pow(1.0 + R/100.0, T) - 1);
        return interest.toFixed(2);
    }



Number of days

function numberOfDays(n)
    {
      let ans;
        switch(n)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ans = Number(31);
                break;
            case 2:
                ans = Number(28);
                break;
            default:
                ans = Number(30);
                break;
                 
        }
        return ans;
    }



Unique Elements from Array
    
function removeDuplicates(arr){
console.log(Array.from(new Set(arr)).join(" "))
}







Birthday Paradox



// C++ program to approximate number of people in Birthday Paradox
// problem
#include <cmath>
#include <iostream>
using namespace std;

// Returns approximate number of people for a given probability
int find(double p) {
    return ceil(sqrt(2 * 365 * log(1 / (1 - p))));
}

int main() {
    float p;
    cin >> p;
    cout << find(p) << "\n";
}






Kth Smallest Difference



import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
    public static void main(String[] args)throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
          
            String str[] = read.readLine().trim().split(" ");

            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);

            int arr[] = new int[n];
           str = read.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                  arr[i] = Integer.parseInt(str[i]);

            System.out.println(Math.abs(small(arr, k)));
        }
    }

    public static int small(int arr[], int k) {
        Arrays.sort(arr);
        int l = 0, r = arr[arr.length - 1] - arr[0];
        while (r > l) {
            int mid = l + (r - l) / 2;
            if (count(arr, mid) < k) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r;
    }

    public static int count(int arr[], int mid) {
        int ans = 0, j = 0;
        for (int i = 1; i < arr.length; ++i) {
            while (j < i && arr[i] - arr[j] > mid) {
                ++j;
            }
            ans += i - j;
        }
        return ans;
    }
}



Is this prime?


#include "bits/stdc++.h"
#pragma GCC optimize "03"
using namespace std;
 
#define int long long int
#define ld long double
#define pi pair<int, int>
#define pb push_back
#define fi first
#define se second
#define IOS ios::sync_with_stdio(false); cin.tie(0); cout.tie(0)
#ifndef LOCAL
#define endl '\n'
#endif
 
const int N = 2e5 + 5;
const int mod = 1e9 + 7;
const int inf = 1e9 + 9;

int power(int a, int b){
    int ans = 1;
    b %= (mod-1);
    while(b){
        if(b&1)
            ans = (ans*a) % mod;
        b >>= 1;
        a = (a*a) % mod;
    }
    return ans;
}

int f(int n, int p){
    int ans = 1;
    int cur = 1;
    while(cur <= n/p){
        cur = cur*p;
        int z = power(p, n/cur);
        ans = (ans*z) % mod;
    }
    return ans;
}

signed main() {
    IOS;
    int x, n, ans = 1;
    cin >> x >> n;
    for(int i = 2; i*i <= x; i++){
        if(x%i != 0)    continue;
        ans = (ans*f(n, i)) % mod;
        while(x%i == 0)
            x /= i;
    }   
    if(x > 1)
        ans = (ans*f(n, x)) % mod;
    cout << ans;
    return 0;
}


Walter White Easy


#include<bits/stdc++.h>
using namespace std;

#define pu push_back
#define fi first
#define se second
#define mp make_pair
// #define int long long
#define pii pair<int,int>
#define mm (s+e)/2
#define all(x) x.begin(), x.end()
#define For(i, st, en) for(int i=st; i<en; i++)
#define tr(x) for(auto it=x.begin(); it!=x.end(); it++)
#define fast std::ios::sync_with_stdio(false);cin.tie(NULL);
#define sz 2000015
#define qw1 freopen("input1.txt", "r", stdin); freopen("output1.txt", "w", stdout);
#define qw2 freopen("input2.txt", "r", stdin); freopen("output2.txt", "w", stdout);
#define qw3 freopen("input3.txt", "r", stdin); freopen("output3.txt", "w", stdout);
#define qw4 freopen("input4.txt", "r", stdin); freopen("output4.txt", "w", stdout);
#define qw5 freopen("input5.txt", "r", stdin); freopen("output5.txt", "w", stdout);
#define qw6 freopen("input6.txt", "r", stdin); freopen("output6.txt", "w", stdout);
#define qw freopen("input.txt", "r", stdin); freopen("output.txt", "w", stdout);

int A[sz],B[sz],C[sz],D[sz],E[sz],F[sz],G[sz];
int n,m;
signed main()
{
    

        
        cin>>n;
        for(int i=0;i<n;i++)
        {
            cin>>A[i];
            F[i]=A[i];
        }
        cin>>m;
        for(int i=0;i<m;i++)
        {
            cin>>B[i];
            G[i]=B[i];
            C[m-i-1]=B[i];
        }
        C[m]=-500000000;
        for(int i=0;i<n;i++)
        {
            C[i+m+1]=A[n-i-1];
        }

       int l=0,r=0;
       for(int i=1;i<=n+m;i++)
        {
            if(i<=r)
            {
                E[i]=min(r-i+1,E[i-l]);
            }

            while(i+E[i]<=n+m && C[E[i]]-C[0]==C[i+E[i]]-C[i])
             E[i]++;
 
            if(i+E[i]-1>r) {
                l=i;r=i+E[i]-1;
            }
        }
       for(int i=0;i<m;i++)
       {
        C[i]=B[i];
       }
       for(int i=0;i<n;i++)
       {
        C[i+m+1]=A[i];
       }

       for(int i=0;i<n;i++)
       {
          A[i]=E[n+m-i];
       }

        l=0;
        r=0;
        for(int i=1;i<=n+m;i++)
        {
            if(i<=r)
            {
                D[i]=min(r-i+1,D[i-l]);
            }

            while(i+D[i]<=n+m && C[D[i]]-C[0]==C[i+D[i]]-C[i])
             D[i]++;

            if(i+D[i]-1>r) {
                l=i;r=i+D[i]-1;
            }
        }
        // cout<<0<<" ";
        for(int i=0;i<n;i++)
        {
            B[i]=D[i+m+1];
            // cout<<A[i]<<" ";
        }
        // cout<<endl;
        // for(int i=0;i<n;i++)
        // {
        //  cout<<B[i]<<" ";
        // }cout<<endl;
        // for(int i=0;i<=n;i++)
        // {
        //  cout<<i<<" ";
        // }
        // cout<<endl;
        int cnt=0;
        vector<pii> xx,yy;
          for(int i=0;i<=n;i++){

            int a=0;
            int b=0;
            if(i>0) a=A[i-1];
            if(i<n) b=B[i];
            // cout<<i<<" "<<a<<" "<<b<<endl;
           if(a+b>=m && (a==0 || b==0 ||(F[i]-F[i-1]==G[0]-G[m-1]))) 
                {xx.pu(mp(i-a,i+b-m));  }
            if(a==m) xx.pu(mp(i-a,i-a));
              if(b==m ) xx.pu(mp(i,i));
           

        }
        sort(xx.begin(),xx.end());
        for(int i=0;i<xx.size();i++)
        {  // cout<<xx[i].fi<<" "<<xx[i].se<<endl;
            if(yy.size()==0) yy.pu(mp(xx[i].fi,xx[i].se));
            else{

                int p=yy.size()-1;
                // cout<<i<<"  "<<xx[i].fi<<" "<<xx[i].se<<" " <<yy[p].se<<endl;
                if(yy[p].se>=xx[i].se) continue;
                if(yy[p].se>=xx[i].fi) yy[p].se=xx[i].se;
                else yy.pu(mp(xx[i].fi,xx[i].se));
            }
        }
        for(int i=0;i<yy.size();i++)
        { // cout<<yy[i].fi<<"  "<<yy[i].se<<endl;
            cnt+=yy[i].se-yy[i].fi+1;
        }
        cout<<cnt<<endl;

    
}



 Palindrome pair


 #include<bits/stdc++.h>
using namespace std;
#define ll long long
#define VV vector
#define pb push_back
#define bitc  __builtin_popcountl
#define m_p make_pair
#define inf 200000000000000
#define MAXN 1000001
#define eps 0.000000000001
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL);
string char_to_str(char c){string tem(1,c);return tem;}
mt19937 rng(chrono::steady_clock::now().time_since_epoch().count());
template<class T>//usage rand<long long>()
T rand() {
    return uniform_int_distribution<T>()(rng);
}

// string to integer stoi()
// string to long long stoll()
// string.substr(position,length);
// integer to string to_string();
 
//////////////
 
#define S second
#define F first
#define int long long  
 
/////////////

int v1[100001]={};
int v2[100001]={};
signed main()
{
    fastio;
    #ifdef ANIKET_GOYAL
        freopen("inputf.in","r",stdin);
        freopen("outputf.in","w",stdout);
    #endif
    int n;
    string s;
    cin>>s;
    n=s.length();
    vector<int> d1(n);
    for (int i = 0, l = 0, r = -1; i < n; i++) {
        int k = (i > r) ? 1 : min(d1[l + r - i], r - i + 1);
        while (0 <= i - k && i + k < n && s[i - k] == s[i + k]) {
            k++;
        }
        d1[i] = k--;
        if (i + k > r) {
            l = i - k;
            r = i + k;
        }
    }
    int c=0;
    for(int i=0;i<n;++i)
    {
        int x=2*d1[i]-1;
        int j=i+d1[i]-1;
        while(v1[j]<x&&j>=i)
        {
            v1[j]=x;
            x-=2;
            ++c;
            --j;
        }
    }
    for(int i=1;i<n;++i)
    {
        v1[i]=max(v1[i],v1[i-1]);
    }
    for(int i=n-1;i>=0;--i)
    {
        int x=2*d1[i]-1;
        int j=i-d1[i]+1;

        while(v2[j]<x&&j<=i)
        {
            v2[j]=x;
            x-=2;
            ++j;
            ++c;
        }
    }
    for(int i=n-2;i>=0;--i)
    {
        v2[i]=max(v2[i],v2[i+1]);
    }
    int ans=0;
    for(int i=1;i<n;++i)
    {
        ans=max(ans,v1[i-1]*v2[i]);
    }
    cout<<ans;
}







Reverse all words


function reverseBySeparator(string, separator) {
    return string.split(separator).reverse().join(separator);
    }
function reverseWords (str){
  const step1 = reverseBySeparator(str,"")
  const step2 = reverseBySeparator(step1," ")
  console.log(step2)
}



Pair Sum in vector


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) 
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[2*n];
        int i=0;
        long ans =0;
        for (i=0; i<2*n; i++)
        {
            arr[i] = s.nextInt();
            if (i%2!=0)
                ans+=arr[i];
        }

        System.out.println(ans);
    }
}



Pair Sum Existence-Revisited

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// Author: @devangs
// TC: O(N)
// SC: O(N) - HashMap

class Main {

    public static int findTwoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) 
        {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return 1;
            } else {
                numMap.put(nums[i], i);
            }
        }
        return 0;
    }

    public static void main (String[] args) 
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int target = s.nextInt();
        int arr[] = new int[n];
        int i=0;
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }

    System.out.println(findTwoSum(arr,target));

    }
}


Addition of Common Elements


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) 
    {
        Scanner s= new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();

        int i=0;
        for (i=0; i<m; i++)
        {
            s1.add(s.nextInt());
        }

        for (i=0; i<n; i++)
        {
            s2.add(s.nextInt());
        }

        s1.retainAll(s2);
        
        long sum = 0;
        for(int k : s1) {
            sum += k;
        }

    System.out.println(sum);


    }
}



Bubble sort in pair array

      static Pair[] SortPair(Pair arr[], int n) 
    { 
        // Comparator to sort the pair according to second element 
        Arrays.sort(arr, new Comparator<Pair>() { 
            @Override public int compare(Pair p1, Pair p2) 
            { 
                if(p1.x==p2.x){
                    return p2.y-p1.y;
                }
                return p2.x-p1.x;
            } 
        });
        
        return arr;
  
  
    } 
