package com.fancia.backend.shared.upload.storage.s3.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "app.s3")
class S3Configuration {
    var bucketName: String? = null
}
