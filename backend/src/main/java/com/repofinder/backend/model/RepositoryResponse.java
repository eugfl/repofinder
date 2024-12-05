package com.repofinder.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryResponse(
                String name,
                String description,
                @JsonProperty("private") boolean isPrivate,
                @JsonProperty("html_url") String htmlUrl) {
}
