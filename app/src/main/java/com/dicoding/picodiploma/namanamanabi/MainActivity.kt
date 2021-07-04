package com.dicoding.picodiploma.namanamanabi

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_row_nabi.*

class MainActivity : AppCompatActivity(), ListNabiAdapter.OnProphetListener {
    private lateinit var rvProphets: RecyclerView
    private var list: ArrayList<Nabi> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvProphets = findViewById(R.id.rv_nabinabi)
        rvProphets.setHasFixedSize(true)

        list.addAll(ProphetsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvProphets.layoutManager = LinearLayoutManager(this)
        val listNabiAdapter = ListNabiAdapter(list, this)
        rvProphets.adapter = listNabiAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when (itemId) {
            R.id.action_main -> {
                showRecyclerList()
            }
            R.id.action_about -> {
                val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }
    }

    override fun onProphetClick(listNabi: Nabi, position: Int) {
        val detailIntent = Intent(this, DetailItemActivity::class.java)
        detailIntent.putExtra(DetailItemActivity.EXTRA_NAME, listNabi.name)
        detailIntent.putExtra(DetailItemActivity.EXTRA_DETAIL, listNabi.detail)
        detailIntent.putExtra(DetailItemActivity.EXTRA_IMAGE_URL, listNabi.gambartulisan.toString())
        startActivity(detailIntent)
    }
}