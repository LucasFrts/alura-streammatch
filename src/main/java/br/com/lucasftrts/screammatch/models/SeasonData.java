package br.com.lucasftrts.screammatch.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SeasonData(@JsonAlias("Season") int number,
                         @JsonAlias("Episodes") List<EpisodeData> episodes
                         ) {
}
