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

        File fuck=new File("update_yiyangkang.txt");
        byte[] bytes= Files.readAllBytes(Path.of("update_yiyangkang.txt"));
        System.out.println(bytes.length);
        String fileContent=new String(bytes);
        JSONObject jj=new JSONObject(fileContent);
        int version=jj.getInt("version");
        System.out.println(version);
        version++;
        jj.put("version",version);
        String outString=jj.toString();
        System.out.println(outString);
        fuck.delete();
        FileOutputStream out=new FileOutputStream("update_yiyangkang.txt");
        out.write(outString.getBytes(StandardCharsets.UTF_8));
        out.close();


        SpringApplication.run(SpringWebUploadApplication.class, args);
    }

}
