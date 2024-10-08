package com.sales_api.domain.dtos.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRequestDto {
    private String name;
    private String email;
    private String password;
    private String document;
    private Boolean is_active;
}