package no.item.kafka.producer

import java.util.*
import org.apache.kafka.clients.CommonClientConfigs
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.config.SslConfigs
import org.apache.kafka.common.serialization.StringSerializer

fun getProperties(): Properties {
  val properties = Properties()
  with(properties) {
    put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "b-3.enturmockkafkacluster.ni8qp8.c3.kafka.eu-north-1.amazonaws.com:9094,b-2.enturmockkafkacluster.ni8qp8.c3.kafka.eu-north-1.amazonaws.com:9094,b-1.enturmockkafkacluster.ni8qp8.c3.kafka.eu-north-1.amazonaws.com:9094")
    put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer().javaClass.name)
    put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer().javaClass.name)
    put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SSL")
    put(SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG, "/tmp/kafka.client.truststore.jks")
  }
  return properties
}
