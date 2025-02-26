package oophw_;

import java.util.ArrayList;


public class User {
    private String username;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String emailAddress;
    private String homeAddresses;
    private String workAddresses;
    private ArrayList<Product> orderedProducts;
    private ArrayList<Product> favoriteProducts;
    private ArrayList<CreditCard> creditCards;
    
  
    
    public User(String username, String name, String surname,String dateOfBirth, String password ,String emailAddress,String homeAddresses,String workAddresses ){
        this.username =username ;
        this.name=name;
        this.dateOfBirth= dateOfBirth;
        this.emailAddress= emailAddress;
        this.homeAddresses= homeAddresses;
        this.password=password;
        this.workAddresses=workAddresses;
        this.surname=surname;
        this.orderedProducts=new ArrayList<>();
        this.favoriteProducts= new ArrayList<>();
        this.creditCards= new ArrayList<>();
    }

    
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name=name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress=emailAddress;
    }
    public String getHomeAddresses(){
        return homeAddresses;
    }
    public void setHomeAddresses(String homeAddresses){
        this.homeAddresses=homeAddresses;
    }
    public String getWorkAddresses(){
       return workAddresses;
    }
    public void setWorkAddresses(String workAddresses){
        this.workAddresses=workAddresses;
    }
    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }
    public void setOrderedProducts(ArrayList<Product> orderedProducts) {
        this.orderedProducts= orderedProducts;
    }
    public ArrayList<Product> getFavoriteProducts() {
        return favoriteProducts;
    }
    public void setFavouriteProducts(ArrayList<Product> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }
    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }
    public void setCreditCards(ArrayList<CreditCard> CreditCards) {
        this.creditCards= CreditCards;
    }
    
    
    public void addProductToOrder(Product orderedProduct){
        this.orderedProducts.add(orderedProduct);
        System.out.println(orderedProduct.productname().toUpperCase()+ " added to ordered products list.".toUpperCase());
     }
      public void removeProductFromOrder(Product orderedProduct){
          if(this.orderedProducts.size()>0){
              this.orderedProducts.remove(orderedProduct);
        System.out.println(orderedProduct.productname().toUpperCase()+ " removed to ordered products list.".toUpperCase());
       }
          else{
         }
      }
      
    public void addProductToFavorite(Product favoriteProduct){
         this.favoriteProducts.add(favoriteProduct);
        System.out.println(favoriteProduct.productname().toUpperCase()+ " added to your favorite products list.".toUpperCase());
        
    }
    
     public void removeProductFromFavorite(Product extractedProduct){
          if(this.favoriteProducts.size() > 0){
         this.favoriteProducts.remove(extractedProduct);
         System.out.println(extractedProduct.productname().toUpperCase() + " removed to favorite products list.".toUpperCase());
         }
         else{
             System.out.println("There are no products in favorite products.".toUpperCase());
         }
    }
   
   
      public void userinformation(){
        System.out.println("user information: ".toUpperCase()); 
        System.out.println("*****************");
        System.out.println("USERNAME: " + this.username.toUpperCase());
        System.out.println("Name: ".toUpperCase()+ this.name.toUpperCase());
        System.out.println("surname: ".toUpperCase()+ this.surname.toUpperCase());
        System.out.println("email: ".toUpperCase() + this.emailAddress);
     }

     
}