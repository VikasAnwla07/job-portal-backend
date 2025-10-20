package com.jobportal.Job.Portal.utility;

public class Data {
    public static String getMessageBody(String otp,  String userName) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <title>OTP for Password Reset</title>\n" +
                "  <style>\n" +
                "    body {\n" +
                "      font-family: 'Poppins', Arial, sans-serif;\n" +
                "      background-color: #f8f9fa;\n" +
                "      color: #333;\n" +
                "      margin: 0;\n" +
                "      padding: 0;\n" +
                "    }\n" +
                "    .container {\n" +
                "      max-width: 600px;\n" +
                "      background: #ffffff;\n" +
                "      margin: 40px auto;\n" +
                "      border-radius: 8px;\n" +
                "      box-shadow: 0 4px 12px rgba(0,0,0,0.1);\n" +
                "      overflow: hidden;\n" +
                "    }\n" +
                "    .header {\n" +
                "      background-color: #fdd835; /* bright-sun-400 */\n" +
                "      color: #1a1a1a;\n" +
                "      padding: 20px;\n" +
                "      text-align: center;\n" +
                "      font-size: 22px;\n" +
                "      font-weight: 600;\n" +
                "    }\n" +
                "    .content {\n" +
                "      padding: 30px 20px;\n" +
                "      text-align: center;\n" +
                "      font-size: 16px;\n" +
                "      line-height: 1.6;\n" +
                "    }\n" +
                "    .otp-box {\n" +
                "      display: inline-block;\n" +
                "      background: #f5f5f5;\n" +
                "      padding: 12px 24px;\n" +
                "      border-radius: 6px;\n" +
                "      font-size: 24px;\n" +
                "      letter-spacing: 4px;\n" +
                "      color: #000;\n" +
                "      font-weight: 600;\n" +
                "      margin: 20px 0;\n" +
                "    }\n" +
                "    .footer {\n" +
                "      background-color: #f1f1f1;\n" +
                "      text-align: center;\n" +
                "      font-size: 13px;\n" +
                "      color: #666;\n" +
                "      padding: 15px;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <div class=\"container\">\n" +
                "    <div class=\"header\">\n" +
                "      JobHunt - OTP Verification\n" +
                "    </div>\n" +
                "    <div class=\"content\">\n" +
                "      <p>Dear " + userName + ",</p>\n" +
                "      <p>We received a request to reset your password. Please use the following One-Time Password (OTP) to complete the process:</p>\n" +
                "      <div class=\"otp-box\">"+ otp +"</div>\n" +
                "      <p>This OTP is valid for <strong>5 minutes</strong>. Please do not share it with anyone.</p>\n" +
                "      <p>If you did not request a password reset, you can safely ignore this email.</p>\n" +
                "      <p>Best regards,<br><strong>The JobHunt Team</strong></p>\n" +
                "    </div>\n" +
                "    <div class=\"footer\">\n" +
                "      © 2025 JobHunt. All rights reserved.\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</body>\n" +
                "</html>\n";
    }
}
