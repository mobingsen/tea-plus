/*
 * This file is generated by jOOQ.
 */
package org.tea.plus.jooq.sources.tables.pojos;


import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String  name;
    private Integer age;
    private String  addr;

    public UserInfo() {}

    public UserInfo(UserInfo value) {
        this.id = value.id;
        this.name = value.name;
        this.age = value.age;
        this.addr = value.addr;
    }

    public UserInfo(
        Integer id,
        String  name,
        Integer age,
        String  addr
    ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    /**
     * Getter for <code>all-in-one.user_info.id</code>.
     */
    @NotNull
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>all-in-one.user_info.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>all-in-one.user_info.name</code>.
     */
    @Size(max = 50)
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>all-in-one.user_info.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>all-in-one.user_info.age</code>.
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * Setter for <code>all-in-one.user_info.age</code>.
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Getter for <code>all-in-one.user_info.addr</code>.
     */
    @Size(max = 255)
    public String getAddr() {
        return this.addr;
    }

    /**
     * Setter for <code>all-in-one.user_info.addr</code>.
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserInfo (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(age);
        sb.append(", ").append(addr);

        sb.append(")");
        return sb.toString();
    }
}
