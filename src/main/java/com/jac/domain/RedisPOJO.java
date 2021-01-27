package com.jac.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：jacketzc
 * Created in 2021/1/27 21:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RedisPOJO implements Serializable {

    private String name;

    private Integer age;
}
