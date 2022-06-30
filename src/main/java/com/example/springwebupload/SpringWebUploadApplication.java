package com.example.springwebupload;

import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@SpringBootApplication
public class SpringWebUploadApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringWebUploadApplication.class, args);
    }

}
