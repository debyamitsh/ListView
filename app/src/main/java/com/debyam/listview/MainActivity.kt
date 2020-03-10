package com.debyam.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var array = arrayOf("Afghanistan",
            "Afrique du Sud Afrique du Sud",
            "Albanie " ,
            "Algérie " ,
            "Allemagne " ,
            "Andorre " ,
            "Angola " ,
            "Antigua-et-Barbuda " ,
            "Arabie saoudite " ,
            "Argentine " ,
            "Arménie " ,
            "Australie " ,
            "Autriche " ,
            "Azerbaïdjan " ,
            "Bahamas " ,
            "Bahreïn " ,
            "Bangladesh " ,
            "Barbade " ,
            "Belgique " ,
            "Belize " ,
            "Bénin " ,
            "Bhoutan " ,
            "Biélorussie " ,
            "Birmanie " ,
            "Bolivie " ,
            "Bosnie-Herzégovine " ,
            "Botswana " ,
            "Brésil " ,
            "Brunei " ,
            "Bulgarie " ,
            "Burkina Faso " ,
            "Burundi " ,
            "Cambodge " ,
            "Cameroun " ,
            "Canada " ,
            "Cap-Vert " ,
            "République centrafricaine " ,
            "Chili " ,
            "Chine " ,
            "Chypre " ,
            "Colombie " ,
            "Comores " ,
            "République du Congo " ,
            "République démocratique du Congo " ,
            "îles Cook " ,
            "Corée du Nord " ,
            "Corée du Sud ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this,
            R.layout.listview_item, array)

        val listView: ListView = findViewById(R.id.listview_1)
        listView.setAdapter(adapter)
    }
}
