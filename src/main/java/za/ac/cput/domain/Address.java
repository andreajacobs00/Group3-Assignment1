/*
* Address POJO Class
* Author: Haydn Abrahams
* Date: 24 March
 */
package za.ac.cput.domain;
public class Address {
    private String houseNumber;
    private String streetName;
    private String suburb;
    private String postalCode;
    private String IdNumber;

    public Address(Builder builder) {
        this.houseNumber = builder.houseNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.postalCode = builder.postalCode;
        this.IdNumber = builder.IdNumber;
    }

    public Address() {
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber='" + houseNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", IdNumber=" + IdNumber +
                '}';
    }

    public static class Builder {
        private String houseNumber;
        private String streetName;
        private String suburb;
        private String postalCode;
        private String IdNumber;
        public Builder setHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setIdNumber(String idNumber) {
            IdNumber = idNumber;
            return this;
        }
        public Builder copy(Address address) {
            this.houseNumber = address.houseNumber;
            this.streetName = address.streetName;
            this.suburb = address.suburb;
            this.postalCode = address.postalCode;
            this.IdNumber = address.IdNumber;
            return this;
        }
        public Address build() {
            return new Address(this);
        }
    }
}
