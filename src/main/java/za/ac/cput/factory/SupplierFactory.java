package za.ac.cput.factory;

import za.ac.cput.domain.Supplier;
import za.ac.cput.util.Helper;
/*
 * Author: Ayanda Mcengwa
 * Student No: 218335989
 * Subject: Applications development practice 3
 * Term 4 Submission
 * This is the Supplier factory method where objects are created
 * due date: 22/10/2023
 * */
public class SupplierFactory {
    public static Supplier createSupplier( String companyName, String phoneNumber, String emailAddress, String pickupAddress) {
        if(Helper.isNullOrEmpty(companyName) || Helper.isNullOrEmpty((phoneNumber)) || Helper.isNullOrEmpty(emailAddress)){

        }
        String supplierId = Helper.generateId();
        if(!Helper.isValidEmail(emailAddress)){
            return null;
        }
        Supplier supplier = new Supplier.Builder()
                .setSupplierId(supplierId)
                .setCompanyName(companyName)
                .setPhoneNumber(phoneNumber)
                .setEmailAddress(emailAddress)
                .setPickupAddress(pickupAddress)
                .build();
        return supplier;
    }

}
