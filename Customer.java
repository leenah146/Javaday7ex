public class Customer {

    private String name;
    private  boolean memeber =false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMemeber() {
        return memeber;
    }

    public void setMemeber(boolean memeber) {
        this.memeber = memeber;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", memeber=" + memeber +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
