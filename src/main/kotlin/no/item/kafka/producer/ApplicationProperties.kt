package no.item.kafka.producer

import com.fasterxml.jackson.databind.ser.std.StringSerializer
import java.util.*

class ApplicationProperties {

    fun getProperties(): Properties {
        val properties = Properties()
        properties["bootstrap.servers"] = ""
        properties["key.serializer"] = StringSerializer::class.java
        properties["value.serializer"] = StringSerializer::class.java
        properties["topic"] = "kafka-event"
        return properties
    }
}
