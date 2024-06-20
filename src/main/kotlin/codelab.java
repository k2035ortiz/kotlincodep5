//*******PUNTO 1 *********

//fun main (){
//val trickFunction = ::trick
//    trick()
//
//}
//val trick = {
//    println("no treats")
//}

//*******PUNTO 2 *********

//fun main(){
//    val trickFunction =trick
//    trick()
//    trickFunction()
//}
//val trick ={
//    println("no treats")
//}

//*******PUNTO 3**********

//fun main (){
//    val trickFunction =trick
//    trick()
//    trickFunction()
//    treat()
//}
//val trick ={
//    println("no treats")
//}
//
//val treat:()-> Unit ={
//    println("have a treat")
//}

//*******PUNTO 4**********

//fun main (){
//    val treatFunction = trickOrTreat(false)
//    val trickFunction = trickOrTreat(true)
//    treatFunction()
//    trickFunction()
//}
//fun trickOrTreat(isTrick: Boolean): () -> Unit {
//    if (isTrick) {
//        return trick
//    } else {
//        return treat
//    }
//}
//
//val trick = {
//    println("no treats")
//}
//val treat = {
//    println("have a treat")
//}

//*******PUNTO 5**********

//fun main (){
//    val coins: (Int) -> String = { quantity ->
//        "$quantity quarters"
//    }
//    val cupcake: (Int) -> String = { quantity ->
//        "Have a cupcake!"
//    }
//
//    val treatFunction = trickOrTreat(false, coins)
//    val trickFunction = trickOrTreat(true, cupcake)
//    treatFunction()
//    trickFunction()
//}
//fun trickOrTreat(isTrick: Boolean,extraTreat: (Int)->String): () -> Unit {
//    if (isTrick) {
//        return trick
//    } else {
//        println(extraTreat(5))
//        return treat
//    }
//}
//
//val trick = {
//    println("no treats")
//}
//val treat = {
//    println("have a treat")
//}


//*******PUNTO 6**********

//fun main (){
//    val coins: (Int) -> String = { quantity ->
//        "$quantity quarters"
//    }
//
//    val treatFunction = trickOrTreat(false, coins)
//    val trickFunction = trickOrTreat(true, null)
//    treatFunction()
//    trickFunction()}
//fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
//    if (isTrick) {
//        return trick
//    } else {
//        if (extraTreat != null) {
//            println(extraTreat(5))
//        }
//        return treat
//    }
//}
//val trick = {
//    println("no treats")
//}
//val treat = {
//    println("have a treat")
//}

//*******PUNTO 7**********

//fun main (){
//    val coins: (Int) -> String = {
//        "$it quarters"
//    }
//    val treatFunction = trickOrTreat(false, coins)
//    val trickFunction = trickOrTreat(true, null)
//    treatFunction()
//    trickFunction()}
//fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
//    if (isTrick) {
//        return trick
//    } else {
//        if (extraTreat != null) {
//            println(extraTreat(5))
//        }
//        return treat
//    }
//}
//val trick = {
//    println("no treats")
//}
//val treat = {
//    println("have a treat")
//}

//*******PUNTO 8**********

//fun main (){
//    val coins: (Int) -> String = {
//        "$it quarters"
//    }
//    val treatFunction = trickOrTreat(false) { "$it quarters" }
//    val trickFunction = trickOrTreat(true, null)
//    treatFunction()
//    trickFunction()}
//fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
//    if (isTrick) {
//        return trick
//    } else {
//        if (extraTreat != null) {
//            println(extraTreat(5))
//        }
//        return treat
//    }
//}
//val trick = {
//    println("no treats")
//}
//val treat = {
//    println("have a treat")
//}

//*******PUNTO 9**********

//fun main() {
//    val treatFunction = trickOrTreat(false) { "$it quarters" }
//    val trickFunction = trickOrTreat(true, null)
//    repeat(4) {
//        treatFunction()
//    }
//    trickFunction()
//}
//fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
//    if (isTrick) {
//        return trick
//    } else {
//        if (extraTreat != null) {
//            println(extraTreat(5))
//        }
//        return treat
//    }
//}
//val trick = {
//    println("no treats")
//}
//val treat = {
//    println("have a treat")
//}