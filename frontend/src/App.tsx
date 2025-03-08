import React from "react"  ;
import './App.css';
import '@mantine/core/styles.css';
import {Button, createTheme, MantineProvider} from '@mantine/core';
import AppRoutes from "./Routes/AppRoutes.tsx";


// bu fonksiyon bir tema oluşturmak için kullanılır.
const theme = createTheme({
  focusRing:"never",     // klavye veya fare ile bir öğeye odaklandığında görünen parlak çerçevenin kapatılması.
  fontFamily:"Poppins, sans-serif",       // kullanılacak fontları belirler.
  headings: {fontFamily:"Merriweather, serif"}, 
  colors:{    // özel olarak kullanacağımız renkleri tanımlarız.
    primary: ['#f1fcfa','#cff8ef','#9ff0e1','#67e1cf','#32b9a9','#1fad9f','#168b82','#166f69','#165955','#174a47','#072c2b'],
    natural: ['#f6f6f6','#e7e7e7','#d1d1d1','#b0b0b0','#888888','#6d6d6d','#5d5d5d','#4f4f4f','#454545','#3d3d3d','#000000']
  },
  primaryColor:"primary",     // varsayılan ana rengi "primary" olarak belirler. Yani tema için öncelikli olarak primary renk paletinden bir renk seçilir.
  primaryShade:4,             // Varsayılan olarak primary renk paletinin 4. indeksindeki (#32b9a9) rengi kullanır.
  defaultGradient:{           // Gradient (renk geçiş) efektinin varsayılan ayarlarını belirler.
    from:"primary.4",         // Geçişin başlangıç rengi olarak primary[4] kullanılır
    to:"primary.8",           // Geçişin bitiş rengi olarak primary[8] kullanılır 
    deg:132                   // Geçişin açısı 132 derece olarak belirlenmiştir.
  }
});

function App(){
  return(
    <MantineProvider theme={theme}>
      <div>
        <AppRoutes />
      </div>
    </MantineProvider>
  );
}

export default App;

