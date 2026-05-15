package com.system_design.lld.MediaPlayer;

public class StreamingPlayer extends MediaPlayer {
    private final String streamURL;
    private final int bufferSize;

    StreamingPlayer(String streamURL, int bufferSize) {
        super("Streaming Player");
        this.streamURL = streamURL;
        this.bufferSize = bufferSize;
    }

    @Override
    void play() {
        logAction("Playing " + streamURL + " with buffer size "+ bufferSize);
    }

    @Override
    void pause() {
        logAction("Pausing " + streamURL + " with buffer size "+ bufferSize);
    }

    @Override
    void stop() {
        logAction("Stopping " + streamURL + " with buffer size "+ bufferSize);
    }
}
