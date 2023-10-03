package com.example.bottombar.model

/**
 *[STYLE1]: Only 1 item(either Icon or Label) will be visible at a time with slide-in
 *  & slide-out animation.
 *
 *[STYLE2]: Both items will be visible at a time with horizontal arrangement if it
 *  is currently selected with [IndicatorStyle.FILLED] as default indicator. (**NOTE:-** While using [STYLE2],
 *  make sure indicatorStyle is [IndicatorStyle.NONE] in **AnimatedBottomBar**)
 *
 *[STYLE3]: Both items will be visible at a time with vertical arrangement if it
 *  is currently selected.
 */
enum class ItemStyle {
    STYLE1,
    STYLE2,
    STYLE3
}