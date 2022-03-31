package org.d3if4071.motorklasik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if4071.motorklasik.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
    }
    private fun getData(): List<Motortua> {
        return listOf(
            Motortua("cb 100", "Honda", R.drawable.cb100),
            Motortua("gl 100", "Honda", R.drawable.gl100),
            Motortua("rc 100", "Suzuki", R.drawable.rc100),
            Motortua("win 100", "Honda", R.drawable.win100),
            Motortua("c70", "Honda", R.drawable.c70),
            Motortua("astrea", "Honda", R.drawable.astrea),
            Motortua("vespa", "Piagio", R.drawable.vespa),
            Motortua("v80", "Yamaha", R.drawable.v80),
            Motortua("a 100", "Suzuki", R.drawable.a100),
            Motortua("rx king", "Yamaha", R.drawable.rxking),
        )
    }

}