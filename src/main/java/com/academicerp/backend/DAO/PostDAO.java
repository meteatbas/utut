package com.academicerp.backend.DAO;

import com.academicerp.backend.Bean.Post;
import com.academicerp.backend.Bean.PostTag;
import com.academicerp.backend.Bean.Tag;
import com.academicerp.backend.DAO.Interfaces.PostDAOInterface;
import com.academicerp.backend.Dto.BookDTO;
import com.academicerp.backend.Dto.CarPersonRequestDTO;
import com.mysql.cj.Session;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

public class PostDAO implements PostDAOInterface {
    @Override
    public List<BookDTO> getAllPost(CarPersonRequestDTO carPersonRequestDTO) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("doctorDatabase");
//        session.close();
        jakarta.persistence.EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

//        Tag misc = new Tag();
//
//        Post hpjp2 = new Post(
//                "High-Performance Java Persistence 2nd edition"
//        );

//        entityManager.persist(hpjp2);
//        Post hpjp1 = new Post(
//                "High-Performance Java Persistence 1st edition"
//        );
        PostTag hpjp3 = new PostTag(new Post(
                carPersonRequestDTO.getFirstName()
        ), new Tag(carPersonRequestDTO.getCarName()));
//        List<PostTag> postTags=new ArrayList<>();
//        Tag tag=new Tag("Tag4");
//        hpjp3.getTag().setPosts(postTags);
//        hpjp3.getPost().addTag(tag);
//        hpjp3.setPost(hpjp2);
//        hpjp3.setTag(misc);

//        postList.add(hpjp3);
//        misc.setPosts(postList);
        entityManager.persist( hpjp3 );
        transaction.commit();

        List<BookDTO> bookDTOS=new ArrayList<>();

        return bookDTOS;
    }

    @Override
    public List<BookDTO> getPosts() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("doctorDatabase");
//        session.close();
        jakarta.persistence.EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        //try (Session session = SessionUtil.getSession()) {
//            Query<Book> query = session.createQuery("from Book r ", Book.class);
        TypedQuery<Post> query = (TypedQuery) entityManager.createQuery("from Post r", Post.class);

        List<Post> bookList = query.getResultList();

        TypedQuery<BookDTO> queryt = entityManager.createQuery("select " +
                "new com.academicerp.backend.Dto.BookDTO(p.title,t.name) " +
                "from Post p , Tag t , PostTag pt where p.id=pt.post.id and t.id=pt.tag.id ", BookDTO.class);



        List<BookDTO> list = queryt.getResultList();
        return list;
    }
}
