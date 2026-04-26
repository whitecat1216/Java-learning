package jp.alit.demo.users;

import java.util.List;

import jp.alit.demo.entity.User;

public interface UsersService {             // users サービスインタフェース

  List<User> findAll();

  UserForm buildForm(Long id);

  User create(UserForm userForm);

  User update(Long id, UserForm userForm);

  void delete(Long id);

}