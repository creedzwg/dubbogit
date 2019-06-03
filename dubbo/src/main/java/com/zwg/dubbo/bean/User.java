package com.zwg.dubbo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: 张文刚
 * @Date: 2019/03/17  17:17
 * @Version: V1.0
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 4332562111296445905L;
    private Integer id;

    private String name;
}
