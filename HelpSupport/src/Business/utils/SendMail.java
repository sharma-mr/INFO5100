/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.utils;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Mrinal Sharma
 */
public class SendMail {
    public static void sendMail(String text, String recipient)  
   {     
  final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
  // Get a Properties object
     Properties props = System.getProperties();
     props.setProperty("mail.smtp.host", "smtp.gmail.com");
     props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
     props.setProperty("mail.smtp.socketFactory.fallback", "false");
     props.setProperty("mail.smtp.port", "465");
     props.setProperty("mail.smtp.socketFactory.port", "465");
     props.put("mail.smtp.auth", "true");
     props.put("mail.debug", "true");
     props.put("mail.store.protocol", "pop3");
     props.put("mail.transport.protocol", "smtp");
     final String username = "mrinalsharma20206@gmail.com";//
     final String password = "@3IwbvsmmS@3";
     try{
     Session session = Session.getDefaultInstance(props, 
                          new Authenticator(){
                             protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(username, password);
                             }});

   // -- Create a new message --
     Message msg = new MimeMessage(session);

  // -- Set the FROM and TO fields --
     msg.setFrom(new InternetAddress("mrinalsharma20206@gmail.com"));
     msg.setRecipients(Message.RecipientType.TO, 
                      InternetAddress.parse(recipient,false));
     msg.setSubject("OTP");
     msg.setText(text);
     Transport.send(msg);
  }catch (MessagingException e){ System.out.println("Erreur d'envoi, cause: " + e);}
  }
}
