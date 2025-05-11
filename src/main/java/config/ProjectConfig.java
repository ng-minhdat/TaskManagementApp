package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"service", "proxy", "repository", "aspect"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
