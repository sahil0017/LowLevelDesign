package com.system_design.lld.MediaPlayer;

public class MediaPlayerMainApp {
    public static void main(String []args) {
        PlayerController audioPlayer = new PlayerController(new AudioPlayer("https://noaudio.com"));
        audioPlayer.startPlayback();
        audioPlayer.pausePlayBack();
        audioPlayer.stopPlayBack();

        System.out.println("\n");

        PlayerController videoPlayer = new PlayerController((new VideoPlayer("https://novideo.com", "1000px")));
        videoPlayer.startPlayback();
        videoPlayer.pausePlayBack();
        videoPlayer.stopPlayBack();

        System.out.println("\n");

        PlayerController streamingPlayer = new PlayerController((new StreamingPlayer("https://novideo.com", 3456789)));
        streamingPlayer.startPlayback();
        streamingPlayer.pausePlayBack();
        streamingPlayer.stopPlayBack();


    }
}
