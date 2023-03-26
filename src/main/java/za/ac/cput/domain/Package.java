package za.ac.cput.domain;

public class Package {
    public String bookingId;
    public String customerId;
    public String packageType;
    public String packageId;

    public Package(){}

    public String getBookingId() {
        return bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getPackageType() {
        return packageType;
    }

    public String getPackageId() {
        return packageId;
    }

    @Override
    public String toString() {
        return "Package{" +
                "bookingId='" + bookingId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", packageType='" + packageType + '\'' +
                ", packageId='" + packageId + '\'' +
                '}';
    }
}
