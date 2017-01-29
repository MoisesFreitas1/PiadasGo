package losfreitasapps.com.boapiada.Piadas;

import java.util.ArrayList;
import java.util.List;

import losfreitasapps.com.boapiada.Modelo.Piadas;

/**
 * Created by Moises on 20/08/16.
 */
public class Politicos {
    private static List<Piadas> ppoliticos = new ArrayList<>();

    public static List<Piadas> getPPoliticos() {
        if (ppoliticos.isEmpty()) {
            Piadas piadas = new Piadas();
            piadas.setId(1L);
            piadas.setTitulo("No comício");
            piadas.setPiada("Num comício daquela pequena cidade, dizia o prefeito: - Queridos cidadãos e cidadãs, durante todo o meu mandato, coloquei a minha honestidade acima de qualquer interesse político. Vocês podem ter certeza que neste bolso - e batia no bolso do paletó com uma das mãos - nunca entrou dinheiro do povo. Neste instante alguém grita: - Paletó novo, hein?");
            ppoliticos.add(piadas);

            piadas = new Piadas();
            piadas.setId(2L);
            piadas.setTitulo("Lula visitando um hospital");
            piadas.setPiada("Lula está fazendo uma visita num hospital. Ele está passando por uma ala acompanhado do diretor do hospital, quandovê um homem num quarto masturbando-se ferozmente. Asituação é meio constrangedora,e o presidente pede uma explicação. O diretor explica: - Trata-sede uma doença rara. Este paciente produz uma quantidade anormal de esperma e ele é obrigado a masturbar-se quatro vezes ao dia para evitar que seus testículos explodam. O presidente se satisfaz com a resposta eprossegue a visita. Mais adiante, ele vê um pacientesentado numa cama com uma enfermeira ajoelhada aplicando-lhe uma bela sessão de sexo oral. - Exijouma explicação para esta imoralidade num hospital tão conceituado como este. O diretor responde: - Mesmo problema, mas com um Plano de Saúde melhor...");
            ppoliticos.add(piadas);

            piadas = new Piadas();
            piadas.setId(3L);
            piadas.setTitulo("Lula em Nova Iorque");
            piadas.setPiada("O Lula foi a Nova Iorque negociar com o pessoal do FMI. Quando se encaminhava para o local da reunião estava a maior chuva. Muito vaidoso, ele dobrou a barra da calça, para não molhar. Entrou na limousine, e foi se encontrar com os banqueiros americanos. Lá pela tantas, o pau quebrando na reunião, o Mercadante que estava na comitiva, reparou nas calças dobradas do Lula, então cochichou: - Presidente! Abaixe as calças! Calma Mercadante ! Primeiro vamos tentar um acordo!");
            ppoliticos.add(piadas);

            piadas = new Piadas();
            piadas.setId(4L);
            piadas.setTitulo("Presidente Bush sequestrado");
            piadas.setPiada("Um homem dirigindo no trânsito, pára, e repentinamente, alguém bate no vidro do carro dele. Ele abaixa o vidro e pergunta o que o outro homem quer. O outro homem diz: 'O Presidente Bush foi sequestrado e o resgate é $50 milhões de dólares. Se o resgate não for pago, o sequestrador irá jogar gasolina e atear fogo nele. Nós estamos arrecadando contribuições. Tu gostarias de participar?' O homem no carro pergunta: 'Na média quanto o pessoal está doando?' O outro homem responde: ' Em torno de 5 a 10 litros'.");
            ppoliticos.add(piadas);

            piadas = new Piadas();
            piadas.setId(5L);
            piadas.setTitulo("Ônibus lotado de políticos");
            piadas.setPiada("Numa noite escura, voltando de uma carreata pelo interior, um dos ônibus, lotado de políticos sai da pista, capota duas vezes e cai numa fazenda. O fazendeiro acorda assustado e vai ver o que aconteceu. Ao se deparar com aquela terrível visão, rapidamente começa a cavar um buraco, onde enterra os corpos. Alguns dias depois, um investigador bate a sua porta e faz várias perguntas sobre o acidente. - E onde estão os políticos? - Eu enterrei eles naquela cova ali! - Mas estavam todos mortos? - espanta-se o policial. - Bem... alguns diziam que não... mas o senhor sabe como os políticos são mentirosos!");
            ppoliticos.add(piadas);

            piadas = new Piadas();
            piadas.setId(6L);
            piadas.setTitulo("O selo do Lula");
            piadas.setPiada("Lula queria um selo com sua foto para marcar o seu primeiro semestre de governo. Ele exigiu um selo de altíssima qualidade. Os selos sao criados, impressos e vendidos. Lula fica radiante! Mas em poucos dias ele fica furioso ao ouvir reclamações de que o selo não adere aos envelopes. O presidente convoca os responsáveis e ordena que investiguem o assunto. Eles pesquisam as agências dos Correios de todo o país e relatam o problema a Lula. O relatório diz: 'Não há nada de errado com a qualidade dos selos. O problema é que o povo está cuspindo do lado errado.'");
            ppoliticos.add(piadas);

            piadas = new Piadas();
            piadas.setId(7L);
            piadas.setTitulo("Passageiros em apuros");
            piadas.setPiada("Um avião estava prestes a cair com 5 passageiros à bordo e apenas 4 paraquedas. O 1º.passageiro disse: 'Eu sou Kobe Briant, o melhor jogador de basquete da NBA, os LA Lakers precisam de mim e, portanto, eu não posso morrer'. Então elepegou o primeiro paraquedas e saltou do avião; O 2º.passageiro, Hillary Clinton, disse: 'Eu sou a mulher do ex-presidente dos EUA, senadora por Nova Iorque e uma potencial futura presidente'. Então ela pegou o segundo paraquedas e saltou do avião; O 3º.passageiro, George W. Bush, disse: 'Eu sou o presidente dos EUA. Eu tenho grandes responsabilidades por ser o líder de uma superpotência e eu sou o presidente mais esperto da história dos EUA, então o povo americano não quer que eu morra' - Então ele pegou o paraquedas e saltou do avião. O 4º.passageiro, o Papa, disse a quinta passageira - uma garotinha de 10 anos de idade: 'Eu estou velho e fraco e não me restam muitos anos de vida e como católico devo sacrificar minha vida e deixar para você o último paraquedas'. Então a garota disse: 'Está tudo bem Papa, ainda resta um paraquedas para o senhor. O presidente mais inteligente da história dos EUA saltou com a minha mochila escolar!....'");
            ppoliticos.add(piadas);
        }
        return ppoliticos;
    }
}


