# Project: BoletimAPI
Essa Γ© uma RESTful API fictΓ­cia de um sistema de boletim, bem como o de uma escola. O sistema Γ© bem simples e limitado ainda. Este Γ© o meu primeiro projeto de API em Java.

## Tecnologias Utilizadas

As tecnologias que utlizei para o desenvolvimento dessa API foram:

- Java (JDK 19)
- Spring Boot
- H2 (SGBD)
- Lombok
# π Collection: Aluno 


## End-point: Retorna Todos os Alunos
### Method: GET
>```
>localhost:8080/alunos
>```

β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β

## End-point: Retorna Aluno por Id
### Method: GET
>```
>localhost:8080/alunos/1
>```

β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β

## End-point: Cria Novo Aluno
### Method: POST
>```
>localhost:8080/alunos
>```
### Body (**raw**)

```json
{
    "nome":"JoΓ£o"
}
```


β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β

## End-point: Edita Aluno
### Method: PUT
>```
>localhost:8080/alunos/1
>```
### Body (**raw**)

```json
{
    "nome":"Joana"
}
```


β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β

## End-point: Deleta Aluno por Id
### Method: DELETE
>```
>localhost:8080/alunos/1
>```

β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β
# π Collection: Disciplina 


## End-point: Retorna Todas as Disciplinas
### Method: GET
>```
>localhost:8080/disciplinas
>```

β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β

## End-point: Retorna Disciplina por Id
### Method: GET
>```
>localhost:8080/disciplinas/1
>```

β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β

## End-point: Cria Nova Disciplina
### Method: POST
>```
>localhost:8080/disciplinas
>```
### Body (**raw**)

```json
{
    "nome": "MatemΓ‘tica"
}
```


β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β

## End-point: Edita Disciplina
### Method: PUT
>```
>localhost:8080/disciplinas/1
>```
### Body (**raw**)

```json
{
    "nome":"historia"
}
```


β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β

## End-point: Deleta Disciplina
### Method: DELETE
>```
>localhost:8080/disciplinas/1
>```

β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β
# π Collection: Nota 


## End-point: Retorna Todas as Notas
### Method: GET
>```
>localhost:8080/notas
>```

β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β

## End-point: Retorna Nota por Id do Aluno
### Method: GET
>```
>localhost:8080/notas/1
>```

β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β

## End-point: Adiciona Nova Nota
### Method: POST
>```
>localhost:8080/notas
>```
### Body (**raw**)

```json
{
    "aluno": {
        "id": 1
    },
    "disciplina": {
        "id": 1
    },
    "nota": 9,
    "bimestre":2
}
```


β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β

## End-point: Edita Nota por Id
### Method: PUT
>```
>localhost:8080/notas/1
>```
### Body (**raw**)

```json
{
    "aluno": {
        "id": 1
    },
    "disciplina": {
        "id": 1
    },
    "nota": 2.0,
    "bimestre": 1
}
```


β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β

## End-point: Deleta Nota Por Id
### Method: DELETE
>```
>localhost:8080/notas/1
>```

β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β
_________________________________________________
Powered By: [postman-to-markdown](https://github.com/bautistaj/postman-to-markdown/)
