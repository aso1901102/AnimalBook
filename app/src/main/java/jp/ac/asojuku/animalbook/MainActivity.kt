package jp.ac.asojuku.animalbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //画面の表示・再表示で呼ばれるイベントのコールバック
    override fun onResume() {
        super.onResume()

        //フラグメントのタイトル文字列を指定して設定
        //画面のフラグメントをIDで取得してオリジナルのフラグメントクラスにキャストして定数に代入
        var fragment = this.titleFragment as? TitleFragment
        fragment?.setTitle("フラグメント動物図鑑");

        //「次へ」ボタンがクリックされた時のコールバックメソッド
        this.nextButton.setOnClickListener {
            //ボタンがクリックされた時の処理
            //画面遷移用の院展とを生成
            val intent = Intent(this,SubActivity::class.java)
            //intentをもとに画面遷移を実行
            this.startActivity(intent)

        }


    }
}
