package com.foxgang.teamcity.msTeams;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

// See: https://www.hipchat.com/docs/apiv2/method/get_all_rooms
public class MSTeamsEmoticons {

	@JsonProperty("items")
	public List<MSTeamsEmoticon> items;

	@JsonProperty("startIndex")
	public int startIndex;

	@JsonProperty("maxResults")
	public int maxResults;

	@JsonProperty("links")
	public MSTeamsApiResultLinks links;

	public MSTeamsEmoticons() {
		// Intentionally left empty
	}

	public MSTeamsEmoticons(List<MSTeamsEmoticon> items, int startIndex, int maxResults, MSTeamsApiResultLinks links) {
		this.items = items;
		this.startIndex = startIndex;
		this.maxResults = maxResults;
		this.links = links;
	}
}