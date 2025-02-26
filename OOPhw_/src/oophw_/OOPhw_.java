package oophw_;

public class OOPhw_ {

    public static void main(String[] args) {
        
        User hayrunisa= new User("wizardbarnes", "Hayrunisa", "Öztürk", "14.03.2003", "ruhi123", 
                "hayrunisaozturk112@gmail.com", "Üçyol/İzmir", "Muradiye/Manisa");
        User ikra= new User ("ikrakara", "İkra ", "Kara ", "19.01.2002", "ruhi1234",
                "ikranurrkaraa@gmail.com" , "Merkez/Adıyaman", "Yunusemre/Manisa");
        System.out.println(" ");
       
         
        CreditCard creditcard1= new CreditCard("4567 8798 9905 1342" , "2535", "09/29", hayrunisa );
        CreditCard creditcard2 = new CreditCard ("7898 3290 4720 4601", "5678", "15/27" , ikra);
      
        Product nintendo = new Product ("Nintendo Switch", "Red", "Game", 1 , 250 ,
                "Oled Consol red blue ,7 inch screen  joy-con "  , "NINTENDO");
        
        Product airpods= new Product( "Airpods ", "Grey " , " Technological Devices ", 51 , 100 , 
                "2nd generation Bluetooth headset, Apple Türkiye Warrantly ", "APPLE ");
        
        Order order1= new Order(hayrunisa ,nintendo , creditcard1 , 2);
        Order order2 = new Order(ikra, airpods , creditcard2, 3 );
        
        
        hayrunisa.userinformation();
        System.out.println(" ");
        hayrunisa.addProductToFavorite(nintendo);
        System.out.println(" ");
        nintendo.productinformation();
        System.out.println(" ");
        hayrunisa.addProductToOrder(nintendo);
        order1.controlProductStock();
        System.out.println(" ");
        order1.orderProcess();
        
        System.out.println("\n-----------------------------------------\n");
        
        ikra.userinformation();
        System.out.println(" ");
        hayrunisa.addProductToFavorite(nintendo);
        hayrunisa.removeProductFromFavorite(nintendo);
        hayrunisa.addProductToOrder(airpods);
        System.out.println(" ");
        airpods.productinformation();
        System.out.println(" ");
        order2.controlProductStock();
        System.out.println(" ");
        order2.orderProcess();
        
         
       
        
        
        
        
               
        
        
        
        
    }
}