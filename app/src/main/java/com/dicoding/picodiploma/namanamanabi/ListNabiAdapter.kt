package com.dicoding.picodiploma.namanamanabi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListNabiAdapter(val listNabi: ArrayList<Nabi>, var clickListener: OnProphetListener) :
    RecyclerView.Adapter<ListNabiAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

        fun initItem(item: Nabi, action: OnProphetListener) {
            tvName.text = item.name
            tvDetail.text = item.detail
            imgPhoto.setImageResource(item.gambartulisan)

            itemView.setOnClickListener {
                action.onProphetClick(item, adapterPosition)
            }
        }
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_nabi, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val nabi = listNabi[position]

        Glide.with(holder.itemView.context)
            .load(nabi.gambartulisan)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = nabi.name
        holder.tvDetail.text = nabi.detail

        holder.initItem(listNabi.get(position), clickListener)
    }

    override fun getItemCount(): Int {
        return listNabi.size
    }

    interface OnProphetListener {
        fun onProphetClick(listNabi: Nabi, position: Int)
    }

}