package com.lslnx.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lslnx
 * on 2017/2/18.
 * @author lslnx_0307
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        new SpringApplication(Application.class).run(args);
    }
}
