package jp.ac.asojuku.animalbook

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
    }
}
