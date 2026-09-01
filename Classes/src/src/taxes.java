public class taxes {
    private double tax;
    private double newSalary;

    public void setTaxes(double tax, double newSalary) {
        this.tax = tax;
        this.newSalary = (newSalary * tax)+newSalary;
    }
    public double getTaxes() {
        return newSalary;
    }
}
