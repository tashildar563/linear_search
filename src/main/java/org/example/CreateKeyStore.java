package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.*;

public class CreateKeyStore {
    public static String readPEMFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    public static void main(String[] args) {
        String privateKeyPath = "/home/rakesh/Desktop/INT_WORK_SPACE/qa1/novopay-platform-api-gateway/src/main/java/in/novopay/apigateway/private_key.pem"; // Replace with your specific path
        String publicKeyPath = "/home/rakesh/Desktop/INT_WORK_SPACE/qa1/novopay-platform-api-gateway/src/main/java/in/novopay/apigateway/public_key.pem";   // Replace with your specific path

        try {
            String privateKeyContent = readPEMFile(privateKeyPath);
            String publicKeyContent = readPEMFile(publicKeyPath);

            System.out.println("Private Key Content:\n" + privateKeyContent);
            System.out.println("Public Key Content:\n" + publicKeyContent);
        } catch (IOException e) {
            System.err.println("Error reading PEM file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
