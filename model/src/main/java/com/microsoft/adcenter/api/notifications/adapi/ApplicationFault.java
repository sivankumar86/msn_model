/**
 * ApplicationFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.adcenter.api.notifications.adapi;

public class ApplicationFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.String trackingId;

    public ApplicationFault() {
    }

    public ApplicationFault(
           java.lang.String trackingId) {
        this.trackingId = trackingId;
    }


    /**
     * Gets the trackingId value for this ApplicationFault.
     * 
     * @return trackingId
     */
    public java.lang.String getTrackingId() {
        return trackingId;
    }


    /**
     * Sets the trackingId value for this ApplicationFault.
     * 
     * @param trackingId
     */
    public void setTrackingId(java.lang.String trackingId) {
        this.trackingId = trackingId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplicationFault)) return false;
        ApplicationFault other = (ApplicationFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trackingId==null && other.getTrackingId()==null) || 
             (this.trackingId!=null &&
              this.trackingId.equals(other.getTrackingId())));
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
        if (getTrackingId() != null) {
            _hashCode += getTrackingId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplicationFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adapi.microsoft.com", "ApplicationFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adapi.microsoft.com", "TrackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
