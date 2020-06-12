package no.item.kafka.producer

import java.util.*
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class MessageSender {

    private val logger: Logger = LoggerFactory.getLogger(javaClass)

    fun send(message: String) {
        val props: Properties = ApplicationProperties().getProperties()
        val producer = KafkaProducer<String, String>(props)

        producer.send(ProducerRecord(props.getProperty("topic"), message))
        producer.close()
        logger.info("Message sent")
    }
}
