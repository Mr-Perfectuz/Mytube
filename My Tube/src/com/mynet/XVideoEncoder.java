package com.mynet;

public class XVideoEncoder implements VideoEncoder {
    @Override
    public void encode(Video video) {
        System.out.println(" Encoding Video ");
        System.out.println(" Done ... ");
    }
}
