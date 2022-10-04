package medio.sacola.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration

public class SwaggerConfig {
    @Bean
    public Docket getBean(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .paths(PathSelectors.regex("/ifood-devweek/.*"))
                .build()
                .apiInfo(getinfo());
    }
   private ApiInfo getinfo(){
        return new ApiInfoBuilder()
                .title("Sacola API")
                .description("Sacola API para Servir uma aplicação delivery")
                .build();
   }
}
