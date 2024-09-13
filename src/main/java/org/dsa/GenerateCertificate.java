//package org.dsa;
//
//import javax.security.auth.x500.X500Principal;
//import java.security.*;
//import java.security.cert.CertificateException;
//import java.security.cert.X509Certificate;
//import java.util.Date;
//
//public class GenerateCertificate {
//    public static void main(String[] args) {
//
//    }
//    public static KeyPair generateKeyPair() throws NoSuchAlgorithmException {
//        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
//        keyGen.initialize(2048);
//        return keyGen.generateKeyPair();
//    }
//    public static X509Certificate generateCertificate(KeyPair keyPair) throws CertificateException, IOException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
//        long now = System.currentTimeMillis();
//        Date startDate = new Date(now);
//
//        X500Principal dnName = new X500Principal("CN=Test Certificate");
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(startDate);
//        calendar.add(Calendar.YEAR, 1);
//        Date endDate = calendar.getTime();
//
//        BigInteger certSerialNumber = new BigInteger(Long.toString(now));
//        String signatureAlgorithm = "SHA256withRSA";
//
//        ContentSigner contentSigner = new JcaContentSignerBuilder(signatureAlgorithm).build(keyPair.getPrivate());
//
//        X509v3CertificateBuilder certBuilder = new JcaX509v3CertificateBuilder(
//                dnName, certSerialNumber, startDate, endDate, dnName, keyPair.getPublic());
//
//        return new JcaX509CertificateConverter().getCertificate(certBuilder.build(contentSigner));
//    }
//}
