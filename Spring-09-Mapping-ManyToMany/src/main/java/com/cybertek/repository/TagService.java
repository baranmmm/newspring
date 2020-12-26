package com.cybertek.repository;

import com.cybertek.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagService extends JpaRepository<Tag,Integer> {
}
