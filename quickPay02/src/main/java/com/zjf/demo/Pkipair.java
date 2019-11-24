package com.zjf.demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/**
 * className:Pkipair
 * package:com.zjf.demo
 * Description:简单描述
 *
 * @date: 2019/9/11 21:05
 * @Author: ASUS
 */
public class Pkipair {

    //生成签名值
    public String signMsg( String signMsg) {
        String base64 = "";
        try {

            KeyStore ks = KeyStore.getInstance("PKCS12");
            String file = Pkipair.class.getResource("20190801.3300000002925831.pfx").getPath().replaceAll("%20", " ");
            System.out.println(file);

            FileInputStream ksfis = new FileInputStream(file);

            BufferedInputStream ksbufin = new BufferedInputStream(ksfis);

            char[] keyPwd = "123456".toCharArray();
            //char[] keyPwd = "YaoJiaNiLOVE999Year".toCharArray();
            ks.load(ksbufin, keyPwd);

            PrivateKey priK = (PrivateKey) ks.getKey("20190801.3300000002925831", keyPwd);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(priK);
            signature.update(signMsg.getBytes("utf-8"));
            sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
            base64 = encoder.encode(signature.sign());

        } catch(FileNotFoundException e){
            System.out.println("123");
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("test = "+base64);
        return base64;
    }

    //调用快钱远程接口，返回true或false
    public boolean enCodeByCer( String val, String msg) {
        boolean flag = false;
        try {
            String file = Pkipair.class.getResource("CFCA_sandbox.cer").toURI().getPath();//99bill[1].cert.rsa.20140803.cer
            System.out.println(file);                       //  99bill.cert.rsa.20140803.cer
            FileInputStream inStream = new FileInputStream(file);

            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            X509Certificate cert = (X509Certificate) cf.generateCertificate(inStream);

            PublicKey pk = cert.getPublicKey();

            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(pk);
            signature.update(val.getBytes());

            sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
            System.out.println(new String(decoder.decodeBuffer(msg)));
            flag = signature.verify(decoder.decodeBuffer(msg));
            System.out.println(flag);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no");
        }
        return flag;
    }
    public static void main(String[] args) {
        Pkipair pki = new Pkipair(); //??????
        String SignMsgVal ="merchantAcctId=1021003953301&version=mobile1.0&language=1&signType=4&payType=21-2&bankId=BCOM&orderId=2018032910121665202&orderTime=20180329100333&orderAmount=894500&bindCard=6222529423&bindMobile=1587890&dealId=2968879337&bankDealId=180329547055&dealTime=20180329101345&payAmount=894500&payResult=10";
        String signMsg ="1XMobyjhx9znxGQNb2EQEojLXaGFVTTxMUv/GT+pbXLGrP+5GsJNdS/h6rkcI9UsQPsjRtI9dtW7TMI7V/Q4xvCLAsIfT/3Y65oyzvEVB9Zu/5fmQUrTkOOvMjyvU4S+2Wliaw9GaVdJszCrcBW0uPF+4YAb/+HbvvDxouCFuM4XG19RTXdUpoFxPF8eUVI/X5zp6Sf3MEFBNK0JUjuIKu2+/wL0426zM2qUtrbO/h7QTiJvNAF9MxZgjXt1WFCi7nH+Aktiwwp8+Q5vIWbfk7+UvB9EpW5aA5TxlgKnjuWZ0EA7TOHrUmFteJ3HNJJbW0l+OFChcpzoguFfWUUSKA==";
        boolean flag = pki.enCodeByCer(SignMsgVal,signMsg);
        System.out.println("是否成功返回充值页面："+flag);
    }
}
