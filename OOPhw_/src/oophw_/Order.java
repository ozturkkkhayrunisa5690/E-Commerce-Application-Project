package oophw_;

public class Order {
    private User orderingUser;
    private Product orderedProduct;
    private CreditCard userCreditCard;
    private int numberOfOrders;

    public Order (User orderingUser, Product orderedProduct, CreditCard userCreditCard, int numberOfProducts) {
        this.orderingUser = orderingUser;
        this.orderedProduct = orderedProduct;
        this.userCreditCard = userCreditCard;
        this.numberOfOrders = numberOfProducts;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }
    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    public User getOrderingUser() {
        return orderingUser;
    }
    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

    public CreditCard getUserCreditCard() {
        return userCreditCard;
    }
    public void setUserCreditCard(CreditCard userCreditCard) {
        this.userCreditCard = userCreditCard;
    }
    
    public int getNumberOfOrders() {
        return numberOfOrders;
    }
    public void setNumberOfOrders(int numberOfProducts) {
        this.numberOfOrders = numberOfProducts;
    }
   
    
    
    
    
    public void controlProductStock(){
        System.out.println("STOCK CONTROL:");
            if(orderedProduct.productcontrol()== true ){
                System.out.println("The product is in stock.".toUpperCase());
            }
            else{
                System.out.println("out of stock.".toUpperCase());
                
                
            }
     }
     
    
    public void orderProcess(){
         
        if(orderedProduct.reduceNumofStock(numberOfOrders) == true ){
            
            System.out.println(numberOfOrders+ " PIECE " + orderedProduct.getProductName().toUpperCase()+ " ORDERED.");
            System.out.println( orderedProduct.getProductStock()+" PIECE " + orderedProduct.getProductName().toUpperCase()+  " LEFT.");
            System.out.println("Order is complicated.".toUpperCase());
            
        }
        else{
              
              System.out.println("The order could not be completed due to insufficient stock.".toUpperCase());
        }
    }
   
                
}