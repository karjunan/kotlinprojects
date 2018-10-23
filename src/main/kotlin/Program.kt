import com.providers.Providers

fun main(args:Array<String>) {

    val allProviders = Providers.getProviders()

    allProviders.forEach{
        v -> v.forEach{
        k,v -> println("$k, $v")
    }
    }
}
