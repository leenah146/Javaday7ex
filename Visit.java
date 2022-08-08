import java.util.Date;

public class Visit {
   private Customer customer;
   private Date date;
   private String name;
    private double serviceExpense;
   private double productExpense;

    public Visit(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getServiceExpense() {
        if(customer.getMemberType().equals("Premium")){
            serviceExpense=serviceExpense*DiscountRate.getProductDiscountRate(customer.getMemberType());

        }    if(customer.getMemberType().equals("Gold")){
            serviceExpense=serviceExpense*DiscountRate.getProductDiscountRate(customer.getMemberType());

        }    if(customer.getMemberType().equals("Silver")){
            serviceExpense=serviceExpense*DiscountRate.getProductDiscountRate(customer.getMemberType());

        }
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductEspense() {
        if(customer.getMemberType().equals("Premium")){
            productExpense=productExpense*DiscountRate.getProductDiscountRate(customer.getMemberType());

        }    if(customer.getMemberType().equals("Gold")){
           productExpense=productExpense*DiscountRate.getProductDiscountRate(customer.getMemberType());

        }    if(customer.getMemberType().equals("Silver")){
            productExpense=productExpense*DiscountRate.getProductDiscountRate(customer.getMemberType());

        }
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        return serviceExpense+productExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", serviceExpense=" + serviceExpense +
                ", productEspense=" + productExpense +
                '}';
    }
}
