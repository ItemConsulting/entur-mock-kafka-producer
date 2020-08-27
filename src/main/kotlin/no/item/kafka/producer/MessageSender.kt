package no.item.kafka.producer

import java.util.Properties
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord

@Suppress("UNUSED_VARIABLE")
class MessageSender {
  fun send(message: String) {
    val props: Properties = getProperties()
    val producer = KafkaProducer<String, String>(props)
    println(" - Starting producer $producer- \n")
    var counter = 1
    while (true) {
      try {
        val result = producer.send(ProducerRecord("EnturMockKafka-topic1", "$message, and is #$counter"))
        println("sent a record: $message\n")
        Thread.sleep(5000)
        result.get()
        println("waiting 5000 millis, message is sent")
        counter++
      } catch (ex: Exception) {
        println("exception occurred: " + ex.stackTrace)
      }
    }
  }
}
