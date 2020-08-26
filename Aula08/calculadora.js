function calcular(){
    var operacao = document.getElementById('operacao').value;

    var num1 = document.getElementById('num1').value;
    var num2 = document.getElementById('num2').value;

    if( num1 == '' || num1 == null){
        alert('digite um numero valido');
        return false;
    }

    if( num2 == '' || num2 == null){
        alert('digite um numero valido');
        return false;
    }

    var resultado = null;

    num1 = parseFloat(num1);
    num2 = parseFloat(num2);

    switch(operacao){
        case '1':
            resultado = num1 - num2;
            break;
        case '2':
            resultado = num1 + num2;
            break;
        case '3':
            resultado = num1 * num2;
            break;
        case '4':
                resultado = num1 / num2;
                break;
        default:
            alert('A opção selecionada nao existe');
            break;
    }

    document.getElementById('resultado').value = resultado;
}