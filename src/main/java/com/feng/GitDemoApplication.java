package com.feng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication
{

    public static void main(String[] args)
    {
        System.out.println("hello world branch-01");
        SpringApplication.run(GitDemoApplication.class, args);
    }

}
