package no.item.kafka.producer

import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.util.*
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Suppress("UNUSED_VARIABLE")
class MessageSender {

  private val logger: Logger = LoggerFactory.getLogger(javaClass)
  private val fileName = "logfile.txt"
  private val file = File(fileName)

  fun send(message: String) {

    val props: Properties = getProperties()
    val producer = KafkaProducer<String, String>(props)
    var counter = 1

    val isNewFileCreated: Boolean = file.createNewFile()
    val startup = " - Starting producer - \n"
    writeToFile(startup)
    writeToFile("producer: $producer\n")

    while (true) {
      try {
        val result = producer.send(ProducerRecord("EnturMockKafka-topic1", message.plus(counter.toString())))
        writeToFile("sent a record: $message\n")
        Thread.sleep(500)
        result.get()
        writeToFile("waiting 500 millis, message is sent")
        counter += 1
      } catch (ex: Exception) {
        logger.info("exception occurred: " + ex.stackTrace)
      }
    }
  }

  private fun writeToFile(message: String) {
    logger.info(message)
    Files.write(Paths.get(file.absolutePath), message.toByteArray(), StandardOpenOption.APPEND)
  }
}
