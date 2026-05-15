package com.system_design.lld.MediaPlayer;

public class PlayerController {
    private final MediaPlayer mediaPlayer;

    PlayerController(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void startPlayback() {
        mediaPlayer.displayStatus();
        mediaPlayer.play();
    }

    public void pausePlayBack() {
        mediaPlayer.displayStatus();
        mediaPlayer.pause();
    }

    public void stopPlayBack() {
        mediaPlayer.displayStatus();
        mediaPlayer.stop();
    }
}
