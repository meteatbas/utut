package com.academicerp.backend.Bean;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PostTagId implements Serializable {

    @Column(name = "post_id")
    private Long postId;

    public PostTagId(Long postId, Long tagId) {
        this.postId = postId;
        this.tagId = tagId;
    }

    @Column(name = "tag_id")
    private Long tagId;

    public PostTagId() {
    }

   /* private PostTagId() {}

    public PostTagId(
            Long postId,
            Long tagId) {
        this.postId = postId;
        this.tagId = tagId;
    }*/

    //Getters omitted for brevity

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PostTagId that = (PostTagId) o;
        return Objects.equals(postId, that.postId) &&
                Objects.equals(tagId, that.tagId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, tagId);
    }
}
