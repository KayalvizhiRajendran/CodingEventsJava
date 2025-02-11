package org.launchcode.codingevents.models.dto;

import jakarta.validation.constraints.NotNull;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.Tag;

public class EventTagDTO {

    @NotNull
    private Event event;

    @NotNull
    private Tag tag;

    public EventTagDTO(Event event, Tag tag) {
        this.event = event;
        this.tag = tag;
    }
    public EventTagDTO(){}

    public @NotNull Event getEvent() {
        return event;
    }

    public void setEvent(@NotNull Event event) {
        this.event = event;
    }

    public @NotNull Tag getTag() {
        return tag;
    }

    public void setTag(@NotNull Tag tag) {
        this.tag = tag;
    }
}
