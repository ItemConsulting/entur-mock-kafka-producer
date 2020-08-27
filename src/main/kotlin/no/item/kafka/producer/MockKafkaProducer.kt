package no.item.kafka.producer

fun main(args: Array<String>) {
  MockKafkaProducer().run()
}

class MockKafkaProducer {
  fun run() {
    println("Application started")
    val message = "This message is sent from a Kafka-producer "
    MessageSender().send(message)
  }
}
