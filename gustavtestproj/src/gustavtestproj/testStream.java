package gustavtestproj;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

public class testStream {
	
	public enum RetailTransactionAccountCodeEnumeration {

	    UNSPECIFIED("Unspecified"),
	    HOUSE_ACCOUNT("HouseAccount"),
	    LAYAWAY("Layaway"),
	    ORDER("Order");
	    private final String value;

	    RetailTransactionAccountCodeEnumeration(String v) {
	        value = v;
	    }

	    public String value() {
	        return value;
	    }

	    public static RetailTransactionAccountCodeEnumeration fromValue(String v) {
	        for (RetailTransactionAccountCodeEnumeration c: RetailTransactionAccountCodeEnumeration.values()) {
	            if (c.value.equals(v)) {
	                return c;
	            }
	        }
	        throw new IllegalArgumentException(v);
	    }

	}
	
	public class RetailTransactionTender {

	    @XmlAttribute(name = "TenderType", required = true)
	    protected String tenderType;
	    @XmlAttribute(name = "TypeCode")
	    protected String typeCode;

	    /**
	     * Gets the value of the tenderType property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link String }
	     *     
	     */
	    public String getTenderType() {
	        return tenderType;
	    }

	    /**
	     * Sets the value of the tenderType property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link String }
	     *     
	     */
	    public void setTenderType(String value) {
	        this.tenderType = value;
	    }

	    /**
	     * Gets the value of the typeCode property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link String }
	     *     
	     */
	    public String getTypeCode() {
	        return typeCode;
	    }

	    /**
	     * Sets the value of the typeCode property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link String }
	     *     
	     */
	    public void setTypeCode(String value) {
	        this.typeCode = value;
	    }

	}

	public static void main(String[] args) {
		List<String> testList = new ArrayList<String>();
		testList.add("HouseAccount");
		boolean anyMatch = testList.stream().anyMatch(RetailTransactionAccountCodeEnumeration.HOUSE_ACCOUNT.value()::equals);
		System.out.print(anyMatch);
	}

}


