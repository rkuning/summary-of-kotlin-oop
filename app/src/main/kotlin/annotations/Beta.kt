package annotations

@Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented()

annotation class Beta()

class ExampleTarget(
    @field:Beta val firstname : String,
    @get:Beta val midName : String,
    @param:Beta val lastName : String
    )