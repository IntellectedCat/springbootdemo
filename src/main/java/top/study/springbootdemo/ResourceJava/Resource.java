package top.study.springbootdemo.ResourceJava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "com.jjhe.opensource")
@PropertySource(value = "classpath:resource.yml")
//@PropertySource(value = "classpath:resource.properties")
public class Resource {

//    yml 一定要带上value，且不需要在value里添加prefix
    @Value("${name}")
    private String name;
    @Value("${website}")
    private String website;
    @Value("${language}")
    private String language;

//    properties 可以不加VALUE，加VALUE时，不可省略prefix
//    @Value("${com.jjhe.opensource.name}")
//    private String name;
//    @Value("${com.jjhe.opensource.website}")
//    private String website;
//    @Value("${com.jjhe.opensource.language}")
//    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
