package com.wbb.hello.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * hello
 * @author 
 */
@Data
public class Hello implements Serializable {
    private Integer id;

    private String name;

    private String age;


}