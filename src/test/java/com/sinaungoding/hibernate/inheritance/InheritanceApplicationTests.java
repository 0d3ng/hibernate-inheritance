package com.sinaungoding.hibernate.inheritance;

import com.sinaungoding.hibernate.inheritance.dao.MahasiswaDao;
import com.sinaungoding.hibernate.inheritance.entitas.Mahasiswa;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InheritanceApplicationTests {

    @Autowired
    MahasiswaDao dao;

    @Test
    public void insertTest() {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("0754");
        mahasiswa.setAlamat("Jln. Kemana aja");
        mahasiswa.setNama("Zalna");
        mahasiswa.setNotelf("021xxx");
        dao.save(mahasiswa);
    }

    @Test
    public void getAllTest() {
        Iterable<Mahasiswa> all = dao.findAll();
        for (Mahasiswa mahasiswa : all) {
            System.out.println(mahasiswa);
        }
    }

}
