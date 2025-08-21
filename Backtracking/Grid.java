public class Grid {
    // public static int possible_path(int i, int j, int n,int m){
    //     //base
    //     if(i == n-1 && j == m -1){
    //         return 1;
    //     } else if(i == n || j == m){
    //         return 0;
    //     }

    //     //recursion 
    //     int w1 = possible_path(i+1, j, n, m); //down
    //     int w2 = possible_path(i, j+1, n, m); // right
    //     return w1 + w2;

    // }
   public static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
        result *= i;
        }
        return result;
    }

    public static int possible_path(int i ,int j,int n,int m){
    int f1 = factorial (n-1+m-1);
    int f2 = factorial(n-1);
    int f3 = factorial(m-1);
    int answer = f1/(f2*f3);
    return answer;
    }

    public static void main(String[] args) {
        int n = 3; 
        int m = 3;
        System.out.print(possible_path(0, 0, n, m));
        // System.out.println(factorial(n));
    }
}

// Time complexity is O(2^(n+m))