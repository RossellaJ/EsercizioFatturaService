/**
 * PrendiTutteFattureResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.rossella;

public class PrendiTutteFattureResponse  implements java.io.Serializable {
    private java.lang.Object[] prendiTutteFattureReturn;

    public PrendiTutteFattureResponse() {
    }

    public PrendiTutteFattureResponse(
           java.lang.Object[] prendiTutteFattureReturn) {
           this.prendiTutteFattureReturn = prendiTutteFattureReturn;
    }


    /**
     * Gets the prendiTutteFattureReturn value for this PrendiTutteFattureResponse.
     * 
     * @return prendiTutteFattureReturn
     */
    public java.lang.Object[] getPrendiTutteFattureReturn() {
        return prendiTutteFattureReturn;
    }


    /**
     * Sets the prendiTutteFattureReturn value for this PrendiTutteFattureResponse.
     * 
     * @param prendiTutteFattureReturn
     */
    public void setPrendiTutteFattureReturn(java.lang.Object[] prendiTutteFattureReturn) {
        this.prendiTutteFattureReturn = prendiTutteFattureReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrendiTutteFattureResponse)) return false;
        PrendiTutteFattureResponse other = (PrendiTutteFattureResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prendiTutteFattureReturn==null && other.getPrendiTutteFattureReturn()==null) || 
             (this.prendiTutteFattureReturn!=null &&
              java.util.Arrays.equals(this.prendiTutteFattureReturn, other.getPrendiTutteFattureReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPrendiTutteFattureReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrendiTutteFattureReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrendiTutteFattureReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrendiTutteFattureResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rossella.alfasoft.it", ">prendiTutteFattureResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prendiTutteFattureReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rossella.alfasoft.it", "prendiTutteFattureReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rossella.alfasoft.it", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
