package com.sinaungoding.hibernate.inheritance.dao;

import com.sinaungoding.hibernate.inheritance.entitas.Mahasiswa;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MahasiswaDao extends PagingAndSortingRepository<Mahasiswa, Long> {
}
