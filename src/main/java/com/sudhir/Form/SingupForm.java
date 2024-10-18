package com.sudhir.Form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class SingupForm {

    private String name;
    private String email;
    private String password;
    private String about;
    private String profilePic;
    private String phone;

}
