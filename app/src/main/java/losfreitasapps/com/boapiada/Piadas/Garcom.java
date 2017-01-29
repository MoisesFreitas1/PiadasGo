package losfreitasapps.com.boapiada.Piadas;

import java.util.ArrayList;
import java.util.List;

import losfreitasapps.com.boapiada.Modelo.Piadas;

/**
 * Created by Moises on 18/08/16.
 */
public class Garcom {
    private static List<Piadas> pgarcom = new ArrayList<>();

    public static List<Piadas> getPGarcom() {
        if (pgarcom.isEmpty()) {
            Piadas piadas = new Piadas();
            piadas.setId(1L);
            piadas.setTitulo("Jantar á luz de velas");
            piadas.setPiada("Um homem e uma bonita mulher estavam jantando á luz de velas num restaurante de luxo. De repente o garçom notou que o homem escorregava lentamente para debaixo da mesa. A mulher parecia não reparar que o companheiro tinha desaparecido. - Perdão, senhora - disse o garçom - mas eu acho que seu marido está debaixo da mesa. - Não está não - disse a mulher, olhando calmamente para o garçom - Meu marido acabou de entrar no restaurante.");
            pgarcom.add(piadas);

            piadas = new Piadas();
            piadas.setId(2L);
            piadas.setTitulo("Sopa de dedo");
            piadas.setPiada("O cliente pede a sopa e repara que o garçom trás a sopa com o dedo indicador dentro do prato, deixa a sopa na mesa e o freguês diz: - Olha, quando você trazia a sopa, eu reparei que você estava com o dedo dentro dela, por que isto? - Sabe o que é, doutor, é que eu estou com micose no dedo e o médico disse pra eu deixa-lo em um lugar quente para cura-lo logo. - ENTãO POR QUE VOCê Nã ENFIA ESTE DEDO NO C*ú? Estava lá, mas o senhor pediu a sopa...");
            pgarcom.add(piadas);

            piadas = new Piadas();
            piadas.setId(3L);
            piadas.setTitulo("Feijoada com cabelo");
            piadas.setPiada("O freguês: - Garçom, tem um cabelo na minha feijoada!!! - Ah, o senhor me desculpe, mas tenho certeza que é do saco do feijão. - Tudo bem, então. Passado um tempo e o freguês: - Garçom, tem outro cabelo na minha feijoada. - Fique tranqüilo, senhor, tenho certeza que é do saco do feijão de novo... - ô, garçom, car**ho! Tem um monte de cabelo na minha feijoada!!! - Tudo bem, senhor, vou trocar seu prato, mas tenho certeza que é do saco do feijão. - ótimo, melhor assim. - ô feijão! Vem aqui trocar o prato do cavalheiro!!!");
            pgarcom.add(piadas);

            piadas = new Piadas();
            piadas.setId(4L);
            piadas.setTitulo("Pato assado");
            piadas.setPiada("Um sujeito pediu um pato assado no restaurante. Quando garçom o trouxe, a ave estava dura feito pedra. O cara, muito brabo, chamou o garçom: - Garçom, me faz um favor? Devolve esse pato lá pro canalha do cozinheiro e manda ele enfiar esse pato no c*u! - O senhor vai ter que esperar... tem um frango à Rossini e um filé à Diana na sua frente.");
            pgarcom.add(piadas);

            piadas = new Piadas();
            piadas.setId(5L);
            piadas.setTitulo("Viagem pela Amazônia");
            piadas.setPiada("Um empresário estava no meio de uma viagem pela Amazônia, quando entrou em um restaurante e pediu o cardápio. Depois de ler todo o menu e não se interessar por nenhum prato, ele pediu uma sugestão ao garçom: - O prato que os turistas mais gostam é Hipoglós, senhor. - Hipoglós? - gritou ele, assustado - Que tipo de prato é esse? Muito tranqüilo, o garçom respondeu: - Pacú assado, senhor!");
            pgarcom.add(piadas);

            piadas = new Piadas();
            piadas.setId(6L);
            piadas.setTitulo("Desenho animado");
            piadas.setPiada("O freguês: - Garçom, tem um negócio se mexendo no meu prato! - Não se preocupe, senhor, é só o desenho do prato. - Mas está se mexendo... - Ah, é porque é um desenho animado.");
            pgarcom.add(piadas);

            piadas = new Piadas();
            piadas.setId(7L);
            piadas.setTitulo("Preparo do frango");
            piadas.setPiada("Posso ajuda-lo a fazer o pedido, cavalheiro? - pergunta o garçom. - Sim... Como é que vocês preparam esse frango? - Sem muita conversa mole, senhor. Nós vamos direto ao assunto e informamos que ele vai morrer.");
            pgarcom.add(piadas);

            piadas = new Piadas();
            piadas.setId(8L);
            piadas.setTitulo("Mosca na sopa");
            piadas.setPiada("O freguês: - Garçom, trem uma mosca nadando na minha sopa! - É claro, você queria que ela estivesse morrendo afogada?");
            pgarcom.add(piadas);

            piadas = new Piadas();
            piadas.setId(9L);
            piadas.setTitulo("Língua");
            piadas.setPiada("O garçom fala com o freguês: - O prato da casa hoje é língua ao molho madeira, - Não, língua não! tenho nojo de qualquer coisa que sai da boca de um animal. E o garçom cínico: - Então que tal uma omelete?");
            pgarcom.add(piadas);
        }
        return pgarcom;
    }
}


