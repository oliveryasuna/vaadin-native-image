package com.oliveryasuna.vaadin.example.vni;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(Application.TypeMappedAnnotationArrayRuntimeHints.class)
public class Application {

  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }

  // See https://github.com/spring-projects/spring-framework/issues/30071.
  static final class TypeMappedAnnotationArrayRuntimeHints implements RuntimeHintsRegistrar {

    @Override
    public void registerHints(final RuntimeHints hints, final ClassLoader classLoader) {
      hints.reflection()
          .registerType(
              TypeReference.of("org.springframework.core.annotation.TypeMappedAnnotation[]"),
              MemberCategory.INVOKE_DECLARED_CONSTRUCTORS
          );
    }

  }

}
