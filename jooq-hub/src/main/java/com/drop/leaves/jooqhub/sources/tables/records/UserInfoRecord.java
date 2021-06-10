/*
 * This file is generated by jOOQ.
 */
package com.drop.leaves.jooqhub.sources.tables.records;


import com.drop.leaves.jooqhub.sources.tables.UserInfo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoRecord extends UpdatableRecordImpl<UserInfoRecord> implements Record4<Integer, String, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>all-in-one.user_info.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>all-in-one.user_info.id</code>.
     */
    @NotNull
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>all-in-one.user_info.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>all-in-one.user_info.name</code>.
     */
    @Size(max = 50)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>all-in-one.user_info.age</code>.
     */
    public void setAge(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>all-in-one.user_info.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>all-in-one.user_info.addr</code>.
     */
    public void setAddr(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>all-in-one.user_info.addr</code>.
     */
    @Size(max = 255)
    public String getAddr() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return UserInfo.USER_INFO.ID;
    }

    @Override
    public Field<String> field2() {
        return UserInfo.USER_INFO.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return UserInfo.USER_INFO.AGE;
    }

    @Override
    public Field<String> field4() {
        return UserInfo.USER_INFO.ADDR;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getAge();
    }

    @Override
    public String component4() {
        return getAddr();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getAge();
    }

    @Override
    public String value4() {
        return getAddr();
    }

    @Override
    public UserInfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UserInfoRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public UserInfoRecord value3(Integer value) {
        setAge(value);
        return this;
    }

    @Override
    public UserInfoRecord value4(String value) {
        setAddr(value);
        return this;
    }

    @Override
    public UserInfoRecord values(Integer value1, String value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserInfoRecord
     */
    public UserInfoRecord() {
        super(UserInfo.USER_INFO);
    }

    /**
     * Create a detached, initialised UserInfoRecord
     */
    public UserInfoRecord(Integer id, String name, Integer age, String addr) {
        super(UserInfo.USER_INFO);

        setId(id);
        setName(name);
        setAge(age);
        setAddr(addr);
    }
}