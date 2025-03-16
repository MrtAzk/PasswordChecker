import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        // Koşullar  1-En az 8 karakter içermeli +
        //  2-Space karakteri içermemeli +
        //  3-İlk harf büyük harf olmalı, +
        //  4-Son karakteri ? olmalı +

        //Her hata da şifre ismesi için while içine aldım
        while (true){
            System.out.println("Şifre Giriniz");
            String password = scanner.nextLine();

            //Burada booolean tipinde değer döndürecez if mekanizması kontrolleri için
            boolean PassLong =password.length()>=8;
            boolean SpaceCheck = ! password.contains(" ");
            char lastIndex =password.charAt(password.length()-1);
            boolean lastIndexChecker = lastIndex == '?';
            boolean UpperCheck = false;
            if (Character.isUpperCase(password.charAt(0))){ // ilk harf büyükse upperckech true olacak
                UpperCheck = true;
            }

            // Kontrol işlemi
            if (PassLong && SpaceCheck && UpperCheck && lastIndexChecker){
                System.out.println("Şifre başarıyla oluştu");
                break;

            }else {
                if (!PassLong){
                    System.out.println("Hata: Şifre en az 8 karakter içermelidir.");

                } if (!SpaceCheck){
                    System.out.println("Hata: Şifre boşluk karakteri içeremez.");

                } if (!lastIndexChecker){
                    System.out.println("Hata: Şifrenin son karakteri '?' olmalıdır.");
                }
                if (!UpperCheck){
                    System.out.println("Hata: Şifrenin ilk karakteri büyük harf olmalıdır.");
                }
            }
        }
        scanner.close();
    }
}
