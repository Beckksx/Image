package io.spring.image.demo.domain.service;

    import io.spring.image.demo.domain.entity.Image;
    import lombok.Getter;

    import java.util.Optional;

public interface ImageService {


    Image save (Image image);



    Optional<Image> getById(String id);
}