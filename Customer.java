public class Customer {

    String id;
    int cost;
    int discount;
    int total;

    public Customer(String id, int cost) {
        this.id = id;
        this.cost = cost;
    }

    public void print() {
        if (cost > 1000) {
            discount = (int) (cost * 0.1);
            total = cost - discount;
            System.out.println(id + "\t" + cost + "\t" + discount + "\t" + total );
        } else {
            discount = 0 ;
            total = cost-discount;
            System.out.println(id + "\t" + cost + "\t" + discount + "\t" + total );
        }
    }
}