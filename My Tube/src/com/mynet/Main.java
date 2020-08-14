package com.mynet;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle(" Mr Perfect's Birhtday ");
        video.setUser(new User());

        var processor = new VideoProcessor(
                new XVideoEncoder(),
                new SqlVideoDatabase(),
                new EmailServices() {
                    @Override
                    public void sendEmail(Video video) {

                    }
                }
        );
        processor.process(video);
    }
}
