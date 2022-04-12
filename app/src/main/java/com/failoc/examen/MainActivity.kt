package com.failoc.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener{

    val listaTipoEval = arrayOf("A: 30% T + 70% L", "A: 40% T + 60% L")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("CICLO_VIDA", "onCreate")

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Calculadora del Trica"

        /*spinnerporcentaje.onItemSelectedListener = this

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaTipoEval)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerporcentaje.adapter = adapter*/



    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_main, menu)
        setIcon(menu?.findItem(R.id.action_settings)!!)
        return super.onCreateOptionsMenu(menu)
    }

    private fun setIcon(menuItem: MenuItem) {
        val id = R.drawable.ic_baseline_more_vert_24
        menuItem.icon = ContextCompat.getDrawable(this, id)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.action_settings -> {
                // Log.v("MENU_EVENTO", "AJUSTES")
            }
        }
        return super.onOptionsItemSelected(item)
    }



    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    override fun onStart() {
        super.onStart()
        Log.v("CICLO_VIDA", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("CICLO_VIDA", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.v("CICLO_VIDA", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v("CICLO_VIDA", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("CICLO_VIDA", "onDestroy")
    }


}