package com.heflat.jutils.util;

import com.heflat.jutils.common.Const;
import com.heflat.jutils.enums.CodeEnum;
import com.heflat.jutils.exception.JUtilsException;
import lombok.extern.slf4j.Slf4j;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * 邮件工具类
 *
 * @author heflat
 * @date 2018-08-07 09:02
 */
@Slf4j
public class MailUtil {

    /**
     * 发送邮件
     * @param to
     * @param subject
     * @param content
     */
    public static void sendMail(String to, String subject, String content) {
        // 1. 创建连接对象，连接到邮件服务器
        Properties prop = new Properties();
        prop.put("mail.smtp.host", Const.SERVER_MAIL_SMTP_HOST);
        prop.put("mail.smtp.port", Const.SERVER_MAIL_SMTP_PORT);
        prop.put("mail.smtp.auth", Const.SERVER_MAIL_SMTP_AUTH);

        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(Const.SERVER_MAIL_USERNAME, Const.SERVER_MAIL_PASSWORD);
            }
        });

        try {
            // 2. 创建消息对象
            Message message = new MimeMessage(session);
            // 发件人
            message.setFrom(new InternetAddress(Const.SERVER_MAIL_USERNAME));
            // 收件人
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            // 邮件主题
            message.setSubject(subject);
            // 邮件内容
            message.setContent(content, "text/html;charset=utf-8");
            // 发送时间
            message.setSentDate(new Date());

            // 3. 发送邮件
            Transport.send(message);
        } catch (MessagingException e) {
            log.error("【发送邮件】异常，e={}", e);
            throw new JUtilsException(CodeEnum.SEND_MAIL_ERROR);
        }
    }
}