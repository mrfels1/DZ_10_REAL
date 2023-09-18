import java.util.Scanner;

public class Main {
    static int task_1(int a, int b){
        if ((a-b) >= 2){
            return 0;
        }
        else if((a-b) == 1){
            return 1;
        }
        else if ((a-b) == 0){
            return a + 1;
        }
        else if ((a-b) < 0){
            return a + b;
        }
        return 0;
    };

    static int task_2(int n, int revn){
        if (n == 0){
            return revn;
        }
        revn = revn * 10 + n % 10;
        n /= 10;
        return task_2(n,revn);
    }

    static int task_3(){
        Scanner in = new Scanner(System.in);
        int one = 0;
        int zero = 0;
        do {
            int n = in.nextInt();
            switch (n) {
                case (0):
                    zero++;
                    break;
                case (1):
                    one++;
                    zero = 0;
                    break;
                default:
                    zero = 0;
                    break;
            }
        } while (zero != 2);
        return one;
    }
    public static void main(String[] args) {
        System.out.println("------------------------------task 1------------------------------");
        System.out.println("For 4 zeros and 2 ones exists only: " + task_1(4,2)
                + " combinations, this is because difference between a and b is bigger than 1");
        System.out.println("For 4 zeros and 3 ones exists only: " + task_1(4,3)
                + " combination, this is because difference between a and b is equal to 1");
        System.out.println("For 4 zeros and 4 ones exists only: " + task_1(4,4)
                + " combinations, this is because a and b is equal and amount of"
                + " combinations is a (or b) + 1");
        System.out.println("For 4 zeros and 5 ones exists only: " + task_1(4,5)
                + " combination, this is because difference between a and b is less than 0"
                + " and amount of combination is a + b");
        System.out.println();
        System.out.println("0 = " + 5 + ", 1 = " + 3 + ", combinations = " + task_1(5,3));
        System.out.println("0 = " + 5 + ", 1 = " + 4 + ", combinations = " + task_1(5,4));
        System.out.println("0 = " + 5 + ", 1 = " + 5 + ", combinations = " + task_1(5,5));
        System.out.println("0 = " + 5 + ", 1 = " + 6 + ", combinations = " + task_1(5,6));

        System.out.println("------------------------------task 2------------------------------");
        System.out.println("1234 turns into " + task_2(1234,0));
        System.out.println("------------------------------task 3------------------------------");
        System.out.println(task_3()); // хз как это рекурсией сделать
    }
}