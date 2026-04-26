package jp.alit.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity                                                 // JPA エンティティとして扱う
@Table(name = "users")                                  // users テーブルとマッピングする
@Data                                                   // getXxx()、setXxx() を生成
@NoArgsConstructor                                      // 引数なしコンストラクターを生成
public class User {

  @Id                                                   // ID 列として扱う
  @GeneratedValue(strategy = GenerationType.IDENTITY)   // データベースが ID を生成
  @Column                                               // id カラムにマッピング
  private long id;

  @Column                                               // username カラムにマッピング
  private String username;

  @Column                                               // password カラムにマッピング
  private String password;

  @Column                                               // enabled カラムにマッピング
  private boolean enabled;

}