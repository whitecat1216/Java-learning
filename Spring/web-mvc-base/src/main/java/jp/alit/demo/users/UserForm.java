package jp.alit.demo.users;

import jp.alit.demo.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                                     // getXxx()、setXxx() を生成
@NoArgsConstructor                        // 引数なしコンストラクターを生成
public class UserForm {

  private Long id;                        // ビュー側の id に対応

  private String username;                // ビュー側の username に対応

  private String password;                // ビュー側の password に対応

  private boolean enabled;                // ビュー側の enabled に対応

  public UserForm(User user) {            // ユーザーからフォームオブジェクトを生成
    this.id = user.getId();
    this.username = user.getUsername();
    this.password = user.getPassword();
    this.enabled = user.isEnabled();
  }

  public void copyTo(User user) {         // フォームオブジェクトのデータをユーザーに設定
    user.setUsername(username);
    user.setPassword(password);
    user.setEnabled(enabled);
  }

}