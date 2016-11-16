/**
 * FatturaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.rossella;

public interface FatturaService extends java.rmi.Remote {
    public it.alfasoft.rossella.Fattura prendiFatturaConCodice(java.lang.String codiceCliente) throws java.rmi.RemoteException;
    public java.lang.Object[] prendiTutteFatture() throws java.rmi.RemoteException;
}
