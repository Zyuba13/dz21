fun main() {
    val amount = 1000000
    val totalPercent = 100
    val percent = 0.75
    val commissionMin = 3500
    val commission = amount / totalPercent * percent
    val resalt = if (commission > commissionMin) commission else commissionMin
    print("Коммисия: $resalt копеек")
}