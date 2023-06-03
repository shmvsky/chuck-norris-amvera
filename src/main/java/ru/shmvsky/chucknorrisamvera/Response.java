package ru.shmvsky.chucknorrisamvera;

import java.time.LocalDateTime;

public class Response {
    private final String fact;
    private final LocalDateTime time;

    public Response(String fact) {
        this.fact = fact;
        this.time = LocalDateTime.now();
    }

    public String getFact() {
        return fact;
    }

    public LocalDateTime getTime() {
        return time;
    }

}
