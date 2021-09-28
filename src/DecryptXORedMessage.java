import java.util.Scanner;

public class DecryptXORedMessage {
    public static void main(String[] args) {
        System.out.println("Enter the encrypted message: ");
        Scanner sc = new Scanner(System.in);
        String coded = sc.nextLine();
        StringBuilder decoded = new StringBuilder();
        int iterations = 20;
        for (int key=0; key<iterations; key++){
            for (int i=0; i<coded.length(); i++){
                decoded.append((char) (key ^ (int) coded.charAt(i)));
            }
            System.out.println("Decrypted: "+decoded+" with key "+key);
            decoded = new StringBuilder();
        }
    }
}
