// validar nome
function validar_nome() {

  $('input[name="nome"]').mask('SSSSSSSSSSSSSSSS');

  let value = document.getElementById("nome").value;

  if (value == "" || value == null ) {
    // campo inválido, retorna false para o formulário não ser submetido
    alert('Nome não informado');
    document.form.nome.focus();
    return false;
  }
  return true;
}

//Validar CPF
function validar_cpf() {


  let comp= document.getElementById("cpf").value.length;
  let value = document.getElementById("cpf").value;

  if (value == "" || value == null || TestaCPF(value) == false ) {
    // campo inválido, retorna false para o formulário não ser submetido
    alert('CPF / CNPJ não informado ou inválido');
    document.form.cpf.focus();
    return false;
  } 
  if(comp < 14 || value[11] == "-"){
    $("#cpf").mask("999.999.999-99");
    } else {
      $("#cpf").mask("99.999.999/9999-99");
    }
  return true;
}



//Validar telefone
function validar_tel() {

  $('input[name="wap"]').mask('(00) 00000-0000');
  
  let value = document.getElementById("wap").value;
  
  if (value == "" || value == null) {
    // campo inválido, retorna false para o formulário não ser submetido
    alert('Whatapss não informado');
    document.form.mail.focus();
    return false;
  }
  return true;
}

// function validar_email() {

//   let value = document.getElementById("email").value;

//   if (value == "" || value == null ) {
//     // campo inválido, retorna false para o formulário não ser submetido
//     alert('e-mail não informado');
//     document.form.nome.focus();
//     return false;
//   }
//   return true;
// }

function validar_parc() {
  
  if ($('#parc').val().trim() === '') {
    alert('Parceria não selecionada');
    return false;
  }
  return true;
}


//Validar CEP - entrada
function validar_cep() {

  $('input[name="cep"]').mask('00000-000');
  
  let value = document.getElementById("cep").value;
  
  if (value == "" || value == null) {
    // campo inválido, retorna false para o formulário não ser submetido
    alert('CEP não informado');
    document.form.mail.focus();
    return false;
  }
  return true;
}


//Validar CEP
function validar_num() {

  $('input[name="num"]').mask('00000');
  
  let value = document.getElementById("num").value;
  
  if (value == "" || value == null) {
    // campo inválido, retorna false para o formulário não ser submetido
    alert('CEP não informado');
    document.form.mail.focus();
    return false;
  }
  return true;
}





// Pesquisa CEP -----------------

function limpa_formulário_cep() {
  //Limpa valores do formulário de cep.
  document.getElementById('rua').value=("");
  document.getElementById('bairro').value=("");
  document.getElementById('cidade').value=("");
  document.getElementById('uf').value=("");
}

function meu_callback(conteudo) {
if (!("erro" in conteudo)) {
  //Atualiza os campos com os valores.
  document.getElementById('rua').value=(conteudo.logradouro);
  document.getElementById('bairro').value=(conteudo.bairro);
  document.getElementById('cidade').value=(conteudo.localidade);
  document.getElementById('uf').value=(conteudo.uf);
} //end if.
else {
  //CEP não Encontrado.
  limpa_formulário_cep();
  alert("CEP não encontrado.");
}
}

function pesquisacep(valor) {

//Nova variável "cep" somente com dígitos.
var cep = valor.replace(/\D/g, '');

//Verifica se campo cep possui valor informado.
if (cep != "") {

  //Expressão regular para validar o CEP.
  var validacep = /^[0-9]{8}$/;

  //Valida o formato do CEP.
  if(validacep.test(cep)) {

      //Preenche os campos com "..." enquanto consulta webservice.
      document.getElementById('rua').value="...";
      document.getElementById('bairro').value="...";
      document.getElementById('cidade').value="...";
      document.getElementById('uf').value="...";

      //Cria um elemento javascript.
      var script = document.createElement('script');

      //Sincroniza com o callback.
      script.src = 'https://viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';

      //Insere script no documento e carrega o conteúdo.
      document.body.appendChild(script);

  } //end if.
  else {
      //cep é inválido.
      limpa_formulário_cep();
      alert("Formato de CEP inválido.");
  }
} //end if.
else {
  //cep sem valor, limpa formulário.
  limpa_formulário_cep();
}
};
// -----------------------------------------------

function validar_tudo() {
  // se um deles for inválido, retorna false e o form não é submetido
  if (validar_nome() && validar_cpf() && validar_tel() && validar_parc() && validar_cep() && validar_num()  )
            {
            document.getElementById('assinar').removeAttribute('disabled'); // ativar botao cadastrar
            alert("Tudo certo. Proximo passo Cadastrar");
          }
        else
          {
          return false;
          }
}
// -----------------------------------------------

function encerra(){
  // capturar formularo em formato Json
  var formData = JSON.stringify($("#form_c").serializeArray()); 

 
  let nome_c = document.getElementById("nome").value;

  
  alert( nome_c + '\n' +  'Cadastro Realizado');
  
  alert("Json : "+ formData );

}



// -Validar CPF - ---------------------------------------

function TestaCPF(strCPF) {

  var tamanho = strCPF.length

  if ( tamanho < 14 ) {   
        var Soma;
        var Resto;
        Soma = 0;
          if (strCPF == "00000000000") return false;

          for (i=1; i<=9; i++) Soma = Soma + parseInt(strCPF.substring(i-1, i)) * (11 - i);
          Resto = (Soma * 10) % 11;

            if ((Resto == 10) || (Resto == 11))  Resto = 0;
            if (Resto != parseInt(strCPF.substring(9, 10)) ) return false;

          Soma = 0;
            for (i = 1; i <= 10; i++) Soma = Soma + parseInt(strCPF.substring(i-1, i)) * (12 - i);
            Resto = (Soma * 10) % 11;

            if ((Resto == 10) || (Resto == 11))  Resto = 0;
            if (Resto != parseInt(strCPF.substring(10, 11) ) ) return false;
            return true;
  }

  else{
    
    var cnpj = strCPF;

    cnpj = cnpj.replace(/[^\d]+/g,'');
 
    if(cnpj == '') return false;
     
    if (cnpj.length != 14)
        return false;
 
    // Elimina CNPJs invalidos conhecidos
    if (cnpj == "00000000000000" || 
        cnpj == "11111111111111" || 
        cnpj == "22222222222222" || 
        cnpj == "33333333333333" || 
        cnpj == "44444444444444" || 
        cnpj == "55555555555555" || 
        cnpj == "66666666666666" || 
        cnpj == "77777777777777" || 
        cnpj == "88888888888888" || 
        cnpj == "99999999999999")
        return false;
         
    // Valida DVs
    tamanho = cnpj.length - 2
    numeros = cnpj.substring(0,tamanho);
    digitos = cnpj.substring(tamanho);
    soma = 0;
    pos = tamanho - 7;
    for (i = tamanho; i >= 1; i--) {
      soma += numeros.charAt(tamanho - i) * pos--;
      if (pos < 2)
            pos = 9;
    }
    resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
    if (resultado != digitos.charAt(0))
        return false;
         
    tamanho = tamanho + 1;
    numeros = cnpj.substring(0,tamanho);
    soma = 0;
    pos = tamanho - 7;
    for (i = tamanho; i >= 1; i--) {
      soma += numeros.charAt(tamanho - i) * pos--;
      if (pos < 2)
            pos = 9;
    }
    resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
    if (resultado != digitos.charAt(1))
          return false;
           
    return true;
  }  // fim do if CPF / CNPJ 
          
} // fim da função 
