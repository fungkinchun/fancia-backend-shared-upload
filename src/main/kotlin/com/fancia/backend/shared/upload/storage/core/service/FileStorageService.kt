package com.fancia.backend.shared.upload.storage.core.service

interface FileStorageService {
    fun deleteFile(fileName: String)
    fun listFiles(): MutableList<String?>
    fun moveFile(sourceFileName: String, destinationFileName: String)
}
