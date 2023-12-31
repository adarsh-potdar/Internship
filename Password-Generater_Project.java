import java.util.Random;

public class PasswordGenerating {
    public static void main(String[] args) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialchars = "!@#$%^&*~_+][<>?/:";

        String combination = uppercase + lowercase + numbers + specialchars;

        int min = 8;
        int max = 16;

        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

        char[] password = new char[random_int];
        Random r = new Random();

        for (int i = 0; i < random_int; i++) {
            password[i] = combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Generated Password is : " + new String(password));

        System.out.println("The Length of Password is : " + random_int);  
          
        switch(random_int){  
          
        case 8: System.out.println("The Password Strength is Very Week.");  
        break;  
        case 9: System.out.println("The Password Strength is Very Week.");  
        break;  
        case 10: System.out.println("The Password Strength is Week.");  
        break; 
        case 11: System.out.println("The Password Strength is Week.");  
        break; 
        case 12: System.out.println("The Password Strength is Medium.");  
        break;
        case 13: System.out.println("The Password Strength is Medium.");  
        break;
        case 14: System.out.println("The Password Strength is Strong.");  
        break;
        case 15: System.out.println("The Password Strength is Strong.");  
        break;
        case 16: System.out.println("The Password Strength is Very Strong.");  
        break;
        
          
        default: ;
        }

    }
}
