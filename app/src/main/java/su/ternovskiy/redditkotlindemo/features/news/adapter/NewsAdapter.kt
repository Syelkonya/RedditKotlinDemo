package su.ternovskiy.redditkotlindemo.features.news.adapter

import android.view.ViewGroup
import androidx.collection.SparseArrayCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import su.ternovskiy.redditkotlindemo.commons.adapters.AdapterConstants
import su.ternovskiy.redditkotlindemo.commons.adapters.ViewType
import su.ternovskiy.redditkotlindemo.commons.adapters.ViewTypeDelegateAdapter


class NewsAdapter : RecyclerView.Adapter<ViewHolder>() {

    private var items : ArrayList<ViewType>
    private lateinit var delegateAdapters: SparseArrayCompat<ViewTypeDelegateAdapter>
    private val loadingitem = object : ViewType {
        override fun getViewType() = AdapterConstants.LOADING
    }

    init {
        delegateAdapters.put(AdapterConstants.LOADING, LoadingDelegateAdapter())
        items = ArrayList()
        items.add(loadingitem)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return delegateAdapters.get(viewType)!!.OnCreateViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        delegateAdapters.get(getItemViewType(position))!!.OnBindViewHolder(holder, this.items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return this.items.get(position).getViewType()
    }
}