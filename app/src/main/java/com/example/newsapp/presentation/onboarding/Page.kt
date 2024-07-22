package com.example.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val descrpition : String,
    @DrawableRes val image:Int
)

val pages = listOf(
    Page(
        title = "Page 1",
        descrpition = "This is page one of the oboarding process",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Page 2",
        descrpition = "This is page two of the oboarding process",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Page 3",
        descrpition = "This is page thw of the oboarding process",
        image = R.drawable.onboarding3
    )
)
