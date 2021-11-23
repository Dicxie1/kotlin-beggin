class Products {
    private var name: String
    private var price: Double
    private var company : String

    constructor(name: String, price: Double, company: String){
        this.name = name
        this.price = price
        this.company = company
    }
}
fun main(args: Array<String>){
    var product : Products = Products("Leche", 20.00, "Centro lack")
    println(product.toString());
}