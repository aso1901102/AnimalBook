package jp.ac.asojuku.animalbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }

    //画面の表示・再表示のイベントコールバックメソッド
    override fun onResume() {
        super.onResume()

        //ライオンボタンがクリックされたときのコールバックメソッドのリスナーを設定
        this.lionButton.setOnClickListener {
            //クリックされたときの処理
            //ライオンフラグメントのインスタンスを生成
            val fragment = LionFragment()

            //画面を操作できるフラグメントマネージャーを取得
            //変数に代入
            val fragmentManager = this.supportFragmentManager

            //フラグメント切り替えのためにフラグメント操作のトランザクションを開始
            val fragmentTransaction = fragmentManager.beginTransaction()

            //トランザクションが開始されたのでフラグメントんい関する操作をする
            fragmentTransaction.replace(R.id.container,fragment)       //画面のid:container部分にフラグメントを保存
                .addToBackStack(null)                           //元のフラグメントをバックスタックに保存
                .commit()                                              //トランザクションの完了
        }

        //カバのボタンがクリックされたときのイベントのコールバックメソッド
        this.hippoButton.setOnClickListener {
            //クリックされたときの処理
            //かばフラグメントのインスタンスを生成
            val fragment = HippoFragment()

            //画面を操作できるフラグメントマネージャーを取得
            //変数に代入
            val fragmentManager = this.supportFragmentManager

            //フラグメント切り替えのためにフラグメント操作のトランザクションを開始
            val fragmentTransaction = fragmentManager.beginTransaction()

            //トランザクションが開始されたのでフラグメントに関する操作をする
            fragmentTransaction.replace(R.id.container,fragment)       //画面のid:container部分にフラグメントを保存
                .addToBackStack(null)                           //元のフラグメントをバックスタックに保存
                .commit()                                              //トランザクションの完了
        }

        //キリンのボタンがクリックされたときのイベントのコールバックメソッド
        this.giraffeButton.setOnClickListener {
            //クリックされたときの処理
            //かばフラグメントのインスタンスを生成
            val fragment = giraffeFragment()

            //画面を操作できるフラグメントマネージャーを取得
            //変数に代入
            val fragmentManager = this.supportFragmentManager

            //フラグメント切り替えのためにフラグメント操作のトランザクションを開始
            val fragmentTransaction = fragmentManager.beginTransaction()

            //トランザクションが開始されたのでフラグメントに関する操作をする
            fragmentTransaction.replace(R.id.container,fragment)       //画面のid:container部分にフラグメントを保存
                .addToBackStack(null)                           //元のフラグメントをバックスタックに保存
                .commit()                                              //トランザクションの完了
        }

        //フラグメントのタイトル文字列を指定して設定
        //画面のフラグメントをIDで取得してオリジナルのフラグメントクラスにキャストして定数に代入
        var fragment = this.titleFragment as? TitleFragment
        fragment?.setTitle("図鑑画面");
    }
}
