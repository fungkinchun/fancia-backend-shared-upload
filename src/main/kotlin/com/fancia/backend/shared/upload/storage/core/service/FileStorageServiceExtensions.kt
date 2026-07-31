package com.fancia.backend.shared.upload.storage.core.service

import com.fancia.backend.shared.upload.storage.core.enums.UploadScope
import java.util.UUID

private const val TMP_PREFIX = "tmp/"

/**
 * Moves a `tmp/` upload to `{scope}/{resourceId}/{purpose}/{fileName}`.
 * Keys that are already dedicated are returned unchanged.
 */
fun FileStorageService.moveTmpToDedicatedPath(
    objectKey: String,
    scope: UploadScope,
    resourceId: UUID,
): String {
    if (!objectKey.startsWith(TMP_PREFIX)) {
        return objectKey
    }
    val purpose = scope.allowedPurposes().single()
    val fileName = objectKey.removePrefix(TMP_PREFIX)
    val destinationPath = "${scope.pathSegment}/$resourceId/${purpose.pathSegment}/$fileName"
    moveFile(objectKey, destinationPath)
    return destinationPath
}
