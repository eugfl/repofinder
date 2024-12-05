package com.repofinder.backend.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UserData(
        String login,
        @JsonProperty("html_url") String htmlUrl) {
}
