package com.mynet;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private EmailServices emailServices;

    public VideoProcessor(
            VideoEncoder encoder,
            VideoDatabase database,
            EmailServices emailServices ) {
        this.encoder = encoder;
        this.database = database;
        this.emailServices = emailServices;
    }

    public void process(Video video){
        encoder.encode(video);
        database.store(video);
        emailServices.sendEmail(video.getUser());

    }

}
