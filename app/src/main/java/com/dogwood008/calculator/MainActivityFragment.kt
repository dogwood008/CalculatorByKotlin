package com.dogwood008.calculator

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import butterknife.bindView

/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment() {
    val button_0: RelativeLayout by bindView(R.id.button_0)
    val button_1: RelativeLayout by bindView(R.id.button_1)
    val button_2: RelativeLayout by bindView(R.id.button_2)
    val button_3: RelativeLayout by bindView(R.id.button_3)
    val button_4: RelativeLayout by bindView(R.id.button_4)
    val button_5: RelativeLayout by bindView(R.id.button_5)
    val button_6: RelativeLayout by bindView(R.id.button_6)
    val button_7: RelativeLayout by bindView(R.id.button_7)
    val button_8: RelativeLayout by bindView(R.id.button_8)
    val button_9: RelativeLayout by bindView(R.id.button_9)
    val button_plus: RelativeLayout by bindView(R.id.button_plus)
    val button_minus: RelativeLayout by bindView(R.id.button_minus)
    val button_times: RelativeLayout by bindView(R.id.button_times)
    val button_devides: RelativeLayout by bindView(R.id.button_devides)
    val button_plusMinus: RelativeLayout by bindView(R.id.button_plus_minus)
    val button_ac: RelativeLayout by bindView(R.id.button_ac)
    val button_period: RelativeLayout by bindView(R.id.button_period)
    val button_equal: RelativeLayout by bindView(R.id.button_equal)
    val textView_displayOperator: TextView by bindView(R.id.textView_display_operator)
    val textView_displayDigit: TextView by bindView(R.id.textView_display_digit)
    var digitCache: Long = 0

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // When you use kotterknife, don't set click listeners here.
        // The variables are should be null.
        return inflater!!.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // Click listeners must be set in here.
        button_0.setOnClickListener { pushedNumKey(0) }
        button_1.setOnClickListener { pushedNumKey(1) }
        button_2.setOnClickListener { pushedNumKey(2) }
        button_3.setOnClickListener { pushedNumKey(3) }
        button_4.setOnClickListener { pushedNumKey(4) }
        button_5.setOnClickListener { pushedNumKey(5) }
        button_6.setOnClickListener { pushedNumKey(6) }
        button_7.setOnClickListener { pushedNumKey(7) }
        button_8.setOnClickListener { pushedNumKey(8) }
        button_9.setOnClickListener { pushedNumKey(9) }
    }

    private fun pushedNumKey(num: Int) {
        digitCache = digitCache * 10 + num
        textView_displayDigit.text = "" + digitCache
    }
}
