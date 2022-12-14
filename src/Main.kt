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
    return lista.map{ it.nome }
            .distinct()
            .count()
}

fun mediaNotasEstrangeiras(lista: List<Aluno>): Double{
    return lista.filter { !it.ePortugues() }
            .map { it.nota }
            .average()
}

fun nomeDos2AlunosComNotaMaisAltaOrdenadasDecrescente(lista: List<Aluno>): List<String>{

}

fun main(){
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


}