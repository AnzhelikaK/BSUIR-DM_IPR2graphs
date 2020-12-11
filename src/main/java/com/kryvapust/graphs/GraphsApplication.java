package com.kryvapust.graphs;
import com.kryvapust.graphs.gr.MainFlow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GraphsApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GraphsApplication.class, args);
        MainFlow mainFlow = context.getBean(MainFlow.class);
        mainFlow.start();
    }
}
