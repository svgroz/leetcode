package org.svgroz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.svgroz.algs.KnuthMorisPratt;

import java.util.List;

class AddTwoNumbersTest {

    FindTheIndexOfTheOccurrenceInAString instance;

    @BeforeEach
    public void setup() {
        instance = new FindTheIndexOfTheOccurrenceInAString();
    }

    public static List<Pair<String, String>>indexOfSource() {
        return List.of(
                new Pair<>("abcabd", "cab"),
                new Pair<>("aaaaaa", "aaa"),
                new Pair<>("sosos", "ab"),
                new Pair<>("ioooaoz", "mm"),
                new Pair<>("izmq0", "mQ"),
                new Pair<>("""                               
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam id consequat diam. Duis rhoncus erat augue, sed imperdiet nulla eleifend in. Mauris varius pulvinar rhoncus. Sed posuere id orci ac laoreet. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. In viverra tellus elit, in porta ante imperdiet id. Duis lectus tellus, eleifend non orci eu, sagittis cursus erat. Suspendisse potenti.
                        Donec elit leo, tempor nec sollicitudin et, aliquet id diam. Sed a porta sem. Proin lobortis ipsum nec diam ornare dictum. Praesent quis tincidunt felis. Mauris semper vehicula enim eu eleifend. Vivamus erat nulla, tincidunt id metus commodo, facilisis porttitor magna. Proin viverra urna id viverra posuere. Donec in nisi vitae leo lobortis posuere. Mauris nisi dui, sagittis eu lacus at, convallis accumsan ex. Integer elementum turpis vitae justo pretium volutpat. Ut convallis placerat blandit. Mauris egestas rutrum venenatis. Cras mollis dui ut neque lacinia ornare.
                        Nam purus lorem, ullamcorper ac ultricies eu, convallis a erat. Donec sit amet sapien eu mi aliquet bibendum posuere vel eros. Fusce tempor ultrices venenatis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed interdum pulvinar interdum. Vestibulum a bibendum ante. Vestibulum sagittis tempus nisi, ut accumsan risus bibendum non.
                        Maecenas vel purus finibus, molestie purus a, malesuada orci. Integer placerat sollicitudin lacus, in mattis metus sodales quis. In pretium pretium odio sit amet porta. Nam vehicula justo sed dolor pulvinar dapibus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam nisl nisi, venenatis ac faucibus eu, eleifend eu odio. Curabitur interdum dignissim augue, ultrices vestibulum justo ornare vestibulum. Proin sit amet blandit diam. Ut a turpis non nulla sollicitudin semper. Nunc ut semper urna. Donec sollicitudin mi quis semper tristique.                     
                        Integer eleifend pellentesque erat, in iaculis risus rhoncus ac. Phasellus molestie ac sapien at maximus. Donec tempus, justo id scelerisque maximus, ligula tortor eleifend ante, ac maximus diam metus id libero. Duis vehicula auctor lorem, sit amet porttitor metus. Curabitur eros sapien, suscipit sit amet scelerisque quis, volutpat a felis. Vestibulum ullamcorper tortor quam. In eros turpis, sollicitudin et tellus in, tempor mollis justo. Donec volutpat ante at posuere accumsan. Proin placerat eget arcu eget accumsan. Praesent elit eros, egestas et enim et, porta auctor ipsum. Nullam ligula enim, rhoncus et ante vel, rhoncus placerat mauris. Fusce felis nibh, placerat quis nisl id, tincidunt lobortis diam. Donec vehicula arcu sed neque convallis, a dictum mauris aliquam. Sed faucibus eros ac massa porta, a placerat tellus tincidunt. Morbi aliquet euismod felis, ut molestie odio aliquam id.
                        """, "Donec sit"),
                new Pair<>("""                               
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam id consequat diam. Duis rhoncus erat augue, sed imperdiet nulla eleifend in. Mauris varius pulvinar rhoncus. Sed posuere id orci ac laoreet. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. In viverra tellus elit, in porta ante imperdiet id. Duis lectus tellus, eleifend non orci eu, sagittis cursus erat. Suspendisse potenti.
                        Donec elit leo, tempor nec sollicitudin et, aliquet id diam. Sed a porta sem. Proin lobortis ipsum nec diam ornare dictum. Praesent quis tincidunt felis. Mauris semper vehicula enim eu eleifend. Vivamus erat nulla, tincidunt id metus commodo, facilisis porttitor magna. Proin viverra urna id viverra posuere. Donec in nisi vitae leo lobortis posuere. Mauris nisi dui, sagittis eu lacus at, convallis accumsan ex. Integer elementum turpis vitae justo pretium volutpat. Ut convallis placerat blandit. Mauris egestas rutrum venenatis. Cras mollis dui ut neque lacinia ornare.
                        Nam purus lorem, ullamcorper ac ultricies eu, convallis a erat. Donec sit amet sapien eu mi aliquet bibendum posuere vel eros. Fusce tempor ultrices venenatis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed interdum pulvinar interdum. Vestibulum a bibendum ante. Vestibulum sagittis tempus nisi, ut accumsan risus bibendum non.
                        Maecenas vel purus finibus, molestie purus a, malesuada orci. Integer placerat sollicitudin lacus, in mattis metus sodales quis. In pretium pretium odio sit amet porta. Nam vehicula justo sed dolor pulvinar dapibus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam nisl nisi, venenatis ac faucibus eu, eleifend eu odio. Curabitur interdum dignissim augue, ultrices vestibulum justo ornare vestibulum. Proin sit amet blandit diam. Ut a turpis non nulla sollicitudin semper. Nunc ut semper urna. Donec sollicitudin mi quis semper tristique.                     
                        Integer eleifend pellentesque erat, in iaculis risus rhoncus ac. Phasellus molestie ac sapien at maximus. Donec tempus, justo id scelerisque maximus, ligula tortor eleifend ante, ac maximus diam metus id libero. Duis vehicula auctor lorem, sit amet porttitor metus. Curabitur eros sapien, suscipit sit amet scelerisque quis, volutpat a felis. Vestibulum ullamcorper tortor quam. In eros turpis, sollicitudin et tellus in, tempor mollis justo. Donec volutpat ante at posuere accumsan. Proin placerat eget arcu eget accumsan. Praesent elit eros, egestas et enim et, porta auctor ipsum. Nullam ligula enim, rhoncus et ante vel, rhoncus placerat mauris. Fusce felis nibh, placerat quis nisl id, tincidunt lobortis diam. Donec vehicula arcu sed neque convallis, a dictum mauris aliquam. Sed faucibus eros ac massa porta, a placerat tellus tincidunt. Morbi aliquet euismod felis, ut molestie odio aliquam id.
                        """, "John Dow")
        );
    }


    @ParameterizedTest
    @MethodSource("indexOfSource")
    void indexOf(Pair<String, String> source) {
        Assertions.assertEquals(
                source.left().indexOf(source.right()),
                instance.strStr(source.left(), source.right())
        );
    }
}
