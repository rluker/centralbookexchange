package test;

import com.centralbookexchange.webapp.CBEApplication;
import com.centralbookexchange.webapp.db.PersonDB;

import com.centralbookexchange.webapp.db.PersonRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
//@DataJpaTest
@SpringBootTest(classes= CBEApplication.class)
public class PersonRepoTest {
    @Autowired
    private PersonRepo personRepo;
    @Before
    public void setUp() throws Exception {
        PersonDB person1= new PersonDB("Alice123", "alice@fake.com");
        PersonDB person2= new PersonDB("Bob123", "bob@fake.com");
        //save user, verify has ID value after save
        assertNull(person1.getId());
        assertNull(person2.getId());//null before save
        this.personRepo.save(person1);
        this.personRepo.save(person2);
        assertNotNull(person1.getId());
        assertNotNull(person2.getId());
    }

    @Test
    public void testFetchData(){
        /*Test data retrieval*/
        PersonDB personA = personRepo.findByUserName("Bob123");
        assertNotNull(personA);
        assertEquals("bob@fake.com", personA.getEmail());
        /*Get all products, list should only have two*/
        Iterable<PersonDB> users = personRepo.findAll();
        int count = 0;
        for(PersonDB p : users){
            count++;
        }
        assertEquals(count, 2);
    }
}