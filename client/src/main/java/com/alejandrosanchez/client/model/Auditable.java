package com.alejandrosanchez.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class Auditable {

    @Column(nullable = false)
    @JsonProperty("estado")
    private boolean active = true;

    @Column(nullable = false, updatable = false)
    @JsonProperty("fechaCreacion")
    private LocalDateTime creationDate;

    @Column(nullable = false)
    @JsonProperty("fechaModificacion")
    private LocalDateTime modificationDate;

    @PrePersist
    protected void onCreate() {
        creationDate = LocalDateTime.now();
        modificationDate = creationDate;
    }

    @PreUpdate
    protected void onUpdate() {
        modificationDate = LocalDateTime.now();
    }

}