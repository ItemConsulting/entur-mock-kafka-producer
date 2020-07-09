package no.item.kafka.producer

import java.util.*
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class MessageSender {

  private val logger: Logger = LoggerFactory.getLogger(javaClass)

  fun send(message: String) {
    val props: Properties = getProperties()
    val producer = KafkaProducer<String, String>(props)
    var counter = 1
    while (true) {
      try {
        val result = producer.send(ProducerRecord(props.getProperty("topic"), message.plus(counter.toString())))
        logger.debug("Sent a record")
        Thread.sleep(500)
        result.get()
        logger.info("Message sent")
        counter += 1
      } catch (ex: Exception) {
        logger.info("exception occurred: " + ex.stackTrace)
      }
    }
  }
}
