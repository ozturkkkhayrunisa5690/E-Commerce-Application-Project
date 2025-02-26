package oophw_;

public class CreditCard {
    
    private String creditCardNumber;
    private User creditCardUser;
    private String securityCode;
    private String expdateCredit;
    
    public CreditCard (String  creditCardNumber, String securityCode, String expdateCredit, User creditCardUser){
        this.creditCardNumber=creditCardNumber;
        this.creditCardUser= creditCardUser;
        this.expdateCredit= expdateCredit;
        this.securityCode=securityCode;
    }
    
    public String getCreditCardNumber() {
        return creditCardNumber;
    }
     public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber =creditCardNumber;
    }
     public User getCreditCardUser() {
        return creditCardUser;
    }
    public void setCreditCardUser(User creditCardUser) {
        this.creditCardUser= creditCardUser;
    }
    public String getExpdateCredit() {
        return expdateCredit;
    }
    public void setExpdateCredit(String expdateCredit) {
        this.expdateCredit=expdateCredit;
    }
    public String getSecurityCode() {
        return securityCode;
    }
    public void setSecurityCode(String securityCode){
        this.securityCode=securityCode;
    }
}