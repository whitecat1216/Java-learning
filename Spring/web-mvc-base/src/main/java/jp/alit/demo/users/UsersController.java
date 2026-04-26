package jp.alit.demo.users;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jp.alit.demo.entity.User;
import lombok.RequiredArgsConstructor;

@Controller                                                         // コントローラーとして扱う
@RequiredArgsConstructor                                            // 必須フィールドのコンストラクターを生成
public class UsersController {

  private final UsersService usersService;                          // users サービスを注入

  @GetMapping("/users")                                             // /users にマッピング
  public String indexPage(Model model) {                            // model はビューへオブジェクト受け渡す役
    List<User> userList = usersService.findAll();                   // user リストを取得する。
    model.addAttribute(userList);                                   // user リストをビューに渡す。userList でアクセスできる。コレクションは先頭小文字のクラス名+List
    return "users/index";                                           // template を指定する
  }

  @GetMapping("/users/{id}")                                        // /users/ユーザーID にマッピング。@PathVariable で引数とマッピング
  public String showPage(@PathVariable Long id, Model model) {      // ユーザーID を id に受け取る。model はビューへオブジェクト受け渡す役
    UserForm userForm = usersService.buildForm(id);                 // フォームオブジェクトを生成する
    model.addAttribute(userForm);                                   // フォームオブジェクトをビューに渡す。userForm でアクセスできる。先頭小文字のクラス名
    return "users/show";                                            // template を指定する
  }

  @GetMapping("/users/new")                                         // /users/new にマッピング
  public String newPage(Model model) {                              // model はビューへオブジェクト受け渡す役
    UserForm userForm = new UserForm();                             // フォームオブジェクトを生成する
    model.addAttribute(userForm);                                   // フォームオブジェクトをビューに渡す。
    return "users/new";                                             // template を指定する
  }

  @PostMapping("/users/create")                                     // /users/new にマッピング
  public String create(UserForm userForm) {                         // フォームデータを userForm に受け取る
    usersService.create(userForm);                                  // user を DB に新規登録
    return "redirect:/users";                                       // リダイレクト先を指定する
  }

  @GetMapping("/users/{id}/edit")                                   // /users/ユーザーID/edit にマッピング。@PathVariable で引数とマッピング
  public String editPage(@PathVariable Long id, Model model) {      // ユーザーID を id に受け取る。
    UserForm userForm = usersService.buildForm(id);                 // フォームオブジェクトを生成する
    model.addAttribute(userForm);                                   // フォームオブジェクトをビューに渡す。userForm でアクセスできる。先頭小文字のクラス名
    return "users/edit";                                            // template を指定する
  }

  @PostMapping("/users/{id}/update")                                // /users/ユーザーID/update にマッピング。@PathVariable で引数とマッピング
  public String update(@PathVariable Long id, UserForm userForm) {  // ユーザーID を id に受け取る。
    usersService.update(id, userForm);                              // DB の user を更新
    return "redirect:/users";                                       // リダイレクト先を指定する
  }

  @PostMapping("/users/{id}/delete")                                // /users/ユーザーID/delete にマッピング。@PathVariable で引数とマッピング
  public String delete(@PathVariable Long id) {                     // ユーザーID を id に受け取る。
    usersService.delete(id);                                        // DB の user を削除
    return "redirect:/users";                                       // リダイレクト先を指定する
  }

}