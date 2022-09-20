public class Main {
    public static void main(String[] args) {

        char grade = 'H';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("iyi geçtiniz");
                break;
            case 'D':
                System.out.println("fena değil geçtiniz");
                break;
            case 'E':
                System.out.println("Mükemmel geçtiniz");
                break;
            case 'F':
                System.out.println("maalesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }

    }
}