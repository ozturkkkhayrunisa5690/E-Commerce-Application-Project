package oophw_;

public class Product {
    private String productName;
    private String productColour;
    private String productCategory;
    private int productStock;
    private int productWeight;
    private String productDescription;
    private String productBrand;
    
     public Product(String productName, String productColour, String productCategory, int productStock, int productWeight, String productDescription, String productBrand ) {
        this.productName = productName;
        this.productColour = productColour;
        this.productCategory = productCategory;
        this.productStock = productStock;
        this.productWeight = productWeight;
        this.productDescription = productDescription;
        this.productBrand=productBrand;
      
    }
    
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductColour() {
        return productColour;
    }
    public void setProductColour(String productColour) {
        this.productColour = productColour;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public int getProductStock() {
        return productStock;
    }
    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
    public int getProductWeight() {
        return productWeight;
    }
    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }
    public String getProductBrand(){
        return productBrand;
    }
    public void setProductBrand(String productBrand){
        this.productBrand=productBrand;
    }
    
    
    
    public boolean reduceNumofStock(int numberofProducts) {
         System.out.println("Number of products stock before order: ".toUpperCase() + this.productStock);
        if (this.productStock >= numberofProducts) {
          this.productStock-= numberofProducts;
           return true;
        } else {
            System.out.println("Number Of products ordered: ".toUpperCase()+ numberofProducts);
            return false;
        }
            
    }
    
    public boolean productcontrol(){
        if(this.productStock>0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String productname(){
        return this.productName;
     }
   
     public void productinformation(){
        System.out.println("PRODUCT FEATURES:");
        System.out.println("NAME: " + getProductName().toUpperCase());
        System.out.println("COLOR: " + getProductColour());
        System.out.println("WEIGHT: " + getProductWeight());
        System.out.println("CATEGORY: " + getProductCategory());
        System.out.println("DESCRIPTION: "  + getProductDescription());
        System.out.println("BRAND: " + getProductBrand());
       
     }
    

}