package losfreitasapps.com.boapiada.Piadas;

import java.util.ArrayList;
import java.util.List;

import losfreitasapps.com.boapiada.Modelo.Piadas;

/**
 * Created by Moises on 18/08/16.
 */
public class Curtas {
    private static List<Piadas> pcurtas = new ArrayList<>();

    public static List<Piadas> getPCurtas() {
        if (pcurtas.isEmpty()) {
            Piadas piadas = new Piadas();
            piadas.setId(1L);
            piadas.setTitulo("O garoto que apanhou da vizinha");
            piadas.setPiada("O garoto apanhou da vizinha, e a mãe furiosa foi tomar satisfação: Por que a senhora bateu no meu filho? Ele foi mal-educado, e me chamou de gorda. E a senhora acha que vai emagrecer batendo nele?");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(2L);
            piadas.setTitulo("Conversa de casados");
            piadas.setPiada("Conversa de casados: Querido, o que você prefere? Uma mulher bonita ou uma mulher inteligente? Nem uma, nem outra. Você sabe que eu só gosto de você.");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(3L);
            piadas.setTitulo("Como emagrecer");
            piadas.setPiada("Doutor, como eu faço para emagrecer? Basta a senhora mover a cabeça da esquerda para a direita e da direita para a esquerda. Quantas vezes, doutor? Todas as vezes que lhe oferecerem comida.");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(4L);
            piadas.setTitulo("O relógio");
            piadas.setPiada("A mulher comenta com o marido: Querido, hoje o relógio caiu da parede da sala e por pouco não bateu na cabeça da mamãe... Maldito relógio. Sempre atrasado...");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(5L);
            piadas.setTitulo("A hora da execução");
            piadas.setPiada("O condenado à morte esperava a hora da execução, quando chegou o padre: Meu filho, vim trazer a palavra de Deus para você. Perda de tempo, seu padre. Daqui a pouco vou falar com Ele, pessoalmente. Algum recado?");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(6L);
            piadas.setTitulo("O advogado e a sogra");
            piadas.setPiada("Um advogado e sua sogra estão em um edifício em chamas. Você só tem tempo pra salvar um dos dois. O que você faz? Você vai almoçar ou vai ao cinema?");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(7L);
            piadas.setTitulo("Mentiroso");
            piadas.setPiada("Mamãe, mamãe... na escola me chamaram de mentiroso. Cale-se que você nem vai à escola ainda...");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(8L);
            piadas.setTitulo("As maravilhas do Oriente");
            piadas.setPiada("Dois amigos conversam sobre as maravilhas do Oriente. Um deles diz: Quando completei 25 anos de casado, levei minha mulher ao Japão. Não diga? E o que pensa fazer quando completarem 50? Volto lá para buscá-la.");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(9L);
            piadas.setTitulo("Partilha dos bens");
            piadas.setPiada("Dois amigos se encontram depois de muitos anos. Casei, separei e já fizemos a partilha dos bens. E as crianças? O juiz decidiu que ficariam com aquele que mais bens recebeu. Então ficaram com a mãe? Não, ficaram com nosso advogado.");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(10L);
            piadas.setTitulo("Se sentindo sozinho?");
            piadas.setPiada("Se você está se sentindo sozinho, abandonado, achando que ninguém liga para você... “Atrase um pagamento\"");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(11L);
            piadas.setTitulo("Por que a loira fala ao telefone deitada?");
            piadas.setPiada("P: Por que a loira fala ao telefone deitada? R: Para não cair a ligação!!");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(12L);
            piadas.setTitulo("O circo");
            piadas.setPiada("Mamãe, mamãe... me leva no circo? Não, filho... Se querem te ver, que venham aqui em casa...");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(13L);
            piadas.setTitulo("Traficante armado");
            piadas.setPiada("Como é que se chama um traficante armado até os dentes? É melhor chamar de senhor...");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(14L);
            piadas.setTitulo("O eletricista na UTI");
            piadas.setPiada("Um eletricista vai até a UTI de um hospital, olha para os pacientes ligados a diversos tipos de aparelhos e diz-lhes: Respirem fundo: vou trocar o fusível.");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(15L);
            piadas.setTitulo("Diferença entre um político e um cachorro atropelados");
            piadas.setPiada("Qual a diferença entre um político e um cachorro atropelados? antes do cachorro, há marcas de freada...");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(16L);
            piadas.setTitulo("No balcão da Alfandega");
            piadas.setPiada("No balcão da Alfandega: Seu nome ? Abu Abdalah Sarafi. Sexo? Quatro vezes por semana. Não, não, não! Homem ou mulher? Homem, mulher. Algumas vezes camelo.");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(17L);
            piadas.setTitulo("Homem de garfo");
            piadas.setPiada("Um homem chega na balada e encontra uma mulher e então dá um garfo a ela. E ela pergunta: para quê o garfo, e ele responde: é por que eu to dando sopa, e ela diz: mas sopa se come de colher, e ele responde: é que eu sou difícil...");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(18L);
            piadas.setTitulo("Mer*da");
            piadas.setPiada("Como é que se faz um monte de velhinhas gritar 'Mer*da'? É só gritar 'Bingo'");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(19L);
            piadas.setTitulo("Sósias do Saddam");
            piadas.setPiada("Um oficial iraquiano chama os oito sósias do Saddam e diz: Tenho boas e más notícias. A boa notícia é que Saddam está vivo. Todos os sósias comemoram. A má notícia é que ele perdeu um braço.");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(20L);
            piadas.setTitulo("Do que diabo morreu?");
            piadas.setPiada("Do que diabo morreu? De diabetes.");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(21L);
            piadas.setTitulo("Matemática e História");
            piadas.setPiada("O que fala o livro de Matemática para o livro de História? R: Não me venha com história que eu já estou cheio de problema!");
            pcurtas.add(piadas);

            piadas = new Piadas();
            piadas.setId(22L);
            piadas.setTitulo("Banho de louco");
            piadas.setPiada("Porque o louco toma banho com o chuveiro desligado? Por que ele comprou um shampoo para cabelos secos!");
            pcurtas.add(piadas);
        }
        return pcurtas;
    }
}

