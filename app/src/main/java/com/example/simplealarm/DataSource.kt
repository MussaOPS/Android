package com.example.simplealarm

import com.example.simplealarm.models.BlogPost

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "11:50",
                    "Yasadasd"
                )
            )
            list.add(
                BlogPost(
                    "14:43",
                    "asdasda."
                )
            )

            list.add(
                BlogPost(
                    "15:55",
                    "asdfddadfs"
                )
            )
            list.add(
                BlogPost(
                    "22:22",
                    "adsaadasdfasd"
                )
            )

            return list
        }
    }
}