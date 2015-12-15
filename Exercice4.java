import java.util.*;
class Exercice4 {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a message:");
        String msg = (sc.nextLine()).toUpperCase();
        
        System.out.println("Enter a value for K:");
        int k = sc.nextInt();
        
        caesar(msg, k);

        
	}

    public static void caesar(String A, int B) {
        
        char str[]=A.toCharArray();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0; i<A.length(); i++) {
            for (int j=0; j<26; j++) {
                if (alpha.charAt(j) == str[i]) {
                    if ((j+B)>25) {
                        str[i] = alpha.charAt(j + B - 26);
                    } else {
                        str[i] = alpha.charAt(j + B);
                    }
                }
            }  
        }
        String code = new String (str);
        System.out.println("Here is your encoded message: ");
        System.out.println(code);
    }
}