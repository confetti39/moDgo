package org.moDgo.repository;

import org.moDgo.domain.Club;
import org.moDgo.domain.LikedClub;
import org.moDgo.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LikedClubRepository extends JpaRepository<LikedClub,Long>{
    void deleteByClub(Club club);

    LikedClub findByClubAndUser(Club club, User user);

    Page<LikedClub> findAllByUser(User user, Pageable pageable);
    List<LikedClub> findAllByUser(User user);
}
