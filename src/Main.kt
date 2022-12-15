fun contaAlunosAprovados(lista: List<Aluno>): Int{
    return lista.filter {it.estaAprovado()}
            .count()
}

fun contaAlunosPortuguesesAprovados(lista: List<Aluno>): Int{
    return lista.filter {it.ePortugues()}
            .filter { it.estaAprovado() }
            .count()

}

fun getNomesDosAlunosAprovados(lista: List<Aluno>): String{
    return lista.filter { it.estaAprovado() }
            .map { it.nome }
            .joinToString (",")
}

fun quantasNotasDiferentes(lista: List<Aluno>): Int{
    return lista.map{ it.nota }
            .distinct()
            .count()
}

fun mediaNotasEstrangeiras(lista: List<Aluno>): Double{
    return lista.filter { !it.ePortugues() }
            .map { it.nota }
            .average()
}

fun nomeDos2AlunosComNotaMaisAltaOrdenadasDecrescente(lista: List<Aluno>): List<String>{
    return lista.sortedWith{n1,n2 -> n2.nota - n1.nota}
            .map { it.nome }
            .take(2)
}

fun dadosDos3AlunosComNotaMaisAltaOrdenadosCrescente(lista: List<Aluno>): List<String>{
    return lista.sortedWith{n1,n2 -> n1.nota - n2.nota}
            .map { it.nome + " : " + it.nacionalidade + " : " + it.nota   }
            .takeLast(3)
}

fun main(){
    /*
    val listaTeste  = mutableListOf<Aluno>()
    listaTeste.add(Aluno("Rodrigo",12,"Portuguesa"))
    listaTeste.add(Aluno("Bernardo",8,"Portuguesa"))
    listaTeste.add(Aluno("Ratatouille",17,"Ucraniano"))
    listaTeste.add(Aluno("Dionisio",4,"Romeno"))
    println(contaAlunosAprovados(listaTeste))
    println(contaAlunosPortuguesesAprovados(listaTeste))
    println(getNomesDosAlunosAprovados(listaTeste))
    println(quantasNotasDiferentes(listaTeste))
    println(mediaNotasEstrangeiras(listaTeste))
    println(nomeDos2AlunosComNotaMaisAltaOrdenadasDecrescente(listaTeste))
    println(dadosDos3AlunosComNotaMaisAltaOrdenadosCrescente(listaTeste))
    
     */
}