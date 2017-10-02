package com.foxgang.teamcity.msTeams;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MSTeamsEmoticon {
	
	@JsonProperty("id")
	public String id;

	@JsonProperty("links")
	public MSTeamsApiResponseLinks links;
	
	@JsonProperty("shortcut")
	public String shortcut;

	@JsonProperty("url")
	public String url;
		
	public MSTeamsEmoticon() {
		// Intentionally left empty
	}
	
	public MSTeamsEmoticon(String id, MSTeamsApiResponseLinks links, String shortcut, String url) {
		this.id = id;
		this.links = links;
		this.shortcut = shortcut;
		this.url = url;
	}
}