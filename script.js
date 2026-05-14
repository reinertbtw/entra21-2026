const assentos =
    document.querySelectorAll('.assento:not(.ocupado)');

const quantidade =
    document.getElementById('quantidade');

const total =
    document.getElementById('total');

const preco = 20;

assentos.forEach(assento => {
    assento.addEventListener('click', () => {
        assento.classList.toggle('selecionado');
        atualizarResumo();
    });
});

function atualizarResumo() {
    const selecionados =
        document.querySelectorAll('.assento.selecionado');

    const quantidadeSelecionada =
        selecionados.length;

    quantidade.innerText =
        quantidadeSelecionada;

    total.innerText =
        quantidadeSelecionada * preco;
}