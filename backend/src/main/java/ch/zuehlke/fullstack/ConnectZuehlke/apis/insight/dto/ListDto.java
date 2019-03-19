package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListDto<T> {

    @JsonProperty("Items")
    private List<T> items;
    @JsonProperty("Count")
    private int count;

    public List<T> getItems() {
        return items;
    }

    public int getCount() {
        return count;
    }
}
