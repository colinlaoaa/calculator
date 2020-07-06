package com.liao.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.calculator.*

class CalculatorActivity : AppCompatActivity(), View.OnClickListener {

    private var number = ""
    private var firstNumber = ""//first number
    private var nextNumber = ""//second number
    private var flag = ""//operator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator)



        init()
    }

    private fun init() {
        button_one.setOnClickListener(this)
        button_two.setOnClickListener(this)
        button_three.setOnClickListener(this)
        button_four.setOnClickListener(this)
        button_five.setOnClickListener(this)
        button_six.setOnClickListener(this)
        button_seven.setOnClickListener(this)
        button_eight.setOnClickListener(this)
        button_nine.setOnClickListener(this)
        button_zero.setOnClickListener(this)
        button_dot.setOnClickListener(this)


        btn_addition.setOnClickListener(this)
        btn_equal.setOnClickListener(this)
        btn_multiplication.setOnClickListener(this)
        btn_sign.setOnClickListener(this)
        btn_subtract.setOnClickListener(this)
        btn_C.setOnClickListener(this)
        btn_percentage.setOnClickListener(this)
        btn_negative.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.button_one -> {
                if (nextNumber.isNotEmpty()) {
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                    edit_text.append("1")
                    number = edit_text.text.toString()
                } else {
                    edit_text.append("1")
                    number = edit_text.text.toString()
                }
            }
            R.id.button_two -> {
                if (nextNumber.isNotEmpty()) {
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                    edit_text.append("2")
                    number = edit_text.text.toString()
                } else {
                    edit_text.append("2")
                    number = edit_text.text.toString()
                }
            }
            R.id.button_three -> {
                if (nextNumber.isNotEmpty()) {
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                    edit_text.append("3")
                    number = edit_text.text.toString()
                } else {
                    edit_text.append("3")
                    number = edit_text.text.toString()
                }
            }
            R.id.button_four -> {
                if (nextNumber.isNotEmpty()) {
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                    edit_text.append("4")
                    number = edit_text.text.toString()
                } else {
                    edit_text.append("4")
                    number = edit_text.text.toString()
                }
            }
            R.id.button_five -> {
                if (nextNumber.isNotEmpty()) {
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                    edit_text.append("5")
                    number = edit_text.text.toString()
                } else {
                    edit_text.append("5")
                    number = edit_text.text.toString()
                }
            }
            R.id.button_six -> {
                if (nextNumber.isNotEmpty()) {
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                    edit_text.append("6")
                    number = edit_text.text.toString()
                } else {
                    edit_text.append("6")
                    number = edit_text.text.toString()
                }
            }
            R.id.button_seven -> {
                if (nextNumber.isNotEmpty()) {
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                    edit_text.append("7")
                    number = edit_text.text.toString()
                } else {
                    edit_text.append("7")
                    number = edit_text.text.toString()
                }
            }
            R.id.button_eight -> {
                if (nextNumber.isNotEmpty()) {
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                    edit_text.append("8")
                    number = edit_text.text.toString()
                } else {
                    edit_text.append("8")
                    number = edit_text.text.toString()
                }
            }
            R.id.button_nine -> {
                if (nextNumber.isNotEmpty()) {
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                    edit_text.append("9")
                    number = edit_text.text.toString()
                } else {
                    edit_text.append("9")
                    number = edit_text.text.toString()
                }

            }
            R.id.button_zero -> {
                if (nextNumber.isNotEmpty()) {
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                    edit_text.append("0")
                    number = edit_text.text.toString()
                } else {
                    edit_text.append("0")
                    number = edit_text.text.toString()
                }
            }
            R.id.button_dot -> {
                if (nextNumber.isNotEmpty()) {
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                    if (edit_text.text.toString().contains(".")) {
                        Toast.makeText(applicationContext, "already have dot", Toast.LENGTH_SHORT)
                            .show()
                    } else {
                        edit_text.append(".")
                        number = edit_text.text.toString()
                    }

                } else {
                    if (edit_text.text.toString().contains(".")) {
                        Toast.makeText(applicationContext, "already have dot", Toast.LENGTH_SHORT)
                            .show()
                    } else {
                        edit_text.append(".")
                        number = edit_text.text.toString()
                    }
                }
            }


            R.id.btn_negative -> {

                edit_text.setText("${edit_text.text.toString().toDouble()*(-1)}")

            }

            R.id.btn_percentage -> {
                edit_text.setText("${(edit_text.text.toString().toDouble()) / 100}")
            }


            R.id.btn_addition -> {
                if (firstNumber?.isEmpty() && nextNumber?.isEmpty()) {
                    flag = "+"
                    firstNumber = number
                    number = "0"
                    edit_text.setText("")
                } else if (firstNumber?.isNotEmpty() && nextNumber?.isEmpty()) {
                    flag = "+"
                    nextNumber = number
                    number = "0"
                    edit_text.setText("")
                    doCount()
                } else if (firstNumber?.isEmpty() && nextNumber?.isNotEmpty()) {
                    flag = "+"
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                }


            }

            R.id.btn_subtract -> {
                if (firstNumber?.isEmpty() && nextNumber?.isEmpty()) {
                    flag = "-"
                    firstNumber = number
                    number = "0"
                    edit_text.setText("")
                } else if (firstNumber?.isNotEmpty() && nextNumber?.isEmpty()) {
                    flag = "-"
                    nextNumber = number
                    number = "0"
                    edit_text.setText("")
                    doCount()
                } else if (firstNumber?.isEmpty() && nextNumber?.isNotEmpty()) {
                    flag = "-"
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                }


            }

            R.id.btn_multiplication -> {
                if (firstNumber?.isEmpty() && nextNumber?.isEmpty()) {
                    flag = "*"
                    firstNumber = number
                    number = "0"
                    edit_text.setText("")
                } else if (firstNumber?.isNotEmpty() && nextNumber?.isEmpty()) {
                    flag = "*"
                    nextNumber = number
                    number = "0"
                    edit_text.setText("")
                    doCount()
                } else if (firstNumber?.isEmpty() && nextNumber?.isNotEmpty()) {
                    flag = "*"
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                }


            }


            R.id.btn_sign -> {
                if (firstNumber?.isEmpty() && nextNumber?.isEmpty()) {
                    flag = "/"
                    firstNumber = number
                    number = "0"
                    edit_text.setText("")
                } else if (firstNumber?.isNotEmpty() && nextNumber?.isEmpty()) {
                    flag = "/"
                    nextNumber = number
                    number = "0"
                    edit_text.setText("")
                    if (nextNumber.equals("0")) {
                        Toast.makeText(
                            applicationContext,
                            "Divisor is not zero",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        doCount()
                    }
                } else if (firstNumber?.isEmpty() && nextNumber?.isNotEmpty()) {
                    flag = "/"
                    edit_text.setText("")
                    firstNumber = nextNumber
                    nextNumber = ""
                }

            }


            R.id.btn_equal -> {
                if (firstNumber?.isNotEmpty() && nextNumber?.isEmpty()) {
                    nextNumber = edit_text.text.toString()
                    doCount()
                    flag = ""
                }
            }
            R.id.btn_C -> {
                firstNumber = ""
                nextNumber = ""
                edit_text.setText("")
                flag = ""
            }

        }


    }

    private fun doCount() {
        var result = 0.0
        when (flag) {
            "+" -> result = firstNumber.toDouble() + nextNumber.toDouble()
            "-" -> result = firstNumber.toDouble() - nextNumber.toDouble()
            "*" -> result = firstNumber.toDouble() * nextNumber.toDouble()
            "/" -> {
                result = firstNumber.toDouble() / nextNumber.toDouble()
            }
        }
        nextNumber = result.toString()
        firstNumber = ""
        edit_text.setText(result.toString())
    }
}



