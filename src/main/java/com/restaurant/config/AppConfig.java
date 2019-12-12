package com.restaurant.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * This class is to initialize configuration for the application
 * 
 * @author thuan
 *
 */
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@PropertySource( AppConstants.APPLICATION_PROPERTIES )
@ComponentScan( basePackages = AppConstants.BASE_PACKAGE )
@EnableJpaRepositories( basePackages = AppConstants.REPOSITORIES_PACKAGE )
public class AppConfig {

    @Autowired
    private Environment environment;

    public AppConfig() {
	super();
    }

    /**
     * Configure the data source bean
     * 
     * @return
     */
    @Bean
    public DataSource dataSource() {
	final DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName( environment.getProperty( AppConstants.JDBC_DRIVER ) );
	dataSource.setUrl( environment.getProperty( AppConstants.JDBC_URL ) );
	dataSource.setUsername( environment.getProperty( AppConstants.JDBC_USERNAME ) );
	dataSource.setPassword( environment.getProperty( AppConstants.JDBC_PASSWORD ) );

	return dataSource;
    }

    /**
     * Configure the Entity Manager Factory Bean
     * 
     * @return
     */
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	final LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
	entityManagerFactoryBean.setDataSource( dataSource() );
	entityManagerFactoryBean.setPackagesToScan( new String[] { AppConstants.ENTITIES_PACKAGE } );

	final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	entityManagerFactoryBean.setJpaVendorAdapter( vendorAdapter );
	entityManagerFactoryBean.setJpaProperties( initProperties() );

	return entityManagerFactoryBean;
    }

    /**
     * Initialize properties from property file
     * 
     * @return
     */
    final Properties initProperties() {
	final Properties hibernateProperties = new Properties();
	hibernateProperties.setProperty( AppConstants.HIBERNATE_DIALECT, environment.getProperty( AppConstants.HIBERNATE_DIALECT ) );
	hibernateProperties.setProperty( AppConstants.HIBERNATE_DDL_AUTO, environment.getProperty( AppConstants.HIBERNATE_DDL_AUTO ) );
	hibernateProperties.setProperty( AppConstants.HIBERNATE_SHOW_SQL, environment.getProperty( AppConstants.HIBERNATE_SHOW_SQL ) );

	return hibernateProperties;
    }

    /**
     * Configure the Transaction Manager Bean
     * 
     * @param entityManagerFactory
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager( final EntityManagerFactory entityManagerFactory ) {
	final JpaTransactionManager transactionManager = new JpaTransactionManager();
	transactionManager.setEntityManagerFactory( entityManagerFactory );
	return transactionManager;
    }

    /**
     * Applies persistence exception translation to the beans
     * 
     * @return
     */
    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
	return new PersistenceExceptionTranslationPostProcessor();
    }
}