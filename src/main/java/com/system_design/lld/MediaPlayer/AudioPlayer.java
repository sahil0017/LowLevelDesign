package com.system_design.lld.MediaPlayer;

public class AudioPlayer extends MediaPlayer {
    private final String audioFile;

    public AudioPlayer(String audioFile) {
        super("AudioPlayer");
        this.audioFile = audioFile;
    }

    @Override
    void play() {
        logAction("Playing Audio " + audioFile);
    }

    @Override
    void pause() {
        logAction("Pausing Audio " + audioFile);
    }

    @Override
    void stop() {
        logAction("Stopping Audio " + audioFile);
    }
}
