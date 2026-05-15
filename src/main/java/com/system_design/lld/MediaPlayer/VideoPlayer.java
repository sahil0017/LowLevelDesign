package com.system_design.lld.MediaPlayer;

public class VideoPlayer extends MediaPlayer {
    private final String videoFile;
    private final String resolution;

    VideoPlayer(String videoFile, String resolution) {
        super("Video Player");
        this.videoFile = videoFile;
        this.resolution = resolution;
    }


    @Override
    void play() {
        logAction("Playing " + videoFile + " with " + resolution);
    }

    @Override
    void pause() {
        logAction("Pausing " + videoFile + " with " + resolution);
    }

    @Override
    void stop() {
        logAction("Stopping " + videoFile + " with " + resolution);
    }
}
