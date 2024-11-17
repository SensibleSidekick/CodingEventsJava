package org.launchcode.codingevents.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity {
    @Size(max = 500, message = "Description too long.")
    private String description;

    @NotBlank(message="Email is required.")
    @Email(message = "Invalid email. Please try again.")
    private String contactEmail;

    public EventDetails(String description, String contactEmail) {
        this.description = description;
        this.contactEmail = contactEmail;
    }

    public EventDetails(){}

    public @Size(max = 500, message = "Description too long.") String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 500, message = "Description too long.") String description) {
        this.description = description;
    }

    public @NotBlank(message = "Email is required.") @Email(message = "Invalid email. Please try again.") String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@NotBlank(message = "Email is required.") @Email(message = "Invalid email. Please try again.") String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
