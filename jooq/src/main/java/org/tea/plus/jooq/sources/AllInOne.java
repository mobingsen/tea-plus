/*
 * This file is generated by jOOQ.
 */
package org.tea.plus.jooq.sources;


import org.tea.plus.jooq.sources.tables.UserInfo;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AllInOne extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>all-in-one</code>
     */
    public static final AllInOne ALL_IN_ONE = new AllInOne();

    /**
     * The table <code>all-in-one.user_info</code>.
     */
    public final UserInfo USER_INFO = UserInfo.USER_INFO;

    /**
     * No further instances allowed
     */
    private AllInOne() {
        super("all-in-one", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            UserInfo.USER_INFO);
    }
}
