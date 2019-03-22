package ch.zuehlke.fullstack.ConnectZuehlke.domain;


import lombok.*;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Customer {
    private Integer id;
    private String name;
    private String street;
    private String city;
    private String country;
    private Integer zip;
    private Double longitude;
    private Double latitude;
}
