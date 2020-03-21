package su.ternovskiy.redditkotlindemo.features.news.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import su.ternovskiy.redditkotlindemo.R
import su.ternovskiy.redditkotlindemo.commons.adapters.ViewType
import su.ternovskiy.redditkotlindemo.commons.adapters.ViewTypeDelegateAdapter
import su.ternovskiy.redditkotlindemo.commons.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun OnCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun OnBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        parent.inflate(R.layout.news_item_loading)
    )
}