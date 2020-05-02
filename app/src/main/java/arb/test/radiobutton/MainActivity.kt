package arb.test.radiobutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var color: Int? = null
    var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        on click item radio gruop color
        rdg_main_color.setOnCheckedChangeListener { group, checkedId ->
            color = when(checkedId){
                R.id.rdb_main_red -> Color.RED
                R.id.rdb_main_green -> Color.GREEN
                R.id.rdb_main_blue -> Color.BLUE
                else -> Color.BLACK
            }
        }

//        on click item radio gruop name
        rdg_main_name.setOnCheckedChangeListener { group, checkedId ->
            name = when(checkedId){
                R.id.rdb_main_ali -> "Ali"
                R.id.rdb_main_reza -> "Reza"
                R.id.rdb_main_Alireza -> "Alireza"
                else -> ""
            }
        }

//        on click button result
        btn_main_result.setOnClickListener {
            tv_main_result.text = name?:""
            tv_main_result.setTextColor(color?:Color.BLACK)
        }

    }
}
