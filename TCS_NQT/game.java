
/* Possible Problem Statement
🎮 Game Outcome Prediction

Two players are playing a game for multiple test cases.
For each test case:
You are given an integer r — the number of rounds played.
In every round, 3 integers are recorded (these represent moves/scores/events of that round, but they do not affect the final decision).
Your task is to determine whether the final result of the game is "fat" or "fit" based only on the total number of values recorded.
*/


import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        for(int k = 0; k < t; k++) {
            int r = sc.nextInt();  // number of rounds;
            int a[][] = new int[r][3];  // array to hold the moves of both players
            for(int i = 0; i < a.length; i++) {
                for(int j = 0; j < 3; j++) {
                    a[i][j] = sc.nextInt();  // read moves for each round
                }
            }
            if((r*3) % 2 == 0) {
                System.out.println("fat");
            } else {
                System.out.println("fit");
            }
        }
        sc.close();
    }
}
