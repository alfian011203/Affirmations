package com.example.affirmations.data
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable._7maldives),
            Affirmation(R.string.affirmation2, R.drawable.gambaruh),
            Affirmation(R.string.affirmation3, R.drawable.sejukuh),
            Affirmation(R.string.affirmation4, R.drawable.malamini),
            Affirmation(R.string.affirmation5, R.drawable.gunungsejuk),
            Affirmation(R.string.affirmation6, R.drawable.gununguh),
            Affirmation(R.string.affirmation7, R.drawable.langituh),
            Affirmation(R.string.affirmation8, R.drawable.bumiuh),
            Affirmation(R.string.affirmation9, R.drawable.penus),
            Affirmation(R.string.affirmation10, R.drawable.mercuriuus))

    }
}