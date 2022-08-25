package by.feature.dsl

import groovy.util.logging.Slf4j

import static by.feature.dsl.EntityGuiDsl.entityGui
import groovy.xml.*


@Slf4j
class DslRunner {

    static void main(String[] args) {


        def writer = new StringWriter()
        def xml = new MarkupBuilder(writer)

        xml.entityGui( entityClass: Person ) {

            table( pageable: true, controllerName: 'person', action: 'list' ){

              column(name: 'firstName', label: 'Primeiro Nome' , sorteable: true )
              column(name: 'lastName' , label: 'Último Nome'   , sorteable: true )
              column(name: 'age'      , label: 'Idade'         , sorteable: true )

            }

            form( title: 'Formulário de Person' ) {

                fieldset{
                    field( name: 'firstName', required: true, label: 'Primeiro Nome' )
                    field( name: 'lastName' , required: true, label: 'Último Nome'   )
                    field( name: 'age'      , required: true, label: 'Idade'         )
                }

                actions{
                    button (name: 'submit', text: 'Confirmar')
                    button (name: 'submit', text: 'Cancelar' )
                }

            }

        }


        String resultado = writer.toString()
        log.info(resultado)
//
//        assert records.car.first().name.text() == 'HSV Maloo'
//        assert records.car.last().name.text() == 'Royale'

//         entityGui( Person ){
//
//             field ("firstName"){
//
//             }
//
//         }


    }




}


class Person {
    String  firstName
    String  lastName
    Integer age
}
