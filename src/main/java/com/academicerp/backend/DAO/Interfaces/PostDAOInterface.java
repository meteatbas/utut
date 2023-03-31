package com.academicerp.backend.DAO.Interfaces;

import com.academicerp.backend.Dto.BookDTO;
import com.academicerp.backend.Dto.CarPersonRequestDTO;

import java.util.List;

public interface PostDAOInterface {
    List<BookDTO> getAllPost(CarPersonRequestDTO carPersonRequestDTO);

    List<BookDTO> getPosts();
}
