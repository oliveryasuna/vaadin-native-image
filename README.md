# vaadin-native-image

[![](https://img.shields.io/vaadin-directory/version/graalvm-native-image-example)](https://vaadin.com/directory/component/graalvm-native-image-example)
[![](https://img.shields.io/vaadin-directory/star/graalvm-native-image-example)](https://vaadin.com/directory/component/graalvm-native-image-example)

This is a simple example of a Vaadin application that can be compiled to a native image using GraalVM.

## Getting Started

You can run the application normally with Spring Boot:

```shell
mvn spring-boot:run
```

...or you can compile it to a native image:

```shell
mvn clean -P native,production package native:compile
./target/vaadin-native-image
```

## License

This repository and its contents are licensed by [BSD 3-Clause](LICENSE.txt).

In other words, feel free to use this in your projects, but please give credits to its author(s).

## Sponsoring

If you like my work and want to support it, please consider [sponsoring](https://github.com/sponsors/oliveryasuna) me. It's how I make the time to code great
things!
