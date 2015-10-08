package pl.mb2k15;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Matt on 2015-10-02.
 */
public interface UserRepository extends CrudRepository<UserModel, Integer> {

    List<UserModel> findByUsrNameAndUsrPasswd(String usrName, String usrPasswd);

    UserModel findByUsrName(String username);

}
