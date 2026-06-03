package com.fancia.backend.shared.upload.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.fancia.backend.shared.upload.storage"])
class AutoConfig