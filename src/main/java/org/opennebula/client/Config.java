package org.opennebula.client;

import java.time.Duration;

/**
 * Client Timeouts Configuration
 */
public class Config {

    private final Duration connectionTimeout;

    private final Duration replyTimeout;

    public Config(final Duration connectionTimeout,
                  final Duration replyTimeout) {
        this.connectionTimeout = connectionTimeout;
        this.replyTimeout = replyTimeout;
    }

    public Duration getConnectionTimeout() {
        return connectionTimeout;
    }
    public Duration getReplyTimeout() {
        return replyTimeout;
    }

}
