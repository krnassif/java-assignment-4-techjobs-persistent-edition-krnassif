package org.launchcode.techjobs.persistent.models.data;

import java.util.Optional;

public interface EmployerRepository {
    Object findAll();

    Optional findById(int employerId);
}
