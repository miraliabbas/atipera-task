package com.atiper.atiperatask.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PermissionsDto {
    private boolean admin;
    private boolean push;
    private boolean pull;
}
