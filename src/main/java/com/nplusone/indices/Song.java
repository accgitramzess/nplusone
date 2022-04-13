package com.nplusone.indices;

import org.springframework.data.domain.Example;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Song {

    @EmbeddedId
    /// Embedded
    //Example
    private CompositeSongId compositeSongId;
}
