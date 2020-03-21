package su.ternovskiy.redditkotlindemo.commons.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

interface ViewTypeDelegateAdapter {

    fun OnCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun OnBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}