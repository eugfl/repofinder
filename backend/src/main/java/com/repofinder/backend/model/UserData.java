package com.repofinder.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UserData(
                String login,
                @JsonProperty("html_url") String htmlUrl) {
}
