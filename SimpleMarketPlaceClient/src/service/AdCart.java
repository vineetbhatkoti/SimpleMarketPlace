
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adCart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adCart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advertisementId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cartId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantityOrdered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adCart", propOrder = {
    "advertisementId",
    "cartId",
    "quantityOrdered",
    "totalPrice",
    "userName"
})
public class AdCart {

    protected int advertisementId;
    protected int cartId;
    protected int quantityOrdered;
    protected int totalPrice;
    protected int userName;

    /**
     * Gets the value of the advertisementId property.
     * 
     */
    public int getAdvertisementId() {
        return advertisementId;
    }

    /**
     * Sets the value of the advertisementId property.
     * 
     */
    public void setAdvertisementId(int value) {
        this.advertisementId = value;
    }

    /**
     * Gets the value of the cartId property.
     * 
     */
    public int getCartId() {
        return cartId;
    }

    /**
     * Sets the value of the cartId property.
     * 
     */
    public void setCartId(int value) {
        this.cartId = value;
    }

    /**
     * Gets the value of the quantityOrdered property.
     * 
     */
    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    /**
     * Sets the value of the quantityOrdered property.
     * 
     */
    public void setQuantityOrdered(int value) {
        this.quantityOrdered = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     */
    public void setTotalPrice(int value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     */
    public int getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     */
    public void setUserName(int value) {
        this.userName = value;
    }

}
