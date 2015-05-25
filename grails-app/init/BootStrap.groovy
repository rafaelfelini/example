import example.Person

class BootStrap {

    def init = { servletContext ->
        new Person(name: 'name1').save()
    }

    def destroy = {
    }

}
