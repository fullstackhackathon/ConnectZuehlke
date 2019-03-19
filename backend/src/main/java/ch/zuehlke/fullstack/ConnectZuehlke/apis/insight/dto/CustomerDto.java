package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Customer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class CustomerDto {
    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Street")
    private String street;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Zip")
    private Integer zip;
    @JsonProperty("Longitude")
    private Double longitude;
    @JsonProperty("Latitude")
    private Double latitude;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Integer getZip() {
        return zip;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }


    public Customer toCustomer() {
        return new Customer(
                getId(),
                getName(),
                getStreet(),
                getCity(),
                getCountry(),
                getZip(),
                getLongitude(),
                getLatitude()
        );
    }
}
