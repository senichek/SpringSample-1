package spring_test.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.apache.tomcat.jdbc.pool.DataSource;
import spring_test.Sample;


@Configuration
@EnableWebMvc
public class MvcConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setSuffix(".jsp");
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    @Bean
    public Sample getSample() {
        return new Sample();
    }

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();  // org.apache.tomcat.jdbc.pool.DataSource;
        dataSource.setUrl("jdbc:mysql://localhost:3306/namelist");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

}
