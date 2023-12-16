package hu.webler.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Dog {

    private String name;
    private boolean isMale;
    private int age;
    private String color;
}
