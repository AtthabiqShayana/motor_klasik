package org.d3if4071.motorklasik

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.d3if4071.motorklasik.databinding.ListMotorBinding

class MainAdapter (private val data: List<Motortua>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>(){
    class ViewHolder(private val binding: ListMotorBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(motor: Motortua) = with(binding) {
            namaTextView.text = motor.nama
            merekTextView.text = motor.merek
            imageView.setImageResource(motor.imageResId)
            root.setOnClickListener {
                val message = root.context.getString(R.string.message, motor.nama)
                Toast.makeText(root.context, message, Toast.LENGTH_LONG).show()
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListMotorBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}