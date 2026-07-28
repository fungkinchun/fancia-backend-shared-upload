package com.fancia.backend.shared.upload.storage.core.dto

import java.time.Instant

data class PresignUploadResponse(
    val uploadUrl: String,
    val objectKey: String,
    val expiresAt: Instant,
)
