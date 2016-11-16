/**
 * PrendiFatturaConCodiceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.rossella;

public class PrendiFatturaConCodiceResponse  implements java.io.Serializable {
    private it.alfasoft.rossella.Fattura prendiFatturaConCodiceReturn;

    public PrendiFatturaConCodiceResponse() {
    }

    public PrendiFatturaConCodiceResponse(
           it.alfasoft.rossella.Fattura prendiFatturaConCodiceReturn) {
           this.prendiFatturaConCodiceReturn = prendiFatturaConCodiceReturn;
    }


    /**
     * Gets the prendiFatturaConCodiceReturn value for this PrendiFatturaConCodiceResponse.
     * 
     * @return prendiFatturaConCodiceReturn
     */
    public it.alfasoft.rossella.Fattura getPrendiFatturaConCodiceReturn() {
        return prendiFatturaConCodiceReturn;
    }


    /**
     * Sets the prendiFatturaConCodiceReturn value for this PrendiFatturaConCodiceResponse.
     * 
     * @param prendiFatturaConCodiceReturn
     */
    public void setPrendiFatturaConCodiceReturn(it.alfasoft.rossella.Fattura prendiFatturaConCodiceReturn) {
        this.prendiFatturaConCodiceReturn = prendiFatturaConCodiceReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrendiFatturaConCodiceResponse)) return false;
        PrendiFatturaConCodiceResponse other = (PrendiFatturaConCodiceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prendiFatturaConCodiceReturn==null && other.getPrendiFatturaConCodiceReturn()==null) || 
             (this.prendiFatturaConCodiceReturn!=null &&
              this.prendiFatturaConCodiceReturn.equals(other.getPrendiFatturaConCodiceReturn())));
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
        if (getPrendiFatturaConCodiceReturn() != null) {
            _hashCode += getPrendiFatturaConCodiceReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrendiFatturaConCodiceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rossella.alfasoft.it", ">prendiFatturaConCodiceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prendiFatturaConCodiceReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rossella.alfasoft.it", "prendiFatturaConCodiceReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rossella.alfasoft.it", "Fattura"));
        elemField.setNillable(false);
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
