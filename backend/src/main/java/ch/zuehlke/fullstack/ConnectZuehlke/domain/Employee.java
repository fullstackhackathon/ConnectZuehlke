package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import lombok.*;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Employee {

    private String firstName;
    private String lastName;
    private int id;
    private String code;

    public static Employee of(String firstName, String lastName, int id) {
        String code = firstName.substring(0, 1) + lastName.substring(0, 2);
        return Employee.builder()
                .firstName(firstName)
                .lastName(lastName)
                .id(id)
                .code(code)
                .build();
    }
}
