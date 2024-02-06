public class CreditPaymentService {
    public double calculate(int loanAmount, double percent, int creditTerm) {
        double payment;
        double monthlyRate = percent / 1_200;
        double degree = Math.pow(1 + monthlyRate, creditTerm);
        payment = (int) (loanAmount * ((monthlyRate * degree)/(degree-1)));
        return payment;
    }
}
