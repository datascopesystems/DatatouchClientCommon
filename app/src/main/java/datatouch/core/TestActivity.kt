package datatouch.core

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.datascopesystem.datatouchcommon.DataTouchCommonClass

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val c = DataTouchCommonClass()
    }
}