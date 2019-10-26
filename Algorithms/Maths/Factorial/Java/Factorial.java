class Test 
{ 
    // method to find factorial of given number 
    static int factorial(int n) 
    { 
        if (n == 0) 
          return 1; 
          
        return n*factorial(n-1); 
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
        int num;
        cin>>num;
        System.out.println("Factorial of "+ num + " is " + factorial(5)); 
    } 
} 
