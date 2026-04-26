package jp.alit.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.alit.demo.entity.User;
import lombok.RequiredArgsConstructor;

@Repository                                       // JPA レポジトリとして扱う
@RequiredArgsConstructor                          // 必須フィールドのコンストラクターを生成
public class UserRepository {                     // 公開 User リポジトリ

  private final UserJpaRepository jpaRepository;  // JPA 委譲先

  public User find(Long id) {                     // user を取得する
    return jpaRepository.getReferenceById(id);
  }

  public List<User> findAll() {                   // user リストを取得する
    return jpaRepository.findByOrderById();
  }

  public void delete(User entity) {               // 指定された user を削除する
    jpaRepository.delete(entity);
  }

  public User save(User user) {                   // 指定された user を保存する
    return jpaRepository.save(user);
  }

}

interface UserJpaRepository extends JpaRepository<User, Long> { // User リポジトリ
  List<User> findByOrderById();                                 // クエリメソッド
}