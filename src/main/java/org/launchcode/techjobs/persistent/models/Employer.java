package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message="This field cannot be blank")
    @Size(max = 100)
    private String location;

    @OneToMany
    @JoinColumn (name = "employer_id")

    public void setLocation(String saint_louis) {
    }
}
