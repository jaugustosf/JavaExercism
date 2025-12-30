public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold >= 20 ? productsSold * bonusMultiplier(productsSold) : productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double sum = 1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return sum > 2000 ? 2000 : sum;
    }
}
