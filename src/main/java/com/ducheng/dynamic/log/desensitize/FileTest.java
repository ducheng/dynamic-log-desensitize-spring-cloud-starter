package com.ducheng.dynamic.log.desensitize;

import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;

public class FileTest {

    public static void main(String[] args) {
        String fileToBase64 = fileToBase64("E:\\BookMapper.xml");
        System.out.println("eeeee:"+ fileToBase64);
    }

    public static String fileToBase64(String filePath) {
        File file = new File(filePath);
        FileInputStream inputStream ;
        try {
            inputStream = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            inputStream.read(bytes);
            inputStream.close();
            return Base64.getEncoder().encodeToString(bytes);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
