package com.mynet;

public class XEmailServices implements EmailServices {
    @Override
    public void sendEmail(Video video) {
        System.out.println(" Sending Email");
        System.out.println(" Done ! ");
    }

    public void sendEmail(User user) {
    }
}
