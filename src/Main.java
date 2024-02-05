public class Main {
    public static void main(String[] args) {
        creditPaymentService service = new creditPaymentService();
        System.out.println();
        System.out.println(service.calculate(1000000,9.99,12));
        System.out.println();
        System.out.println(service.calculate(1000000,9.99, 24));
        System.out.println();
        System.out.println(service.calculate(1000000,9.99,32));
    }
}