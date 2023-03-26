package za.ac.cput.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Bookings {
    private String customerId;
    private LocalDate date;
    private LocalTime time;
    private String bookingId;
    private Package aPackage;
    private double price;

    public Bookings(Builder builder){
        this.customerId = builder.customerId;
        this.date = builder.date;
        this.time = builder.time;
        this.bookingId = builder.bookingId;
        this.aPackage = builder.aPackage;
        this.price = builder.price;
    }

    public Bookings(){}

    public String getCustomerId() {
        return customerId;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "customerId='" + customerId + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", bookingId='" + bookingId + '\'' +
                ", aPackage=" + aPackage +
                ", price=" + price +
                '}';
    }

    public static class Builder{
        private String customerId;
        private LocalDate date;
        private LocalTime time;
        private String bookingId;
        private Package aPackage;
        private double price;

        public Builder setCustomerId(String customerId){
            this.customerId = customerId;
            return this;
        }

        public Builder setDate(LocalDate date){
            this.date = date;
            return this;
        }

        public Builder setTime(LocalTime time){
            this.time = time;
            return this;
        }

        public Builder setBookingId(String bookingId){
            this.bookingId = bookingId;
            return this;
        }

        public Builder setAPackage(Package aPackage){
            this.aPackage = aPackage;
            return this;
        }

        public Builder setPrice(double price){
            this.price = price;
            return this;
        }

        public Builder copy(Bookings bookings){
            this.customerId = bookings.customerId;
            this.date = bookings.date;
            this.time = bookings.time;
            this.bookingId = bookings.bookingId;
            this.aPackage = bookings.aPackage;
            this.price = bookings.price;
            return this;
        }

        public Bookings build(){return new Bookings(this);}
    }
}
