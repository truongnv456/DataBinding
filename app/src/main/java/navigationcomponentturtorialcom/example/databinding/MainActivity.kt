package navigationcomponentturtorialcom.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import navigationcomponentturtorialcom.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        // Use data binding to set the content view with data binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // Access binding view
        var v1 = Vehicle("2024", "Mercedes")
        binding.myVehicle = v1
        // Handle the click events on the button
        binding.clickHandler = VehicleClickHandlers(this)
        // Two-way binding
    }
}