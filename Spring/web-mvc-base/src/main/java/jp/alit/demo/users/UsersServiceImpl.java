package jp.alit.demo.users;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.alit.demo.entity.User;
import jp.alit.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service                                                  // サービスとして扱う
@RequiredArgsConstructor                                  // 必須フィールドのコンストラクターを生成
public class UsersServiceImpl implements UsersService {

  private final UserRepository userRepository;            // users リポジトリを注入

  @Override
  public UserForm buildForm(Long id) {
    User user = userRepository.find(id);                  // user を取得する
    return new UserForm(user);
  }

  @Override
  public List<User> findAll() {                           // user リストを取得する
    return userRepository.findAll();
  }

  @Override
  public User create(UserForm userForm) {                 // user を新規登録
    User user = new User();                               // 新規 user を生成
    userForm.copyTo(user);                                // フォームオブジェクトから user にコピー
    return userRepository.save(user);                     // user を保存
  }

  @Override
  public User update(Long id, UserForm userForm) {        // user を更新
    User user = userRepository.find(id);                  // user を取得する
    userForm.copyTo(user);                                // フォームオブジェクトから user にコピー
    return userRepository.save(user);                     // user を保存
  }

  @Override
  public void delete(Long id) {                           // user を削除
    User user = userRepository.find(id);                  // user を取得する
    userRepository.delete(user);                          // user を削除
  }

}