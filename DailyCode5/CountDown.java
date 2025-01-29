import java.util.Scanner; 

class CountDown {
    static void myMethod() {
            Scanner input = new Scanner(System.in);
            System.out.println("Type an integer:");
            int number = input.nextInt();
            int sum = 0;
            
            String num = String.valueOf(number);
            for (int i = 0; i < num.length(); i++) {
                int j = Character.digit(num.charAt(i), 10);
                sum += j;
            }
            System.out.println(sum);    
        
    }
    public static void main(String[] args) {
        
            myMethod();
        
    }
}
