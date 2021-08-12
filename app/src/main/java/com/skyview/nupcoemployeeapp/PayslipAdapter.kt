package com.skyview.nupcoemployeeapp
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PayslipAdapter:RecyclerView.Adapter<PayslipAdapter.ViewHolder>(){
    private var months= arrayOf("January","Feb","March","April","Jun","July")
    private var dates= arrayOf("1 April 2021","2 April 2021","3 April 2021","4 April 2021","4 April 2021","5 April 2021")
    private var costs= arrayOf("2000","2000","2000","2000","2000","2000")
    private var times= arrayOf("02:30 PM","02:30 PM","02:30 PM","02:30 PM","02:30 PM","02:30 PM")
    private var currencies= arrayOf("SAR","SAR","SAR","SAR","SAR","SAR")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PayslipAdapter.ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_list,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: PayslipAdapter.ViewHolder, position: Int) {
        holder.itemDate.text=dates[position]
        holder.itemTime.text=times[position]
        holder.itemCost.text=costs[position]
        holder.itemCurrency.text=currencies[position]
        holder.itemMonth.text=months[position]
    }

    override fun getItemCount(): Int {
        return dates.size

    }
    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var itemDate:TextView
        var itemTime:TextView
        var itemCost:TextView
        var itemCurrency:TextView
        var itemMonth:TextView

        init{
            itemDate=itemView.findViewById(R.id.date)
            itemTime=itemView.findViewById(R.id.time1)
            itemCost=itemView.findViewById(R.id.cost)
            itemCurrency=itemView.findViewById(R.id.currency)
            itemMonth=itemView.findViewById(R.id.text_month)
        }
    }

}