package com.example.portalsenainews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ScrollView Scrollado;
    TextView Manchete, Data, ConteudoNews, Autor;
    ImageView ImagemNews;
    Button BtnAnterior, BtnProximo;
    ArrayList<Noticia> noticias;
    Integer i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = 0;
        Manchete = (TextView) findViewById(R.id.Manchete);
        Data = (TextView) findViewById(R.id.Data);
        ConteudoNews = (TextView) findViewById(R.id.ConteudoNews);
        Autor = (TextView) findViewById(R.id.Autor);
        BtnAnterior = (Button) findViewById(R.id.BtnAnterior);
        BtnProximo = (Button) findViewById(R.id.BtnProximo);
        ImagemNews = (ImageView) findViewById(R.id.ImagemNews);
        Scrollado = (ScrollView) findViewById(R.id.Scrollado);

        Noticia a = new Noticia("Estudo aponta que vacinação em massa pode controlar a pandemia","06/04/2023","\tLorem ipsum dolor sit amet, consectetur adipiscing elit. Nam facilisis tortor nisl, nec consequat velit suscipit quis. Nam porttitor tincidunt maximus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis et neque augue. Curabitur eget fermentum felis. Sed a imperdiet elit. Suspendisse scelerisque, est in sodales consequat, libero metus egestas sapien, vel tempus purus eros eget sapien.\n" +
                "\n" +
                "\tVestibulum nec felis vitae diam gravida pulvinar. Donec a felis nec leo ornare aliquet. Proin non tincidunt magna. Praesent sodales lacus egestas, pharetra nibh vitae, feugiat sem. Suspendisse potenti. Vestibulum molestie, elit ac tincidunt tempus, arcu urna commodo lacus, eget rhoncus diam elit nec lacus. In hac habitasse platea dictumst. Etiam varius risus ac lectus consectetur, id porttitor tortor feugiat. Cras sagittis quam nec luctus suscipit. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec vitae risus sed odio gravida auctor. Suspendisse vestibulum ac neque eget suscipit.\n" +
                "\n" +
                "\tSed fringilla blandit dolor a tempus. Fusce eu commodo magna, vitae pellentesque lacus. Donec in maximus diam. Etiam sit amet consequat lectus. Duis finibus, enim non venenatis vehicula, odio leo semper libero, quis auctor nisl nisl vulputate tellus. Nulla facilisi. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Fusce mollis feugiat elit, eget ornare orci efficitur auctor.\n" +
                "\n" +
                "\tSed eget euismod nunc. Sed sagittis a velit id lacinia. Maecenas quis lorem ultrices, ultricies velit at, malesuada libero. Mauris luctus dignissim iaculis. Curabitur quis neque interdum, lobortis sem et, facilisis elit. Nunc at felis eu nisl aliquet porta. Aenean interdum, nulla venenatis feugiat sollicitudin, augue elit porta lacus, eget sagittis purus felis ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Integer nec pretium ligula, nec hendrerit ipsum. Fusce eget aliquam nisi, at faucibus mi. Praesent at velit at purus iaculis lacinia.\n" +
                "\n" +
                "\tMorbi eget hendrerit urna. Vivamus eget justo non libero commodo dignissim. Praesent non nunc quis justo tincidunt interdum. Suspendisse potenti. Morbi commodo semper quam fermentum porttitor. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Quisque imperdiet libero ac neque aliquam mattis eu id nulla. Mauris at dui sollicitudin, accumsan magna non, viverra odio.","Ayla Viegas", "fotovacina");
        Noticia b = new Noticia("Bolsa de Valores de São Paulo bate recorde histórico","06/04/2023","\tDuis eget felis et tortor scelerisque dictum luctus non lacus. Praesent porta mattis porttitor. Proin ultrices, ligula nec ullamcorper molestie, elit nulla tempor dolor, vel tempus eros lorem eleifend tellus. Suspendisse potenti. Nullam justo lorem, consectetur posuere pulvinar id, congue ac dui. Nam imperdiet maximus congue. Fusce et libero nec mi interdum bibendum. Etiam ac nisi ut diam gravida volutpat vitae at dolor. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Praesent sit amet enim luctus, fermentum orci quis, malesuada ante. Pellentesque sit amet velit in ipsum posuere euismod non at est. Quisque fringilla nisi euismod augue dictum, vel laoreet enim lobortis. Fusce eget dolor id nunc pellentesque volutpat quis nec leo.\n" +
                "\n" +
                "\tPraesent dapibus sagittis dui eu porta. Sed dui est, consectetur dapibus est at, laoreet aliquam ex. Nulla sit amet dolor molestie turpis pretium aliquam. Cras congue elementum molestie. Quisque felis lacus, facilisis a orci non, fermentum pharetra nisi. Nullam quam lorem, posuere vitae tristique quis, lacinia a odio. Etiam cursus aliquam leo. Fusce pretium, libero eget porttitor accumsan, massa elit sollicitudin lorem, et efficitur tellus risus id nisl.\n" +
                "\n" +
                "\tMaecenas nibh ex, facilisis nec placerat tempus, consequat vel erat. Sed non elit eget mi egestas molestie condimentum at enim. Quisque sed feugiat nisl, eget finibus justo. In maximus non sem vitae fermentum. Sed vitae erat tellus. Nullam at nunc pellentesque, scelerisque augue ut, faucibus quam. Vestibulum tempus mattis ipsum non hendrerit. Sed euismod, lectus quis sagittis tristique, est mi lobortis nulla, et sagittis enim nisl sed mauris.\n" +
                "\n" +
                "\tVestibulum bibendum turpis ut elit venenatis molestie. Quisque convallis libero in ultricies cursus. Suspendisse vulputate a magna sit amet gravida. Etiam vehicula arcu sed enim finibus, et mattis erat aliquam. Quisque eget lacus risus. Nullam ornare eu leo dapibus gravida. Fusce eget turpis eu libero varius vestibulum. Donec sollicitudin mi a dictum ornare.\n" +
                "\n" +
                "\tIn rhoncus massa sit amet mi tempus laoreet. Ut fermentum libero orci, commodo tristique metus fermentum non. Etiam aliquam porta nisi non malesuada. Etiam eu consequat ex. Donec dapibus lectus et lacinia pellentesque. Duis quis dolor vel nunc dapibus condimentum. Vivamus elit libero, laoreet porta tincidunt quis, porta sit amet justo. Aenean vitae mollis felis. Ut vehicula purus vel odio tincidunt venenatis. Donec ultricies, purus quis sollicitudin sagittis, turpis magna iaculis dui, vel laoreet lorem purus vel est. Vestibulum ut facilisis magna, ut scelerisque magna. Nunc dictum, nunc at viverra elementum, enim purus cursus erat, finibus sagittis sapien leo id lorem. Donec laoreet sodales nibh, ac blandit erat pulvinar vitae. Sed quis urna et leo mattis tincidunt.","Lysandra Gondim", "fotobolsavalores");
        Noticia c = new Noticia("Polícia Federal desarticula quadrilha que desviava recursos públicos","06/04/2023","\tSuspendisse porta commodo quam, at maximus mi sollicitudin sodales. Nam volutpat mauris bibendum turpis facilisis, eu pretium dolor condimentum. Quisque volutpat quam vitae sodales venenatis. Sed ex enim, venenatis in nulla nec, mollis tempor orci. Duis nisl lorem, condimentum non leo eu, luctus dignissim erat. Aliquam purus nulla, mattis non vehicula ac, auctor nec mi. Etiam id fringilla ipsum. Nunc venenatis augue in lectus fringilla porta. Nulla nec nisl laoreet, sodales dui auctor, facilisis lorem. Sed augue dui, consectetur tincidunt lorem eu, suscipit rhoncus risus. Vestibulum dignissim consectetur nunc, sit amet porta mi sodales id. Sed convallis, libero non ullamcorper congue, mauris leo consequat erat, ac viverra dolor lorem eget metus.\n" +
                "\n" +
                "\tVivamus dictum, leo ornare tempor rutrum, odio dolor varius nulla, nec malesuada orci quam quis nunc. Phasellus molestie velit sed sem rutrum consequat. Maecenas condimentum dapibus enim, sed tincidunt eros accumsan sed. Sed maximus ornare tellus et pretium. Praesent commodo vulputate tortor ut eleifend. Donec quis risus magna. Duis pulvinar dictum nunc et mollis. Quisque egestas metus et volutpat dignissim. Proin nec consequat arcu. Vivamus nec dignissim ipsum, et tempus metus. Donec eu blandit lacus, ac porta nisl.\n" +
                "\n" +
                "\tMauris quis diam et tellus sollicitudin semper ut eu ex. Curabitur laoreet vehicula tortor, a ultricies nibh congue at. Nunc mattis facilisis luctus. Praesent in risus lobortis, hendrerit ante non, aliquam nulla. Sed fermentum pellentesque nisl, quis iaculis metus auctor at. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nulla blandit, nisl quis eleifend fermentum, lectus libero laoreet sem, a malesuada erat augue venenatis lorem. Sed bibendum augue et leo gravida rutrum.\n" +
                "\n" +
                "\tFusce quis scelerisque diam, malesuada scelerisque ante. Nunc pulvinar tellus sem, vel ullamcorper ligula vestibulum vel. Mauris quis risus condimentum, venenatis metus in, tempus nisi. Sed gravida pharetra sodales. Nam aliquet, nulla et congue fermentum, elit odio suscipit neque, id congue dolor sem sit amet nulla. Nullam at mi felis. Vivamus ut blandit odio, eget lobortis diam. Etiam suscipit massa placerat tellus luctus semper. Morbi non tempus purus, sed blandit lacus. Nullam maximus porttitor finibus. Duis sit amet ipsum et enim ornare auctor.\n" +
                "\n" +
                "\tDonec arcu justo, auctor ut ex in, rutrum hendrerit ligula. Ut eu orci sit amet ipsum sollicitudin tempus vel quis erat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nunc ac gravida diam. In convallis bibendum quam. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus vitae tellus quis nisi aliquet viverra non id mi. Cras feugiat placerat ultrices. Fusce quis pretium augue, non egestas tortor. Aliquam erat volutpat. Donec semper gravida turpis et laoreet. Aenean nec leo ut enim vestibulum pretium non at odio. Duis ornare turpis sed bibendum fringilla. Nullam lacinia ullamcorper eros, a blandit ligula porta in. Proin sagittis nisi lacus, a sodales nunc scelerisque ac. Interdum et malesuada fames ac ante ipsum primis in faucibus.","Thales dos Anjos", "fotopolicia");

        noticias = new ArrayList<Noticia>();
        noticias.add(a);
        noticias.add(b);
        noticias.add(c);

        BtnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if(i > noticias.size() - 1){
                    i = 0;
                }
                Scrollado.scrollTo(0,0);
                Povoar(i);
            }
        });

        BtnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                if(i < 0) {
                    i = noticias.size() - 1;
                }
                Scrollado.scrollTo(0,0);
                Povoar(i);
            }
        });

        Povoar(i);
    }

    public void Povoar(Integer i){
        Manchete.setText(noticias.get(i).manchete);
        Data.setText(noticias.get(i).data);
        ConteudoNews.setText(noticias.get(i).conteudoNews);
        Autor.setText(noticias.get(i).autor);
        int idFoto = getResources().getIdentifier(noticias.get(i).imagem, "drawable", getPackageName());
        ImagemNews.setImageResource(idFoto);
    }

}