/**
 * INotificationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.adcenter.api.notifications;

public interface INotificationService extends java.rmi.Remote {
    public com.microsoft.adcenter.api.notifications.entities.GetNotificationsResponse getNotifications(com.microsoft.adcenter.api.notifications.GetNotificationsRequest parameters) throws java.rmi.RemoteException, com.microsoft.adcenter.api.notifications.adapi.AdApiFaultDetail, com.microsoft.adcenter.api.notifications.exception.ApiFault;
    public com.microsoft.adcenter.api.notifications.entities.GetArchivedNotificationsResponse getArchivedNotifications(com.microsoft.adcenter.api.notifications.GetArchivedNotificationsRequest parameters) throws java.rmi.RemoteException, com.microsoft.adcenter.api.notifications.adapi.AdApiFaultDetail, com.microsoft.adcenter.api.notifications.exception.ApiFault;
}
