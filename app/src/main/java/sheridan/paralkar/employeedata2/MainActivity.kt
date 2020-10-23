package sheridan.paralkar.employeedata2

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    private var outputFragment: SecondFragment? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // lookup the layout fragment
//        outputFragment = supportFragmentManager
//            .findFragmentById(R.id.fragment_second) as SecondFragment?
//
//    }
        }

}