import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class studentTasks {
    
    //Write a function that will print “Attack” when an enemy player is visible, but not powered up. 
    //It will print “Runaway” when the enemy is visible and powered up and it will print “Wander” when the player is not visible. Input (Visible, PoweredUp), Output (print message to screen). Make a random generator of input combinations. 
    //[enemy(yes, yes)--> Run Away]

    public static void Attack(){

        class Enemy{
            static Random rd = new Random();
            boolean visible = rd.nextBoolean();
            boolean PoweredUp = rd.nextBoolean();
        }

        Enemy enemy1 = new Enemy();

        System.out.println("Enemy is visible: " + enemy1.visible);
        System.out.println("Enemy is powered up: " + enemy1.PoweredUp);

        if (enemy1.visible == true){
            if (enemy1.PoweredUp == true){
                System.out.println("Run away.");
                
            } else if (enemy1.PoweredUp == false){
                System.out.println("Attack.");
                
            }
        } else if (enemy1.visible == false){
            System.out.println("Wander.");
        }

    }

    //Samo: For numbers n,m return least common multiple and greatest common divisors
    //[For 4, 6 are LCM 12 and GCD 2]

    public static void MultipleDivisor(){

        int n;
        int m;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("input first integer");
        n = sc.nextInt();

        System.out.println("input second integer");
        m = sc.nextInt();

        //smallest common multiple
        if (n == 0 || m == 0){
            System.out.println("0");
        }

        int absN = Math.abs(n);
        int absM = Math.abs(m);
        int absHigher = Math.max (absN, absM);
        int absLower = Math.min(absN, absM);
        int lcm = absHigher;
        while (lcm % absLower != 0){
            lcm += absHigher;
        }
        System.out.println("Lowest common multiple is " + lcm);

        //greatest common divisor
        int gcd = 1;
        
        for (int i = 1; i <= n && i <= m; i++){
            if (n % i == 0 && m % i == 0){
                gcd = i;
            }
        }

        System.out.println("Greatest common divisor is " + gcd);


    }

    //Terka: Write a function to convert decimal numbers to binary. Input Decimal, Output is Binary form (String). Use String class only (substring, concatenation). Avoid any arrays.  

    public static void DectoBin(int decimal){

        String binary = "";

        for (int i = 31; i >= 0; i--){ //size of a int is 32 bits
            int k = decimal >> i;
            if ((k & 1) > 0){
                binary = binary + "1";
            } else {
                binary = binary + "0";
            }
        }
    
        System.out.println("Decimal is " + decimal);
        System.out.println("Binary is " + binary);
    }

    public static void main(String[] args) {
        DectoBin(13);
    }
}
