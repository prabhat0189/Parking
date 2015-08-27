package com.as.parking.models;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PRABHAT on 8/25/2015.
 */
public class ParkingEntity {
    private String parkingName;
    private String parkingType;
    private String parkingAddress;
    private String phoneNumber;
    private String emailAddress;
    private String operatorName;
    private long pLatitude;
    private long pLongitute;
    private int totalSpaceCount;
    private int emptySpaceCount;
    private Map<Integer , Integer> rates;
    private List<String> imageURLs;
    private List<String> otherFacilities;

    public ParkingEntity() {
        rates = new LinkedHashMap<>();
        imageURLs = new ArrayList<>();
        otherFacilities = new ArrayList<>();
    }

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public String getParkingType() {
        return parkingType;
    }

    public void setParkingType(String parkingType) {
        this.parkingType = parkingType;
    }

    public String getParkingAddress() {
        return parkingAddress;
    }

    public void setParkingAddress(String parkingAddress) {
        this.parkingAddress = parkingAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public long getLatitude() {
        return pLatitude;
    }

    public void setLatitude(long pLatitude) {
        this.pLatitude = pLatitude;
    }

    public long getLongitute() {
        return pLongitute;
    }

    public void setLongitute(long pLongitute) {
        this.pLongitute = pLongitute;
    }

    public int getTotalSpaceCount() {
        return totalSpaceCount;
    }

    public void setTotalSpaceCount(int totalSpaceCount) {
        this.totalSpaceCount = totalSpaceCount;
    }

    public int getEmptySpaceCount() {
        return emptySpaceCount;
    }

    public void setEmptySpaceCount(int emptySpaceCount) {
        this.emptySpaceCount = emptySpaceCount;
    }

    public Map<Integer, Integer> getRates() {
        return rates;
    }

    public void setRates(Map<Integer, Integer> rates) {
        this.rates = rates;
    }

    public List<String> getImageURLs() {
        return imageURLs;
    }

    public void setImageURLs(List<String> imageURLs) {
        this.imageURLs = imageURLs;
    }

    public List<String> getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(List<String> otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    @Override
    public String toString() {
        return "ParkingEntity{" +
                "parkingName='" + parkingName + '\'' +
                ", parkingType='" + parkingType + '\'' +
                ", parkingAddress='" + parkingAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", operatorName='" + operatorName + '\'' +
                ", pLatitude=" + pLatitude +
                ", pLongitute=" + pLongitute +
                ", totalSpaceCount=" + totalSpaceCount +
                ", emptySpaceCount=" + emptySpaceCount +
                ", rates=" + rates +
                ", imageURLs=" + imageURLs +
                ", otherFacilities=" + otherFacilities +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParkingEntity that = (ParkingEntity) o;

        if (pLatitude != that.pLatitude) return false;
        if (pLongitute != that.pLongitute) return false;
        if (totalSpaceCount != that.totalSpaceCount) return false;
        if (emptySpaceCount != that.emptySpaceCount) return false;
        if (parkingName != null ? !parkingName.equals(that.parkingName) : that.parkingName != null)
            return false;
        if (parkingType != null ? !parkingType.equals(that.parkingType) : that.parkingType != null)
            return false;
        if (parkingAddress != null ? !parkingAddress.equals(that.parkingAddress) : that.parkingAddress != null)
            return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null)
            return false;
        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null)
            return false;
        if (operatorName != null ? !operatorName.equals(that.operatorName) : that.operatorName != null)
            return false;
        if (rates != null ? !rates.equals(that.rates) : that.rates != null) return false;
        if (imageURLs != null ? !imageURLs.equals(that.imageURLs) : that.imageURLs != null)
            return false;
        return !(otherFacilities != null ? !otherFacilities.equals(that.otherFacilities) : that.otherFacilities != null);

    }

    @Override
    public int hashCode() {
        int result = parkingName != null ? parkingName.hashCode() : 0;
        result = 31 * result + (parkingType != null ? parkingType.hashCode() : 0);
        result = 31 * result + (parkingAddress != null ? parkingAddress.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (operatorName != null ? operatorName.hashCode() : 0);
        result = 31 * result + (int) (pLatitude ^ (pLatitude >>> 32));
        result = 31 * result + (int) (pLongitute ^ (pLongitute >>> 32));
        result = 31 * result + totalSpaceCount;
        result = 31 * result + emptySpaceCount;
        result = 31 * result + (rates != null ? rates.hashCode() : 0);
        result = 31 * result + (imageURLs != null ? imageURLs.hashCode() : 0);
        result = 31 * result + (otherFacilities != null ? otherFacilities.hashCode() : 0);
        return result;
    }
}
