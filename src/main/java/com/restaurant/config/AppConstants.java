package com.restaurant.config;

public class AppConstants {

    public static final String JDBC_DRIVER = "jdbc.driver";
    public static final String JDBC_URL = "jdbc.url";
    public static final String JDBC_USERNAME = "jdbc.username";
    public static final String JDBC_PASSWORD = "jdbc.password";

    public static final String HIBERNATE_DIALECT = "hibernate.dialect";
    public static final String HIBERNATE_SHOW_SQL = "hibernate.show_sql";
    public static final String HIBERNATE_DDL_AUTO = "hibernate.ddl.auto";

    public static final String BASE_PACKAGE = "com.restaurant";
    public static final String REPOSITORIES_PACKAGE = "com.restaurant.repositories";
    public static final String ENTITIES_PACKAGE = "com.restaurant.entities";

    public static final String APPLICATION_PROPERTIES = "classpath:application.properties";

    public static final String MENUITEM_URL = "/api/v1/menuitem";
    public static final String BILL_URL = "/api/v1/bill";
    public static final String ID_URL = "/{id}";

    public static final String MENU_ITEM = "menuitem";
    public static final String BILL = "bill";
    public static final String ORDER_DETAILS = "orderdetails";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String DESCRIPTION = "description";
    public static final String IMAGE_URL = "imageURL";
    public static final String PRICE = "price";
    public static final String DETAILS = "details";
    public static final String QUANTITY = "quantity";
    public static final String ORDERED_TIME = "orderedTime";
    public static final String FK_MENUITEM_ID = "fk_menuitem_id";
    public static final String FK_BILL_ID = "fk_bill_id";
    public static final String MAPPED_MANY_TO_ONE_BILL = "bill";

    public static final String MENUITEM_REPOSITORY = "menuItemRepository";
    public static final String BILL_REPOSITORY = "billRepository";
    public static final String ORDERDETAILS_REPOSITORY = "orderDetailsRepository";

}
