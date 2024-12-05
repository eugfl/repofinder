package com.repofinder.backend.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryResponse(
        String name,
        String description,
        @JsonProperty("private") boolean isPrivate,
        @JsonProperty("html_url") String htmlUrl) {
}
