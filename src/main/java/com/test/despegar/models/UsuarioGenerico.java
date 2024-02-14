package com.test.despegar.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class UsuarioGenerico {
    /** login despegar */
    private final String user;
    private final String password;
}
