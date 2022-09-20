public class Main {
    public static void main(String[] args) {
        int number = 25;
        boolean asalmi = true;

        if (number == 1){
            System.out.println("sayi asal değildir.");
            return;
        }

        for (int i= 2;i <= number; i++){
            if (number %i ==0){
                asalmi = false;
            }
        }
        if (asalmi) {
            System.out.println("sayi asaldır");
        }else{
            System.out.println("sayi asal değildir");
        }
    }
}