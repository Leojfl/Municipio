package com.example.myapplication.database.entitys;

import android.content.ContentValues;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    String ID;
    String IGECEM;
    String NOMBRE;
    String CABECERA;
    String SUPERFICIE;
    String ALTITUD;
    String CLIMA;
    String LATITUD;
    String LONGITUD;
    String SIGNIFICADO;
    String table;
    public static String table1 = "MUNICIPIO";
    List<Riesgo> riesgos=new ArrayList<>();


public static String insertLoco[]= {"INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	1	,"+"\"	Acambay	\","+"\"	Acambay	\","+"\"	465.7	\","+"\"	465.7	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Okha «Dios» y mbaye «peñasco»: «Peñascos de Dios».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	2	,"+"\"	Acolman	\","+"\"	Acolman de Nezahualcóyotl	\","+"\"	83,95	\","+"\"	83,95	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Aculli «hombre», máitl «mano»: «Hombre con mano o brazo».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	3	,"+"\"	Aculco	\","+"\"	Aculco de Espinosa	\","+"\"	453,26	\","+"\"	453,26	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Atl «agua», cóltic «torcido» y co «en»: «En el agua torcida».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	4	,"+"\"	Almoloya de Alquisiras	\","+"\"	Almoloya de Alquisiras	\","+"\"	182,65	\","+"\"	182,65	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Atl «agua», molloni «manar» y yan «lugar»: «Lugar donde mana el agua». Nombrado en honor al insurgente Pedro Ascencio Alquisiras.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	5	,"+"\"	Almoloya de Juárez	\","+"\"	Villa de Almoloya de Juárez	\","+"\"	485,21	\","+"\"	485,21	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Atl «agua», molloni «manar» y yan «lugar»: «Lugar donde mana el agua». Nombrado en honor al presidente Benito Juárez.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	6	,"+"\"	Almoloya del Río	\","+"\"	Almoloya del Río	\","+"\"	16,53	\","+"\"	16,53	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Atl «agua», molloni «manar» y yan «lugar»: «Lugar donde mana el agua».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	7	,"+"\"	Amanalco	\","+"\"	Amanalco de Becerra	\","+"\"	222,27	\","+"\"	222,27	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Atl «agua», manalli «estar tendido» y co «en»: «En el estanque».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	8	,"+"\"	Amatepec	\","+"\"	Amatepec	\","+"\"	638,55	\","+"\"	638,55	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Amatl «amate o árbol de papel», tepetl «cerro» y co «en»: «En el cerro de los amates o árboles de papel».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	9	,"+"\"	Amecameca	\","+"\"	Amecameca de Juárez	\","+"\"	189,48	\","+"\"	189,48	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Amatl «papel», queme «señalar» y can «lugar»: «Lugar donde los papeles señalan».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	10	,"+"\"	Apaxco	\","+"\"	Apaxco de Ocampo	\","+"\"	75,73	\","+"\"	75,73	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Atl «agua» y patzca «exprimir»: «Donde se exprime o escurre el agua».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	11	,"+"\"	Atenco	\","+"\"	San Salvador Atenco	\","+"\"	83,80	\","+"\"	83,80	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Atl «agua», entli «orilla» y co «en»: «En la orilla del agua».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	12	,"+"\"	Atizapán	\","+"\"	Santa Cruz Atizapán	\","+"\"	6,92	\","+"\"	6,92	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Atl «agua», tizatl «tierra o cosa blanca» y pan «sobre»: «En el agua o tierra blanca».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	13	,"+"\"	Atizapán de Zaragoza	\","+"\"	Ciudad López Mateos	\","+"\"	91,07	\","+"\"	91,07	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Atl «agua», tizatl «tierra o cosa blanca» y pan «sobre»: «En el agua o tierra blanca». Nombrado en honor al general Ignacio Zaragoza.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	14	,"+"\"	Atlacomulco	\","+"\"	Atlacomulco de Fabela	\","+"\"	267,89	\","+"\"	267,89	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Atlacomulli «pozo» y co «en»: «En los pozos».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	15	,"+"\"	Atlautla	\","+"\"	Atlautla de Victoria	\","+"\"	162,06	\","+"\"	162,06	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Atlautli «barranca», tla «abundancia»: «Donde abundan las barrancas».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	16	,"+"\"	Axapusco	\","+"\"	Axapusco	\","+"\"	230,94	\","+"\"	230,94	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Atl «agua», xapochtli «aljibe»: «En el aljibe de agua».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	17	,"+"\"	Ayapango	\","+"\"	Ayapango de Gabriel Ramos Millán	\","+"\"	36,41	\","+"\"	36,41	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Ayáhuitl «neblina», pan «sobre» y co «lugar»: «Lugar de neblinas en las alturas».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	18	,"+"\"	Calimaya	\","+"\"	Calimaya de Díaz González	\","+"\"	101,19	\","+"\"	101,19	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Calli «casa», máitl «mano» y yan «lugar»: «Lugar en que se construyen casas».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	19	,"+"\"	Capulhuac	\","+"\"	Capulhuac de Mirafuentes	\","+"\"	32,25	\","+"\"	32,25	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Capulli «capulín» y apan «canal»: «En el canal de capulines».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	20	,"+"\"	Coacalco de Berriozábal	\","+"\"	San Francisco Coacalco	\","+"\"	35,10	\","+"\"	35,10	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Coatl «serpiente», calli «casa» y co «lugar»: «En la casa de la serpiente». Nombrado en honor al gobernador Felipe Berriozábal.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	21	,"+"\"	Coatepec Harinas	\","+"\"	Coatepec Harinas	\","+"\"	282,36	\","+"\"	282,36	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Coatl «serpiente» y tepetl «cerro»: «Cerro de las serpientes». Se le denominó «Harinas» por la producción de este producto en el municipio.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	22	,"+"\"	Cocotitlán	\","+"\"	Cocotitlán	\","+"\"	14,86	\","+"\"	14,86	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Cocoh «tórtola», titlán «junto o entre»: «Lugar de tórtolas».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	23	,"+"\"	Coyotepec	\","+"\"	Coyotepec	\","+"\"	49,32	\","+"\"	49,32	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Coyotl «coyote», tepetl «cerro» y co «en»: «En el cerro del coyote».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	24	,"+"\"	Cuautitlán	\","+"\"	Cuautitlán	\","+"\"	26,32	\","+"\"	26,32	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Cuáhutli «árbol» y titlán «junto o entre»: «Entre los árboles».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	25	,"+"\"	Chalco	\","+"\"	Chalco de Díaz Covarrubias	\","+"\"	219,22	\","+"\"	219,22	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Challi «borde de lago» y co «en»: «En el borde del lago»	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	26	,"+"\"	Chapa de Mota	\","+"\"	Chapa de Mota	\","+"\"	292,32	\","+"\"	292,32	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Chía «semilla de chía», atl «agua» y pan «lugar»: «En el río de la chía». Nombrado en honor al conquistador Jerónimo Ruiz de la Mota.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	27	,"+"\"	Chapultepec	\","+"\"	Chapultepec	\","+"\"	12,62	\","+"\"	12,62	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Chapulli «chapulín», tepetl «cerro» y co «en»: «En el cerro del chapulín».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	28	,"+"\"	Chiautla	\","+"\"	Chiautla	\","+"\"	20,70	\","+"\"	20,70	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Chiauac «grasa» y tla «abundancia»: «Abundancia de piedras grasosas».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	29	,"+"\"	Chicoloapan	\","+"\"	Chicoloapan de Juárez	\","+"\"	53,91	\","+"\"	53,91	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Chicoltic «Casa torcida», atl «agua» y pan «lugar»: «Lugar donde se tuerce el agua».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	30	,"+"\"	Chiconcuac	\","+"\"	Chiconcuac de Juárez	\","+"\"	6,82	\","+"\"	6,82	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Chicome «siete», coatl «serpiente» y co «en»: «En siete Serpientes»	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	31	,"+"\"	Chimalhuacán	\","+"\"	Chimalhuacán	\","+"\"	44,69	\","+"\"	44,69	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Chimalli «escudo o rodela», hua «poseer» y can «lugar»: «Lugar de escudo o rodela»	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	32	,"+"\"	Donato Guerra	\","+"\"	Villa de Donato Guerra	\","+"\"	192,03	\","+"\"	192,03	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor al militar Donato Guerra.nota 3​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	33	,"+"\"	Ecatepec de Morelos	\","+"\"	Ecatepec de Morelos	\","+"\"	160,17	\","+"\"	160,17	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Ecatl «viento, aire», tepetl «cerro» y co «en»: «En el cerro del viento o del aire». Nombrado en honor al insurgente José María Morelos.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	34	,"+"\"	Ecatzingo	\","+"\"	Ecatzingo de Hidalgo	\","+"\"	50,77	\","+"\"	50,77	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Ecatl «viento, aire», tzintli «pequeño» y go «lugar»: «Lugar consagrado al viento».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	35	,"+"\"	Huehuetoca	\","+"\"	Huehuetoca	\","+"\"	118,02	\","+"\"	118,02	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Huehue «viejo» y toca «habla, lengua»: «Lugar de la lengua antigua».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	36	,"+"\"	Hueypoxtla	\","+"\"	Hueypoxtla	\","+"\"	233,91	\","+"\"	233,91	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Huei «grande», pochtecatl «comerciante» y tlan «abundancia»: «Lugar de grandes mercaderes».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	37	,"+"\"	Huixquilucan	\","+"\"	Huixquilucan de Degollado	\","+"\"	140,67	\","+"\"	140,67	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Huitzquilitl «cardo comestible», can «lugar»: «Lugar lleno de cardos comestibles».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	38	,"+"\"	Isidro Fabela	\","+"\"	Tlazala de Fabela	\","+"\"	75,79	\","+"\"	75,79	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor al político y escritor Isidro Fabela.nota 4​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	39	,"+"\"	Ixtapaluca	\","+"\"	Ixtapaluca	\","+"\"	327,40	\","+"\"	327,40	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Iztatl «sal», pallutl «mojadura» y can «lugar»: «Lugar donde se moja la sal».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	40	,"+"\"	Ixtapan de la Sal	\","+"\"	Ixtapan de la Sal	\","+"\"	110,75	\","+"\"	110,75	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Iztatl «sal» y pan «sobre»: «Sobre la sal».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	41	,"+"\"	Ixtapan del Oro	\","+"\"	Ixtapan del Oro	\","+"\"	101,35	\","+"\"	101,35	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Iztatl «sal» y pan «sobre»: «Sobre la sal». El término «Oro» alude a sus vetas de oro.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	42	,"+"\"	Ixtlahuaca	\","+"\"	Ixtlahuaca de Rayón	\","+"\"	335,85	\","+"\"	335,85	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Ixtlahuacan: «Llanura, tierra despoblada de árboles».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	43	,"+"\"	Xalatlaco	\","+"\"	Xalatlaco	\","+"\"	116,47	\","+"\"	116,47	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Xalli «arena», Atlauhtli «barranca» y co «en»: «En la barranca de arena».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	44	,"+"\"	Jaltenco	\","+"\"	Jaltenco	\","+"\"	4,73	\","+"\"	4,73	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Xalli «arena», tentli «labio, orilla» y co «en»: «En la orilla de la arena».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	45	,"+"\"	Jilotepec	\","+"\"	Jilotepec de Molina Enríquez	\","+"\"	583,95	\","+"\"	583,95	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Xilotl «jilote», tepetl «cerro» y co «en»: «En el cerro de los jilotes».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	46	,"+"\"	Jilotzingo	\","+"\"	Santa Ana Jilotzingo	\","+"\"	119,70	\","+"\"	119,70	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Xilonen —diosa del maíz—, xin «venerar» y co «en»: «Donde se venera a Xilonen».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	47	,"+"\"	Jiquipilco	\","+"\"	Jiquipilco	\","+"\"	272,56	\","+"\"	272,56	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Xiquipilli «costal, alforja» y co «en»: «Lugar de costales o alforjas».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	48	,"+"\"	Jocotitlán	\","+"\"	Jocotitlán	\","+"\"	277,26	\","+"\"	277,26	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Xocotl «fruta agridulce», titlan «entre»: «Entre árboles de fruta ágridulce».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	49	,"+"\"	Joquicingo	\","+"\"	Joquicingo	\","+"\"	63,66	\","+"\"	63,66	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Zoquitl «lodo, barro», tzintli «pequeño» y co «en»: «En el barrialito».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	50	,"+"\"	Juchitepec	\","+"\"	Juchitepec de Mariano Rivapalacio	\","+"\"	140,11	\","+"\"	140,11	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Xóchitl «flor» y tepetl «cerro»: «Cerro de las flores».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	51	,"+"\"	Lerma	\","+"\"	Lerma de Villada	\","+"\"	212,83	\","+"\"	212,83	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor al Duque de Lerma.nota 5​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	52	,"+"\"	Malinalco	\","+"\"	Malinalco	\","+"\"	204,95	\","+"\"	204,95	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Mallinalli —una planta gramínea—, xóchitl «flor» y co «en»: «En donde se venera a Malinalxóchitl, la flor del malinalli».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	53	,"+"\"	Melchor Ocampo	\","+"\"	Melchor Ocampo	\","+"\"	17,78	\","+"\"	17,78	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor al político Melchor Ocampo.nota 6​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	54	,"+"\"	Metepec	\","+"\"	Metepec	\","+"\"	67,52	\","+"\"	67,52	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Metl «maguey», tepetl «cerro» y co «en»: «En el cerro de los magueyes».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	55	,"+"\"	Mexicaltzingo	\","+"\"	San Mateo Mexicaltzingo	\","+"\"	11,47	\","+"\"	11,47	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Mexicatl «mexicano», tzintli «reverencia» y co «en»: «En donde habitan los mexicanos distinguidos».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	56	,"+"\"	Morelos	\","+"\"	San Bartolo Morelos	\","+"\"	236,32	\","+"\"	236,32	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor al héroe de la independencia José María Morelos.nota 7​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	57	,"+"\"	Naucalpan de Juárez	\","+"\"	Naucalpan de Juárez	\","+"\"	156,63	\","+"\"	156,63	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Nahui «cuatro», calli «casa» y pan «en»: «En las cuatro casas». Nombrado así en honor al presidente Benito Juárez.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	58	,"+"\"	Nezahualcóyotl	\","+"\"	Nezahualcóyotl	\","+"\"	63,74	\","+"\"	63,74	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Nezahualo «ayunar» y coyotl «coyote»: «Coyote que ayuna». Nombrado así en honor al rey y poeta Nezahualcóyotl.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	59	,"+"\"	Nextlalpan	\","+"\"	Santa Ana Nextlalpan	\","+"\"	54,51	\","+"\"	54,51	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Nextli «ceniza», tlalli «tierra, suelo» y pan «sobre»: «Sobre el suelo de ceniza».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	60	,"+"\"	Nicolás Romero	\","+"\"	Villa Nicolás Romero	\","+"\"	235,65	\","+"\"	235,65	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor al militar Nicolás Romero.nota 8​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	61	,"+"\"	Nopaltepec	\","+"\"	Nopaltepec	\","+"\"	83,70	\","+"\"	83,70	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Nopalli «nopal», tepetl «cerro» y co «en»: «En el cerro de los nopales».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	62	,"+"\"	Ocoyoacac	\","+"\"	Ocoyoacac	\","+"\"	134,72	\","+"\"	134,72	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Ocotl «ocote, pino», yácatl «nariz, principio» y co «en»: «Donde principian los ocotes o pinos».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	63	,"+"\"	Ocuilan	\","+"\"	Ocuilan de Arteaga	\","+"\"	314,53	\","+"\"	314,53	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Oculi «gusano», tla «abundancia»: «Donde abundan los gusanos».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	64	,"+"\"	El Oro	\","+"\"	El Oro de Hidalgo	\","+"\"	137,47	\","+"\"	137,47	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Su nombre hace referencia a los yacimientos de oro en la región.nota 9​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	65	,"+"\"	Otumba	\","+"\"	Otumba de Gómez Farías	\","+"\"	195,56	\","+"\"	195,56	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Otomitl «Jefe de Otomíes» y pan «en, sobre»: «Lugar de otomíes».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	66	,"+"\"	Otzoloapan	\","+"\"	Otzoloapan	\","+"\"	157,43	\","+"\"	157,43	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Ocelotl «jaguar» y apan «río»: «Río de los jaguares».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	67	,"+"\"	Otzolotepec	\","+"\"	Villa Cuauhtémoc	\","+"\"	116,67	\","+"\"	116,67	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Ocelotl «jaguar», tepetl «cerro» y co «en»: «En el cerro del jaguar».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	68	,"+"\"	Ozumba	\","+"\"	Ozumba de Alzate	\","+"\"	45,64	\","+"\"	45,64	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Atl «agua», tzontli «cabello» y pan «sobre»: «Sobre los cabellos del agua».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	69	,"+"\"	Papalotla	\","+"\"	Papalotla	\","+"\"	3,19	\","+"\"	3,19	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Papalotl «mariposa», tla «abundancia, lugar»: «Lugar de mariposas».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	70	,"+"\"	La Paz	\","+"\"	Los Reyes Acaquilpan	\","+"\"	36,36	\","+"\"	36,36	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Recibe este nombre dado que en la época prehispánica, los jefes militares se reunían aquí para firmar los acuerdos de paz.nota 10​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	71	,"+"\"	Polotitlán	\","+"\"	Polotitlán de la Ilustración	\","+"\"	127,49	\","+"\"	127,49	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Polo —apellido español—, titlán «entre, lugar»: «Lugar de los Polo».nota 11​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	72	,"+"\"	Rayón	\","+"\"	Santa María Rayón	\","+"\"	23,40	\","+"\"	23,40	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor al insurgente Ignacio López Rayón.nota 12​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	73	,"+"\"	San Antonio la Isla	\","+"\"	San Antonio la Isla	\","+"\"	18,50	\","+"\"	18,50	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor a San Antonio de Padua.nota 13​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	74	,"+"\"	San Felipe del Progreso	\","+"\"	San Felipe del Progreso	\","+"\"	368,15	\","+"\"	368,15	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor a San Felipe Apóstol. Se le denominó «del Progreso» después de que el pueblo alcanzó la categoría de villa.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	75	,"+"\"	San Martín de las Pirámides	\","+"\"	San Martín de las Pirámides	\","+"\"	67,22	\","+"\"	67,22	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor a San Martín de Tours. «De las Pirámides» hace referencia a la zona arqueológica que se ubica en su territorio.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	76	,"+"\"	San Mateo Atenco	\","+"\"	San Mateo Atenco	\","+"\"	27,38	\","+"\"	27,38	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor a San Mateo Apóstol. Atenco viene de Atl «agua», entli«orilla» y co «en»: «En la orilla del agua».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	77	,"+"\"	San Simón de Guerrero	\","+"\"	San Simón de Guerrero	\","+"\"	129,23	\","+"\"	129,23	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor a San Simón Apóstol y al presidente Vicente Guerrero.nota 14​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	78	,"+"\"	Santo Tomás	\","+"\"	Santo Tomás de los Plátanos	\","+"\"	104,25	\","+"\"	104,25	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor a Tomás el Apóstol.nota 15​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	79	,"+"\"	Soyaniquilpan de Juárez	\","+"\"	San Francisco Soyaniquilpan	\","+"\"	128,80	\","+"\"	128,80	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Tzatzayani «se rompe o hiende», quilit «hierba», atl «agua», pan «en»: «Lugar de agua donde la hierba se rompe o hiende». Nombrado en honor al presidente Benito Juárez.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	80	,"+"\"	Sultepec	\","+"\"	Sultepec de Pedro Ascencio de Alquisiras	\","+"\"	564,04	\","+"\"	564,04	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Zulli «codorniz», tepetl «cerro» y co «en»: «En el cerro de las codornices».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	81	,"+"\"	Tecámac	\","+"\"	Tecámac de Felipe Villanueva	\","+"\"	157,34	\","+"\"	157,34	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Tetl «piedra», camatl «boca» y co «en»: «En la boca de piedra».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	82	,"+"\"	Tejupilco	\","+"\"	Tejupilco de Hidalgo	\","+"\"	669,13	\","+"\"	669,13	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Texopill «dedos de los pies», co «en»: «En los dedos de los pies».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	83	,"+"\"	Temamatla	\","+"\"	Temamatla	\","+"\"	28,75	\","+"\"	28,75	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Tetl «piedra», mamatlall «escalera» y tla «abundancia»: «Escalera de piedra».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	84	,"+"\"	Temascalapa	\","+"\"	Temascalapa	\","+"\"	163,80	\","+"\"	163,80	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Temazcalli «baño de vapor», atl «agua» y pan «en»: «En los baños de vapor».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	85	,"+"\"	Temascalcingo	\","+"\"	Temascalcingo de José María Velasco	\","+"\"	362,39	\","+"\"	362,39	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Temazcalli «baño de vapor», tzintli «pequeño», co «en»: «En el pequeño baño de vapor».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	86	,"+"\"	Temascaltepec	\","+"\"	Temascaltepec de González	\","+"\"	544,59	\","+"\"	544,59	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Temazcalli «baño de vapor», tepetl «cerro» y co «en»: «En el cerro de los baños de vapor».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	87	,"+"\"	Temoaya	\","+"\"	Temoaya	\","+"\"	190,34	\","+"\"	190,34	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Temoa «bajar, descender» y yan «lugar»: «Lugar donde se desciende».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	88	,"+"\"	Tenancingo	\","+"\"	Tenancingo de Degollado	\","+"\"	163,15	\","+"\"	163,15	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Tenamitl «muralla», tzintli «pequeño», co «en»: «Lugar de la pequeña muralla»	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	89	,"+"\"	Tenango del Aire	\","+"\"	Tenango del Aire	\","+"\"	37,77	\","+"\"	37,77	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Tenamitl «muralla» y co «en»: «Lugar amurallado». «Del Aire» hace referencia a los fuertes vientos existentes en la estación seca.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	90	,"+"\"	Tenango del Valle	\","+"\"	Tenango de Arista	\","+"\"	207,54	\","+"\"	207,54	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Teotl «Dios», tenamitl «muralla» y co «en»: «En la muralla sagrada». «Del Valle» indica su ubicación en el Valle de Toluca.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	91	,"+"\"	Teoloyucan	\","+"\"	Teoloyucan	\","+"\"	53,04	\","+"\"	53,04	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Tehuilotl «vidrio, cristal de roca», yotl «plenitud» y can «lugar»: «Lugar lleno de vidrio o cristal de roca».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	92	,"+"\"	Teotihuacán	\","+"\"	Teotihuacán de Arista	\","+"\"	83,16	\","+"\"	83,16	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Teotl «Dios», hua «posesivo» y can «lugar»: «Lugar que tiene a nuestros dioses».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	93	,"+"\"	Tepetlaoxtoc	\","+"\"	Tepetlaoxtoc de Hidalgo	\","+"\"	178,37	\","+"\"	178,37	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Tepetl «tepetate», ozto «cueva» y co «en»: «En las cuevas de tepetate».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	94	,"+"\"	Tepetlixpa	\","+"\"	Tepetlixpa	\","+"\"	42,98	\","+"\"	42,98	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Tepetl «cerro» e ixpan «en la cara o superficie»: «En la cara o superficie del cerro».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	95	,"+"\"	Tepotzotlán	\","+"\"	Tepotzotlán	\","+"\"	187,82	\","+"\"	187,82	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Tepotzotli «joroba» y tlan «entre»: «Entre jorobados».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	96	,"+"\"	Tequixquiac	\","+"\"	Santiago Tequixquiac	\","+"\"	122,32	\","+"\"	122,32	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Tequixquitl «tequesquite», atl «agua» y co «en»: «En el agua tequesquitosa».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	97	,"+"\"	Texcaltitlán	\","+"\"	Texcaltitlán	\","+"\"	150,66	\","+"\"	150,66	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Texcalli «roca» y titlán «entre»: «Entre las rocas».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	98	,"+"\"	Texcalyacac	\","+"\"	San Mateo Texcalyacac	\","+"\"	24,78	\","+"\"	24,78	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Texcalli «pedregal», yacátl «nariz, punta» y con «en»: «En la punta del pedregal».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	99	,"+"\"	Texcoco	\","+"\"	Texcoco de Mora	\","+"\"	432,61	\","+"\"	432,61	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Texcalli «peñasco, risco», tlacolt «jarilla» y co «en»: «En la jarilla del risco».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	100	,"+"\"	Tezoyuca	\","+"\"	Tezoyuca	\","+"\"	17,46	\","+"\"	17,46	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Tezontli «tezontle», yotl «plenitud» y can «lugar»: «Lugar lleno de tezontle».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	101	,"+"\"	Tianguistenco	\","+"\"	Santiago Tianguistenco de Galeana	\","+"\"	167,97	\","+"\"	167,97	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Tianquistli «mercado», tentli «labio, orilla» y co «en»: «En la orilla del mercado».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	102	,"+"\"	Timilpan	\","+"\"	San Andrés Timilpan	\","+"\"	172,81	\","+"\"	172,81	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Tetl «piedra», milli «sementera» y pan «sobre, en»: «En la sementera de piedra».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	103	,"+"\"	Tlalmanalco	\","+"\"	Tlalmanalco de Velázquez	\","+"\"	161,57	\","+"\"	161,57	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Tlalli «tierra», manalli «aplanada» y co «lugar»: «Lugar de tierra aplanada».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	104	,"+"\"	Tlalnepantla de Baz	\","+"\"	Tlalnepantla	\","+"\"	77,17	\","+"\"	77,17	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Tlalli «tierra», nepantla «en medio»: «En medio de la tierra». Nombrado en honor al gobernador y médico Gustavo Baz Prada.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	105	,"+"\"	Tlatlaya	\","+"\"	Tlatlaya	\","+"\"	791,49	\","+"\"	791,49	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Tlatla «arder», yan «lugar»: «Tierra que arde».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	106	,"+"\"	Toluca	\","+"\"	Toluca de Lerdo	\","+"\"	452,371	\","+"\"	452,371	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Toloqui «inclinar la cabeza», co «en»: «En donde está el dios Tolo».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	107	,"+"\"	Tonatico	\","+"\"	Tonatico	\","+"\"	91,98	\","+"\"	91,98	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Tonatiuh «sol», co «lugar»: «Lugar de sol».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	108	,"+"\"	Tultepec	\","+"\"	Tultepec	\","+"\"	27,22	\","+"\"	27,22	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Tollin «tule», tepetl «cerro» y co «en»: «En el cerro del tule».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	109	,"+"\"	Tultitlán	\","+"\"	Tultitlán de Mariano Escobedo	\","+"\"	69,15	\","+"\"	69,15	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Tollin «tule», titlán «entre»: «Lugar entre tules».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	110	,"+"\"	Valle de Bravo	\","+"\"	Valle de Bravo	\","+"\"	430,80	\","+"\"	430,80	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor al presidente Nicolás Bravo.nota 16​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	111	,"+"\"	Villa de Allende	\","+"\"	San José Villa de Allende	\","+"\"	309,28	\","+"\"	309,28	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor al héroe de la independencia Ignacio Allende.nota 17​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	112	,"+"\"	Villa del Carbón	\","+"\"	Villa del Carbón	\","+"\"	306,56	\","+"\"	306,56	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Nombrado así en referencia a la producción de carbón en la cabecera municipal.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	113	,"+"\"	Villa Guerrero	\","+"\"	Villa Guerrero	\","+"\"	209,96	\","+"\"	209,96	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor al insurgente y presidente Vicente Guerrero.nota 18​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	114	,"+"\"	Villa Victoria	\","+"\"	Villa Victoria	\","+"\"	419,35	\","+"\"	419,35	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor al primer presidente del país, Guadalupe Victoria.nota 19​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	115	,"+"\"	Xonacatlán	\","+"\"	Xonacatlán	\","+"\"	65,85	\","+"\"	65,85	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Xonacatl «cebolla», tlan «entre»: «Entre las cebollas».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	116	,"+"\"	Zacazonapan	\","+"\"	Zacazonapan	\","+"\"	66,67	\","+"\"	66,67	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Zacatzontetl «césped», atl «agua» y pan «sobre»: «Sobre agua de céspedes».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	117	,"+"\"	Zacualpan	\","+"\"	Real de Minas Zacualpan	\","+"\"	301.47	\","+"\"	301.47	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Tzacualli «pirámide» y pan «sobre»: «Sobre la pirámide».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	118	,"+"\"	Zinacantepec	\","+"\"	San Miguel Zinacantepec	\","+"\"	308,62	\","+"\"	308,62	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Tzanacan «murciélago», tepetl «cerro» y co «en»: «En el cerro de los murciélagos».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	119	,"+"\"	Zumpahuacán	\","+"\"	Zumpahuacán	\","+"\"	201,18	\","+"\"	201,18	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Tzompantli «zompantli», hua «poseer» y can «lugar»: «Lugar para guardar los cráneos de los sacrificados».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	120	,"+"\"	Zumpango	\","+"\"	Zumpango de Ocampo	\","+"\"	223,95	\","+"\"	223,95	 \","+"\"	semiárido	\","+"	0	,"+"	0	,"+"\"	Tzompantli «zompantli», co «lugar»: «Lugar del zompantli».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	121	,"+"\"	Cuautitlán Izcalli	\","+"\"	Cuautitlán Izcalli	\","+"\"	109,54	\","+"\"	109,54	 \","+"\"	seco	\","+"	0	,"+"	0	,"+"\"	Cuáhutli «árbol» y titlán «junto o entre»; iz «tu, tuyo» y calli «casa»: «Tu casa entre los árboles».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	122	,"+"\"	Valle de Chalco Solidaridad	\","+"\"	Xico	\","+"\"	46,53	\","+"\"	46,53	 \","+"\"	templado	\","+"	0	,"+"	0	,"+"\"	Su nombre se refiere a su ubicación en el valle del antiguo lago de Chalco, y que el poblamiento de la zona se inició gracias al programa «Solidaridad».	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	123	,"+"\"	Luvianos	\","+"\"	Villa Luvianos	\","+"\"	703,00	\","+"\"	703,00	 \","+"\"	semifrio	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor al fundador de Villa Luvianos, Cristóbal Lubiano.nota 20​	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	124	,"+"\"	San José del Rincón	\","+"\"	San José del Rincón	\","+"\"	492,25	\","+"\"	492,25	 \","+"\"	frio	\","+"	0	,"+"	0	,"+"\"	Nombrado así en honor a San José. «Del Rincón» hace referencia al difícil acceso y relativo aislamiento de su cabecera municipal.	\""+");",
    "INSERT INTO MUNICIPIO (IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO) VALUES(	125	,"+"\"	Tonanitla	\","+"\"	Santa María Tonanitla	\","+"\"	8,47	\","+"\"	8,47	 \","+"\"	cálido	\","+"	0	,"+"	0	,"+"\"	Tonantzin «Nuestra madre» y tlan «lugar»: «Lugar de nuestra madre».	\""+");",
};


    public Municipio(String ID, String IGECEM, String NOMBRE, String CABECERA, String SUPERFICIE, String ALTITUD, String CLIMA, String LATITUD, String LONGITUD, String SIGNIFICADO) {
        this.ID = ID;
        this.IGECEM = IGECEM;
        this.NOMBRE = NOMBRE;
        this.CABECERA = CABECERA;
        this.SUPERFICIE = SUPERFICIE;
        this.ALTITUD = ALTITUD;
        this.CLIMA = CLIMA;
        this.LATITUD = LATITUD;
        this.LONGITUD = LONGITUD;
        this.table = table1;
        this.SIGNIFICADO = SIGNIFICADO;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIGECEM() {
        return IGECEM;
    }

    public void setIGECEM(String IGECEM) {
        this.IGECEM = IGECEM;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getCABECERA() {
        return CABECERA;
    }

    public void setCABECERA(String CABECERA) {
        this.CABECERA = CABECERA;
    }

    public String getSUPERFICIE() {
        return SUPERFICIE;
    }

    public void setSUPERFICIE(String SUPERFICIE) {
        this.SUPERFICIE = SUPERFICIE;
    }

    public String getALTITUD() {
        return ALTITUD;
    }

    public void setALTITUD(String ALTITUD) {
        this.ALTITUD = ALTITUD;
    }

    public String getCLIMA() {
        return CLIMA;
    }

    public void setCLIMA(String CLIMA) {
        this.CLIMA = CLIMA;
    }

    public String getLATITUD() {
        return LATITUD;
    }

    public void setLATITUD(String LATITUD) {
        this.LATITUD = LATITUD;
    }

    public String getLONGITUD() {
        return LONGITUD;
    }

    public void setLONGITUD(String LONGITUD) {
        this.LONGITUD = LONGITUD;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getSIGNIFICADO() {
        return SIGNIFICADO;
    }

    public void setSIGNIFICADO(String SIGNIFICADO) {
        this.SIGNIFICADO = SIGNIFICADO;
    }

    public String datos() {
        return getIGECEM() + " " +
            getIGECEM() + " " +
            getSIGNIFICADO() + " " +
            getCABECERA() + " " +
            getSUPERFICIE() + " " +
            getALTITUD() + " " +
            getCLIMA();
    }

    public static Municipio converteMunicipio(Cursor cursor) {
        Municipio municipio = null;
        if (cursor != null) {
            String ID = cursor.getInt(0) + "";
            String IGECEM = cursor.getString(1) + "";
            String NOMBRE = cursor.getString(2) + "";
            String CABECERA = cursor.getString(3) + "";
            String SUPERFICIE = cursor.getString(4) + "";
            String ALTITUD = cursor.getString(5) + "";
            String CLIMA = cursor.getString(6) + "";
            String LATITUD = cursor.getString(7) + "";
            String LONGITUD = cursor.getString(8) + "";
            String SIGNIFICADO = cursor.getString(9) + "";
            municipio = new Municipio(ID, IGECEM, NOMBRE, CABECERA, SUPERFICIE, ALTITUD, CLIMA, LATITUD, LONGITUD, SIGNIFICADO);
        }
        return municipio;
    }

    public static List<Municipio> municipios(Cursor cursor) {
        List<Municipio> municipios = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                municipios.add(converteMunicipio(cursor));
            } while (cursor.moveToNext());
        }
        return municipios;
    }

    public ContentValues contentValues() {
        ContentValues cv = new ContentValues();
        cv.put("IGECEM", this.IGECEM);
        cv.put("NOMBRE", this.NOMBRE);
        cv.put("CABECERA", this.CABECERA);
        cv.put("SUPERFICIE", this.SUPERFICIE);
        cv.put("ALTITUD", this.ALTITUD);
        cv.put("CLIMA", this.CLIMA);
        cv.put("LATITUD", this.LATITUD);
        cv.put("LONGITUD", this.LONGITUD);
        cv.put("SIGNIFICADO", this.SIGNIFICADO);
        return cv;
    }

    public List<Riesgo> getRiesgos() {
        return riesgos;
    }

    public void setRiesgos(List<Riesgo> riesgos) {
        this.riesgos = riesgos;
    }

    public String riesgos(){
        String riesgosString="";
        for (int x = 0; x < riesgos.size(); x++) {
            Riesgo riesgo = riesgos.get(x);
            riesgosString += " " + riesgo.getNOMBRE() + ", ";
        }
      return riesgosString;
    }
}

