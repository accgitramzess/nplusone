package com.nplusone.indices;

import javax.persistence.Embeddable;
import java.io.Serializable;

/*
The annotation @Embeddable is to tell that this is a Composite Id class and can be embedded into an entity bean.
 *
 */
@Embeddable
public class CompositeSongId implements Serializable {

    private String name;

    private String album;

    private String artist;
}
