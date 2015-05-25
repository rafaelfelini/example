package example


class ExampleInterceptor {

    public ExampleInterceptor() {
        matchAll()
    }

    boolean before() {
        def persons = Person.all
        printn persons

        return true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }

}
