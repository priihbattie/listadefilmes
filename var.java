var cpf := formulario1->CPF
var nome := formulario1->Nome
var cidade := formulario1->Cidade

var sucesso = validaCpf(cpf)
if(sucesso) {
    gravarCliente(cpf, nome, cidade)
} else {
    mostrarErro()
}

    var cpf := formularioBusca->CPF

    var sucesso = validaCpf(cpf)
    
    if(sucesso)
      buscaNoBanco(cpf)
      else
      mostrarErro()
