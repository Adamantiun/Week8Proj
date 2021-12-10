package pt.up.fe.ldts.example1;

public class OrderLine {
    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct(){ return product; }

    void setProduct(Product product){ this.product = product; }

    public int getQuantity(){ return quantity; }

    void setQuantity(int quantity){ this.quantity = quantity; }

    public double getTotal() {
        return product.getPrice() * quantity;
    }

    public void printOrder(StringBuffer printBuffer) {
        printBuffer.append(product.getName() + "(x" + quantity + "): " + (product.getPrice() * quantity) + "\n");
    }
}
