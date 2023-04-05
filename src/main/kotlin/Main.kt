fun main() {
    val height= averageAndHeight(listOf(36.7,74.5,29.9,83.1,17.9,))

    println(height)

}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class AverageMeasurements(var height: Double, var totalheight: Double)

fun averageAndHeight(height: List<Double>): AverageMeasurements {

    val avg = height.average()
    val totalheight = height.sum()

    return AverageMeasurements(avg, totalheight)
}
