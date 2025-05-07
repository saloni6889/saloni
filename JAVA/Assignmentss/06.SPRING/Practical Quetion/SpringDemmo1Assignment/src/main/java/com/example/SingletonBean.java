package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
class SingletonBean {}

@Component
@Scope("prototype")
class PrototypeBean {}
