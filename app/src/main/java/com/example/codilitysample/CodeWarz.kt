package com.example.codilitysample

import java.lang.StringBuilder
import java.util.regex.Pattern

private fun dutyFree(normPrice: Int, discount: Int, hol: Int) =
    hol / ((normPrice * discount).toFloat() / 100).toInt()

private fun strToCamelCase(inputStr: String): String {
    val m = Pattern.compile("([-|_][a-zA-Z])|(^[a-zA-Z)])").matcher(inputStr)
    val sb = StringBuffer()
    while (m.find()) {
        if (m.group().length > 1)
            m.appendReplacement(sb, m.group().substring(1).uppercase())
        else
            m.appendReplacement(sb, m.group().uppercase())
    }
    m.appendTail(sb)
    return sb.toString()
}


class AllNonRepetitive {
    object Permutation {
        var resultList: ArrayList<String> = ArrayList()
        private fun permute(s: String, answer: String) {
            if (s.isEmpty()) {
                resultList.add(answer)
                return
            }
            for (i in s.indices) {
                val ch = s[i]
                val leftSubString = s.substring(0, i)
                val rightSubString = s.substring(i + 1)
                val rest = leftSubString + rightSubString
                permute(rest, answer + ch)
            }
        }

        @JvmStatic
        fun allNonRepetitive(): ArrayList<String> {
            val s = "ABCD"
            permute(s, "")
            return resultList
        }
    }
}