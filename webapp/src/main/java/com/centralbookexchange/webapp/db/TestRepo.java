package com.centralbookexchange.webapp.db;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.centralbookexchange.webapp.model.TestModel;

@Repository
public interface TestRepo extends CrudRepository<TestModel,Long> {
}
