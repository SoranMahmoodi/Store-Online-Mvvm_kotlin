package com.soran.mahmoodi.storeonlinemvvmkotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.soran.mahmoodi.storeonlinemvvmkotlin.R
import com.soran.mahmoodi.storeonlinemvvmkotlin.databinding.ItemCardBarendBinding
import com.soran.mahmoodi.storeonlinemvvmkotlin.model.Card

class CardBrandAdapter : RecyclerView.Adapter<CardBrandAdapter.CardBrandViewHolder>() {
    private var cards: ArrayList<Card> = ArrayList()

    fun getCards(cards: List<Card>) {
        this.cards.clear()
        this.cards.addAll(cards)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardBrandViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemCardBarendBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_card_barend, parent, false)
        return CardBrandViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    override fun onBindViewHolder(holder: CardBrandViewHolder, position: Int) {
        holder.bindCard(cards[position])
    }

    inner class CardBrandViewHolder(private var binding: ItemCardBarendBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindCard(card: Card) {
            binding.card = card
            binding.executePendingBindings()

        }
    }
}