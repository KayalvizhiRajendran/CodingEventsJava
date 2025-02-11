package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity{
    @OneToOne(mappedBy = "eventDetails")
    private Event event;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotBlank(message = "Location is required")
    @Size(min = 3, max = 50, message = "location must be between 3 and 50 characters")
    private String location;

    public EventDetails(String description, String contactEmail, String location) {
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
    }

    public EventDetails(){}

    public @Size(max = 500, message = "Description too long!") String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 500, message = "Description too long!") String description) {
        this.description = description;
    }

    public @NotBlank(message = "Email is required") @Email(message = "Invalid email. Try again.") String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@NotBlank(message = "Email is required") @Email(message = "Invalid email. Try again.") String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public @NotBlank(message = "Location is required") @Size(min = 3, max = 50, message = "location must be between 3 and 50 characters") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "Location is required") @Size(min = 3, max = 50, message = "location must be between 3 and 50 characters") String location) {
        this.location = location;
    }
}
