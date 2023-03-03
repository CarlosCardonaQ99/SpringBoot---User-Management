package com.semillerogtc.gtcusermanagament.domain;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public String email;
    public String name;
    public String edad;
    public String fechaNacimiento;
}