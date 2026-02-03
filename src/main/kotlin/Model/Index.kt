package pheakdey.developer.Model

import kotlin.io.print

class personal
{
    fun
            outpntPersonal(){
    print("Enter Your Name:")
    val name = readLine()?:""

    print ("Enter Your Age")
    val age =  readLine()?.toIntOrNull()?:0

    print ("Enter Your Gender")
    val gender= readLine()?:""

    print ("Enter Your Phone")
    val phone=readLine()?:""

    print("=====>Input Personal<=====")
    print("\nName: $name,\n Age: $age,\nGender: $gender,\nphone:$phone")

    }
}

