import com.danveloper.Discount
import com.danveloper.Coverage

class BootStrap {

    def init = { servletContext ->
        // Setup some simple discounts
        new Discount(name: "Senior Citizen's Discount", percentage: true, amount: 25.0).save(flush: true)
        new Discount(name: "No Loss Discount", percentage: false, amount: 50.0).save(flush: true)
        new Discount(name: "Non-Arsonist Discount", percentage: true, amount: 5.0).save(flush: true)

        // Setup some simple coverages
        new Coverage(name: "Theft Coverage", percentage: false, amount: 100.0).save(flush: true)
        new Coverage(name: "Flood Coverage", percentage: false, amount: 100.0).save(flush: true)
        new Coverage(name: "Coastal Distance Coverage", percentage: true, amount: 10.0).save(flush: true)
    }
    def destroy = {
    }
}
