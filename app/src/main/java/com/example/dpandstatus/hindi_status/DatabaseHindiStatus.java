package com.example.dpandstatus.hindi_status;

import java.util.ArrayList;

public class DatabaseHindiStatus {

    private ArrayList<String> attitude ;
    private ArrayList<String> dekhPagali ;
    private ArrayList<String> love ;
    private ArrayList<String> friendship ;
    private ArrayList<String> rain ;
    private ArrayList<String> funny ;
    private ArrayList<String> sad ;
    private ArrayList<String> motivatinal ;
    private ArrayList<String> festival ;
    private ArrayList<String> goodMorning ;
    private ArrayList<String> goodNight ;


    public DatabaseHindiStatus(){

        String HsAttitude1=" जमीन पर टिक नही सकते और \n" + "बात आसमान की करते है ";
        String HsAttitude2=" अपने कद का अंदाज़ा हमे भी है \n" + "लाडले हम परछाई देख कर \n" + "गुरुर नही करते ";
        String HsAttitude3=" \n" + "बेसक खेल तुम्हारे होंगे लेकिन \n" + "अब चाल हमारी होगी ";
        String HsAttitude4="  कुछ लोग दिखावे की शान रखते है \n" + "तलवार की औकात नही और मयान रखते है ";
        String HsAttitude5=" कोशिश तुम बस यही करो\n" + " जितना हो सके हमसे बच कर रहो ";
        String HsAttitude6=" किताबो पे धूल जम जाने से \n" + "इतिहास कभी खत्म नही होते ";
        String HsAttitude7=" जिन्दगी की हर तपिश को मुस्कुरा \n" + "कर झेलिये धुप कितनी भी हो समंदर \n" + "सूखा नही करते ";
        String HsAttitude8=" \n" + "बेशक तू समझदार है पर मुझे \n" + "समझाने की जरूरत नही है ";
        String HsAttitude9=" \n" + "वो जो नफरत होती है ना\n" + "उसके भी लायक नही है तू ";
        String HsAttitude10=" तू चालाकी से कोई चाल तो चल\n" + " जितने का हुनर मुझमे आज भी है ";
        String HsAttitude11=" हम तो वो खिलाड़ी है जो\n" + "अपनी किस्मत के साथ खेलते है ";
        String HsAttitude12=" \n" + "भीड़ में पहचान बनाई जा सकती है \n" + "तुम बस आगे रहना सीखो ";
        String HsAttitude13=" हम आदमी की शक्ल देख कर उसकी \n" + "अकल का अंदाज़ा लगा लेते है ";
        String HsAttitude14=" बराबरी सबके साथ कर \n" + "छोटे बाप के साथ नही ";
        String HsAttitude15=" शान शौकत रुतबा हमे पैदा \n" + "होते ही मिल गया था साहब ";
        String HsAttitude16=" जब  से  मुझे  पता  चला  है कि  मेरा आत्मविश्वास\n" + " मेरे  साथ  है तब से  मैने  ये  सोचना  बंद  कर \n" + " दिया कि  कौन  मेरे  खिलाफ  है ";
        String HsAttitude17=" अगर प्यार से कोई फूंक मारें तो बुझ जाएंगे,,नफरत से तो बड़े-बड़े तूफान बुझ गए मुझे बुझाने में!! ";
        String HsAttitude18=" आज भी हारी हुई बाजी खेलना पसंद है हमे क्योंकी हम तकदीर से ज्यादा खुद पे भरोसा करते है ";
        String HsAttitude19=" किताबों \uD83D\uDCDA की ☝\uD83C\uDFFB एहमियत \uD83D\uDE0A अपनी  \uD83D\uDC4F\uD83C\uDFFBजगा \uD83C\uDF0E जनाब \uD83E\uDD37\uD83C\uDFFB♂ सबक़ \uD83D\uDC46\uD83C\uDFFB वही \uD83D\uDE1E याद  \uD83D\uDE44रहेते \uD83D\uDE22 हे जो ☺ वक़्त  \uD83C\uDF0Eऔर  \uD83E\uDD14लोग  \uD83D\uDC65सिखाते \uD83D\uDC6C है ";
        String HsAttitude20=" जिंदगी में कुछ नेक काम ऐसे भी करने चाहिये\n" + "जिनका खुदा के सिवा कोई दूसरा गवाह ना हो… ";


        String HsDekhPagali1="  #सुन_पगली,\n" + "तुझको खबर नहीं मगर एक बात सुन ले..\n" + "बरबाद कर दिया है तेरे दो ✌दिन के प्यार \uD83D\uDC9Eने...! ";
        String HsDekhPagali2=" देख_पगली,\n" + "##Status##__को \u202A#\u200Eलाइक़\u202C \uD83D\uDC4D नही ✖ किय़ा चलेगा,\n" + "लेकिन ☝ तूने #Dil_से_पढ़ा_#  \uD83D\uDCD6 हे ना बस ☝ इतना ही ✔ काफी है...! ";
        String HsDekhPagali3=" #Oye_पगली_सुन... \uD83D\uDE0F\n" + "जो #100_No.\n" + "#DiaL करने की तु ##धमकी## देती है ना... \uD83D\uDE0F\n" + "उसका पुरा #HeadQuArteR \uD83D\uDE01\n" + "#मेरे_भाईयो के.. \uD83D\uDE0B\n" + "#इशारो पर चलता है...! ";
        String HsDekhPagali4="  पगली\uD83D\uDC67 बोली- जितना तू  [_ATTITUDE_] \uD83D\uDE0E दिखाता है,\n" + "उतना तो तू  [_SMART_]  \uD83D\uDC66भी नही है...\n" + "मैं \uD83D\uDC68बोला- #पगली Smart तो #Phone#\uD83D\uDCF1 होते है,\n" + "हम तो  [_CUTE_] \uD83D\uDE04 है.. !! ";
        String HsDekhPagali5="  #मैं \uD83D\uDC66 #नहीं_कहता,  की #मेरी_खबर \uD83D\uDE0C पूछ #पगली##,\n" + "#तुम_खुद किस #हाल \uD83D\uDE0C में हो बस #इतना \uD83D\uDE09 ही #बता_दिया कर..!!! ";
        String HsDekhPagali6=" #डर_मत_पगली,\n" + "आना है तो आ सब कुछ छोड़ के,\n" + "वरना जबरदस्ती उठा लाऊँगा..! ";
        String HsDekhPagali7=" सुन_पगली,\n" + "भले मुझे \uD83D\uDE09 Exam में \uD83D\uDCDD [_35%_] ही \uD83D\uDE23 आते हो,\n" + "लेकिन मैं प्यार \uD83D\uDC91 तुझसे [_100%_] वाला ही करता \uD83D\uDE0D हूँ...! ";
        String HsDekhPagali8=" ##सुन_मेरी_पगली###\n" + "#मैं_शून्य \uD83D\uDC4C हूँ मुझे \uD83D\uDC66 पीछे ही #रखना, ☝\n" + "#मेरा_फर्ज ☺ सिर्फ आपकी \uD83D\uDC6B #कीमत_बढ़ाना है..! ";
        String HsDekhPagali9=" #सुन_जान\n" + "#ज़िन्दगी \uD83C\uDF0D का सफर इतना #सुहाना_होना_चाहिये##, ☺\n" + "#सितम \uD83D\uDE12 हो फिर भी [ #दिल_शायराना ]\uD83D\uDE0D होना चाहिये..! ";
        String HsDekhPagali10=" #SmaRt तो нм\uD83D\uDE47\uD83C\uDFFBबचपन से ही наι\uD83D\uDC70 #_पगली[],\n" + "अगर \uD83D\uDE09 #चेहरे पर #रुमाल भी लगा लुं तो \uD83D\uDC6C\n" + "#लोग मुझे मेरी\uD83D\uDEB6 #Aankho_se \uD83D\uDC40 पहचान लेते हैं..! ";
        String HsDekhPagali11="  #_पगली\u202C ❤ तेरी पसंद ही इतनी \u202Aसड़ी\u202C है,\n" + "तभी तो हमारे\u202C साथ नही \u202Aखड़ी\u202C है...! ";
        String HsDekhPagali12="  हमे \uD83D\uDE0E ना #सिखाओ ❌पेश आने का #तरीका, \uD83D\uDE0F\n" + "[क्योंकि हम #KING \uD83D\uDE0E\uD83D\uDC48 है,]\n" + "#_Rules♠ ही खुद\uD83D\uDC91 बनाते है..! ";
        String HsDekhPagali13="  #देख_पगली--\n" + "#_मुस्कुराना## ☺ तो तकदीर में लिखवा \uD83D\uDCDD कर #लाए_थे,\n" + "#खिलखिलाना \uD83D\uDE01 आप जैसे #अपनों \uD83D\uDC6B ने #तोहफे_में_दे_दिया##.. ";
        String HsDekhPagali14="  #कर_दिया उस ##पगली## ने #BloCk मुझे #__Attitude में आ के..?\n" + "और अब #हाल ￼ #पूछती है मेरा #Fake_id# बना के\uD83D\uDE2F.. ";
        String HsDekhPagali15="  या #खुदा इस #_रमजान#\uD83D\uDE18 में मेरी #दुआ\uD83D\uDE0A #कबूल\uD83D\uDE0D करना,\n" + "#जिस #पगली_के\uD83D\uDC68 लिए #मुझे\uD83D\uDC78 बनाया है उससे❤ #मिलवा\uD83D\uDC6B देना...! ";
        String HsDekhPagali16=" #सुन_पगली..\n" + "बात_कहने \uD83D\uDDE3 का अंदाज़ \uD83D\uDE09 भी #खूबसूरत \uD83D\uDE18 होना चाहिए,\n" + "ताकि \uD83D\uDE0C आपको #जवाब \uD83D\uDE09 भी #खूबसूरत_मिले..! ";
        String HsDekhPagali17="  #सुन_पगली_..\n" + "इस #_दुनिया\uD83C\uDF10 का एक ही #_नियम है,\n" + "#_प्यार \uD83D\uDC91साथ दे ना ❌ दे, पर #_यार \uD83D\uDC68\u200D❤\u200D\uD83D\uDC68जरूर #_साथ \uD83D\uDC6C_#देते हैं..! ";
        String HsDekhPagali18="  #पगली_तेरी_आँखों## \uD83D\uDC69 में #_इश्क \uD83D\uDE18 भी है और #मोहब्बत भी है,\n" + "तभी ☝ तो #हम \uD83D\uDC66 कभी #महकते## भी \uD83D\uDE09 हैं और #कभी_बहकते# भी है..! ";
        String HsDekhPagali19="  सुन_पगली# तेरे सिवा में #चॉकलेट_तक किसी को ना दू, दिल तो बहोत दूर की बात है...! ";
        String HsDekhPagali20="  #रुलाये_बगैर \uD83D\uDE22 तो #प्याज \uD83C\uDF30 भी नहीं कटता #_पगली, \uD83D\uDC6B\n" + "फिर ☝ ये तो #जिदंगी ☺ है, तेरे बिना कैसे #कट_पाएगी..! ";


        String HsLove1="  \n" + "सामने बैठे रहो दिल \uD83D\uDC96 को करार आएगा, जितना देखेंगे  तुम्हें उतना ही प्यार \uD83D\uDE18 आएगा | ";
        String HsLove2="  \n" + "जो बीत गया है वो अब दौर ना आयेगा, तेरे सिवा दिल मे कोई और ना आयेगा..❤️ ";
        String HsLove3=" \n" + "ना जाने कैसा रिश्ता है इस दिल का तुझसे, धड़कना भूल सकता है पर #तेरा नाम नही..\uD83D\uDE18 \uD83D\uDC6B ";
        String HsLove4=" \n" + "मोहब्बत सिर्फ लफ्जो से बयां नहीं होती,अदाओ में भी कुछ राज छूपे होते है.\uD83E\uDD70 ";
        String HsLove5=" \n" + "जरा ठहरो तो नजर भर के देखूँ, जमीन पे चांद कहां रोज रोज उतरता है \uD83E\uDD70\uD83E\uDD70 ";
        String HsLove6=" \n" + "हुआ था शोर पिछलि रात में दो चांद निकले है,बताओ क्या जरूरत थी तुम्हे छत पर टहलने की \uD83C\uDF19 ";
        String HsLove7=" \n" + "फ़ासले तो बढ़ा रहे हो, मगर इतना याद रखना, मोहब्बत\uD83D\uDC97बार बार इंसान पर मेहरबान नहीं होती\uD83D\uDC4F…!! ";
        String HsLove8=" \n" + "हिचकियां रूक ही नहीं_रही हैं आज, ☝ पता नहीं  हम  किसके दिल ❤ में अटक_गए हैं ।। ";
        String HsLove9=" \n" + "मुद्दत के बाद जिन्दगी फिर से मुस्कुराने लगी है, किसी की धडकन हमें अपना बनाने लगी है| \uD83E\uDD70 ";
        String HsLove10=" \n" + "लापता होकर निकले थे मोहबत में तेरी हमें क्या पता था मशहूर हो जाएंगे ❤️ ";
        String HsLove11=" \n" + "अंदाज मुझे भी आता है, नज़र अंदाज करने का पर तू तक़लीफ़ से गुजरे ये मुझे गवारा नही |❤️ ";
        String HsLove12=" \n" + "प्यार की बातें हम से ना किया करो जनाब, हम मासुम लोग हैं, खामखां बहक जाएंगे।।❤️ ";
        String HsLove13=" \n" + "सुरत तो फिर भी सुरत है.. मुझे तो तेरे नाम के लोग भी अच्छे लगते है!!\uD83E\uDD70 ";
        String HsLove14=" \n" + "कोई शख्स तो यूँ मिले,  के वो मिले तो सुकून मिले... ";
        String HsLove15="  \n" + "इजहार से नहीं इन्तज़ार से पता चलता है, कि मोहब्बत कितनी गहरी है ! ❤️ ";
        String HsLove16="  \n" + "एक शख्स जो मुझे रोज़ सताता है, मगर सुकून भी ना जाने क्यों, उसी के साथ आता है.\uD83E\uDD70 ";
        String HsLove17=" \n" + "गलती से ही सही एक कॉल लगा दो \"गलती से लग गया था सॉरी\" कहकर अपनी आवाज सुना दो!! \uD83E\uDD70 ";
        String HsLove18=" \n" + "छोड़ तो सकता हूँ मगर छोड़ नहीं पाता उसे, वो शख्श मेरी बिगड़ी हुई आदत की तरह है!!\uD83D\uDE07 ";
        String HsLove19="\n" + "नही बस्ती किसी और की सूरत अब इन आंखों में, काश हमने तुझे कभी इतने गौर से न देखा होता |\uD83E\uDD29\uD83E\uDD29 ";
        String HsLove20=" \n" + "प्यार का मतलब तो नहीं मालूम मुझे, मगर जब जब तुझे देखूँ दिल धड़कने लगता है।\uD83E\uDD70 ";

        String HsFriendship1=" दोस्त वह होता है जो आपके भुतकाल को समझता है, आपके भविष्य पर विश्वास रखता है और आप जैसे हो वैसे ही आपको अपनाता है। ";
        String HsFriendship2=" जिंदगी में कई दोस्त बनाना एक आम बात हैं लेकिन, एक ही दोस्त से जिंदगी भर दोस्ती निभाना खास बात हैं। ";
        String HsFriendship3=" “Phøtø”….. खींचने Ķ@ शौख नहीं हैं मुजे पर क्या करु मेरे Friend \uD83D\uDC83\uD83C\uDFFB Ko …..”Phøtø”…..देखे बीना नींद नहीं आती…..\uD83D\uDE18\uD83D\uDE18\uD83D\uDE18 ";
        String HsFriendship4=" \uD83D\uDC6C जमाने кi छोडिये \uD83D\uDE0E нmє जमाने кє साथ चलना ηнi आता…\uD83D\uDE0E нυm आज внi बच्चे\uD83D\uDE0B нє \uD83D\uDE0Eहमें दोस्तों кє बिना \uD83D\uDE0Bजीना ηнi आता ";
        String HsFriendship5=" ज़िन्दगी एक रेलवे स्टेशन की तरह है , प्यार एक ट्रेन है जो आती है और चली जाती है , पर दोस्त Enquiry Counter है , जो हमेशा कहते हैं May I Help You ! ";
        String HsFriendship6=" सच्चे_दोस्त \uD83D\uDC6C कभी एक दूसरे को i_Love_u \uD83D\uDC93नही बोलते ❌\uD83D\uDE1C उनकी तो गालियों मे भी प्यार छुपा होता है\uD83D\uDE05  ";
        String HsFriendship7=" कुदरत \uD83D\uDC64 का नियम ☝ है मित्र_और_चित्र, \uD83D\uDC6B\uD83D\uDDBC\n" + "दिल ❤ से बनाओगे ☝ तो उनके_रंग ☺ जरूर निखर_आयेंगे ।। \uD83D\uDE18\uD83D\uDC6B ";
        String HsFriendship8=" किसी ने पूछा इस दुनिया में आपका अपना कौन हैं..,मैंने हंसकर कहा, जो मेरा Status पढ़ रहा है ";
        String HsFriendship9=" हम \uD83D\uDC66 कहाँ_जायेंगे ☹ तुम_जैसे \uD83D\uDE0C दोस्तों \uD83D\uDC6B को छोड़कर, \uD83D\uDE12*तुम्हारे_बिन \uD83D\uDC6B दिन \uD83C\uDF07 नहीं_गुजरता ☝ जिन्दगी \uD83C\uDF0D क्या खाक_गुजरेगी..\uD83D\uDEAC\uD83D\uDEAC\uD83D\uDE0E ";
        String HsFriendship10=" सच्चा \u202Aदोस्त\u202C मिलना बहोत ही \u202Aमुश्किल\u202C है,\n" + "मैं खुद \u202Aहैरान\u202C हूँ कि तुम लोगों ने मुझे \u202Aढूढ़\u202C कैसे लिया। ";
        String HsFriendship11=" दोस्ती हर चहरे की मीठी मुस्कान \uD83D\uDE0F होती है, दोस्ती ही सुख दुख की \uD83E\uDD14 पहचान होती है, रूठ \uD83D\uDE1E भी गऐ हम तो दिल \uD83D\uDC93 पर मत लेना, क्योकि दोस्ती जरा सी नादान \uD83D\uDE44 होती है…!!! ";
        String HsFriendship12=" वो दिल \uD83D\uDC93 क्या जो मिलने की दुआ न करे, तुम्हें भुलकर \uD83D\uDE1E जिऊ यह खुदा न करे, रहे तेरी दोस्ती मेरी जिन्दगानी \uD83E\uDD17 बनकर, यह बात और है जिन्दगी वफा \uD83D\uDE1F न करे। ";
        String HsFriendship13=" दोस्ती \uD83E\uDD3C अच्छी हो तो रंग़ लाती है, दोस्ती गहरी \uD83D\uDC6C हो तो सबको भाती है, दोस्ती नादान हो तो टूट \uD83E\uDD14 जाती है, पर अगर दोस्ती अपने जैसी हो तो इतिहास \uD83D\uDC6C बनाती है। ";
        String HsFriendship14=" तेरी दोस्ती की \uD83E\uDD17 आदत सी पड़ गयी है मुझे, कुछ देर तेरे साथ \uD83E\uDD3C चलना बाकी है, शमसान मैं जलता छोड़ कर\uD83D\uDEB6मत जाना, वरना रूह कहेगी कि रुक \uD83D\uDD90️ जा, अभी तेरे यार का ल जलना \uD83D\uDD25 बाकी है। ";
        String HsFriendship15=" हम वक्त गुजारने के लिए दोस्तों \uD83D\uDC6C को नही रखते, दोस्तों के साथ रहने \uD83E\uDD3C के लिए वक्त रखते है. ";
        String HsFriendship16=" किसी रोज़ याद न कर पाऊं तो खुदगर्ज़ \uD83D\uDE12 न समझ लेना दोस्तों, \uD83D\uDC6C दरसल छोटी सी इस उम्र में परेशानिया \uD83D\uDE1E बहुत हैं, मैं भूला नहीं हूँ किसी को मेरे बहुत अच्छे दोस्त \uD83D\uDE0F हैं ज़माने में, बस थोड़ी ज़िन्दगी उलझ पड़ी है दो वक़्त ⏲️ की रोटी कमाने में। ";
        String HsFriendship17=" लोग रूप देखते है, हम दिल \uD83D\uDC93 देखते है, लोग सपने देखते है हम \uD83D\uDE0F हक़ीकत देखते है, लोग दुनिया मे दोस्त \uD83E\uDD3C देखते है, हम दोस्तो मे दुनिया \uD83C\uDF0D देखते है. ";
        String HsFriendship18=" लोग पूछते हैं इतने \uD83D\uDE1E गम में भी खुश \uD83D\uDE07 क्युँ हो.. मैने कहा दुनिया \uD83C\uDF0D साथ दे न दे मेरा दोस्त \uD83E\uDD3C तो साथ हैं ";
        String HsFriendship19=" मेरे लिए मेरी जान है ‘तेरी \uD83D\uDC6C दोस्ती, ज़िन्दगी का हर अरमान है ‘तेरी \uD83E\uDD3C दोस्ती, ना कोई गिला, ना कोई \uD83D\uDE0F शिकवा है किसी से, मुझपर खुदा का एहसान है तेरी \uD83D\uDC68\u200D❤️\u200D\uD83D\uDC68 दोस्ती।. ";
        String HsFriendship20=" जो आसानी से मिले वो है \uD83D\uDE1E धोखा, जो मुश्किल से मिले वो है \uD83D\uDE0F इज्जत, जो दिल से मिले वो है प्यार \uD83D\uDC8F और जो नसीब से मिले वो है \uD83D\uDC6Cदोस्त ";


        String HsRain1=" जब जब गरजते है ये बादल मेरे दिल की धड़कन बढ़ जाती है|\n" + "और  मेरे दिल की हर एक धड़कन से आवाज़ आती है.\n" + "बस तुम मेरे हो?  ";
        String HsRain2=" मज़ा आता हैं बारिश में उसके इंतज़ार में.\n" + "और जब देर वो आती हैं तो गले लगा कर कहती हैं,\n" + "सॉरी बाबू बारिश तेज़ थी.  ";
        String HsRain3=" सुनो ना आज ज्यादा ही बारिश का ये  मौसम हसीन है, \n" + " लेकिन जान तुम जैसा नहीं.   ";
        String HsRain4=" जब जब होती हैं बारिश और गरजते है ये बादल \n" + "मेरे दिल की धड़कन बढ़ जाती है.\n" + "\n" + "और दिल की हर एक धड़कन से आवाज़ आती है.\n" + "तुम करीब आओ ना, आओ ना.  ";
        String HsRain5=" बारिश की बूँदों में झलकती है उनकी तस्वीर,\u202C\u200E\n" + "और हम उनसे मिलनें की चाहत में भीग जाते हैं\u202C.  ";
        String HsRain6=" इतनी बारिश  और रोमांटिक मौसम ना कर ओ राम जी,\n" + "जरुरी नहीं की  सब की सैटिंग हो.  ";
        String HsRain7=" हवा भी रूक जाती है कहने को कुछ तराने,\n" + "\n" + "बारिश की बूंदे भी उसे छूने को करती है बहाने.  ";
        String HsRain8=" उसे  बारिश\u202C  मे भीगना अच्छा लगता है\n" + "और  \u202A\u200Eमुझे\u202C सिर्फ़ बारिश मे भीगती हुयी \u202A\u200Eवो\u202C  ";
        String HsRain9=" वाह मौसम आज तेरी अदा पर \n" + "दिल को प्यार आ गया,\n" + "वो पास आई,\n" + "और तू बारिश बनकर बरस गया.  ";
        String HsRain10=" ज़रा ठहरो ना के बारिश है यह थम जाए तो फिर चली जाना, \n" + " किसी का तुझ को छु लेना मुझे अच्छा नहीं लगता.  ";
        String HsRain11=" भीगेँगे जो किसी रोज हम मोहब्बत की बरसात में \n" + " फिर कमज़ोर से इस दिल को इश्क का बुखार पक्का है.  ";
        String HsRain12=" ☔ पूछते हो ना मुझसे तुम हमेशा की मे कितना प्यार करता हू तुम्हे\n" + " तो गिन लो बरसती हुई इन बूँदो को तुम  ";
        String HsRain13=" बारिश की तरह तुम बरसती रहो हम पर,\n" + "मिट्टी की तरह हम भी महकते चले जाएँ.  ";
        String HsRain14=" एक ख्वाब ने आँखे खोली हैं, क्या मोड़ आया है कहानी में,\n" + "वो भीग रही थी बारिश में और आग लगी है पानी में.  ";
        String HsRain15=" एक हम हैं जो इश्क़ कि बारिश करते है, \n" + " एक तुम हो जो भीगने को तैयार ही नहीं.   ";
        String HsRain16=" सुना है बारिश में दुआ क़बूल होती है\n" + " अगर हो इज्जाजत तो मांग लू तुम्हे ?  ";
        String HsRain17=" ये  बारिश  ये  हसीन मौसम  और ये  मदमस्त हवाये, \n" + " लगता है आज  मोहब्बत प्यार की बाहो में हैं.   ";
        String HsRain18=" अब कौन घटाअों को, घुमड़ने से रोक पायेगा,\n" + " ज़ुल्फ़ जो खुल गयी तेरी, लगता है सावन आयेगा.  ";
        String HsRain19=" उस को भला कोई कैसे गुलाब दे,\n" + "जिसके आने से बारिश का मौसम और गुलाबी हो जाता है.  ";
        String HsRain20=" बालकनी से बाहर आकर कर देखो ये जानेजाना \n" + " मौसम तुम से मेरे दिल की बात कहने आया है  ";


        String HsFunny1=" किसी और से धोखा खाने से अच्छा है\n" + "मेरे साथ चलो मोमोस और गोलगप्पे खाएंगे। ";
        String HsFunny2=" चाहे जितना मेहंगा earphone लगा लो ….\n" + "सबसे पहले एक कान का खराब होना ही है। ";
        String HsFunny3=" अब से रोज़ नहाने के लिए टॉस करूँगा,\n" + "हेड आया तो नहीं नहाऊंगा,\n" + "टेल आया तो फिर से टॉस करूँगा..!! ";
        String HsFunny4=" डॉक्टर ने खून की कमी बताई है,\n" + "किसका खून पियुं… ";
        String HsFunny5=" कहते हैं….लाइफ में खोना आसान है…और पाना मुश्किल,\n" + "\n" + "मगर वज़न का इस लाइन से कोई मतलब नहीं। ";
        String HsFunny6=" हे भगवान् मुझे बेशक सिंगल रखना\n" + "लेकिन सेटिंग उसकी भी मत होने देना …जिस से मेरी शादी होगी। ";
        String HsFunny7=" इज़्ज़त किया करो,\n" + "बेइज़्ज़ती तो हमारे घर वाले ही बहुत करते हैं। ";
        String HsFunny8=" फ़िल्टर में रहने दो….फ़िल्टर ना हटाओ,\n" + "फ़िल्टर जो हट गया तो…बाबू डर जाएगा। ";
        String HsFunny9=" बस एक दिल ही साफ़ है मेरा,\n" + "\n" + "बाकी दिमाग तो भगवान् ने शैतान की टक्कर का दिया है। ";
        String HsFunny10=" फनी कोट्स इन हिंदी : टेबल पर खाना और आसमान में बादल आते ही लोग फोटोग्राफर बन जाते हैं। ";
        String HsFunny11=" ‘ससुराल में पहला दिन’\n" + "\n" + "सास बहु से:”बेटा तुझे जो बनाना आता है बना ले…”\n" + "\n" + "बहु:”मम्मी जी आप सोडे के साथ लेंगी या पानी के साथ ” ";
        String HsFunny12=" सब कहते हैं रात गयी बात गयी लेकिन ये बात जाती कहाँ है। ";
        String HsFunny13=" गर्मी का ये आलम है की …कूलर या ऐसी वाले कमरे से दूसरे कमरे में जाते हैं तो लगता है शिमला से राजस्थान आ गए। ";
        String HsFunny14=" मोबाइल मुझ से: कौन तुझे यू बर्बाद करेगा जैसे मैं करता हूँ। ";
        String HsFunny15=" जुबान तो सबके पास होती है कोई बात करता है और कोई बकवास। ";
        String HsFunny16=" कुछ लोगों को मोहब्बत का ऐसा नशा चढ़ता है …की शायरी वो लिखते हैं दर्द पूरा फेसबुक सहन करता है। ";
        String HsFunny17=" हमारे पास हर Problem का Solution होता है….बस प्रॉब्लम दूसरों की होनी चाहिए। ";
        String HsFunny18=" एक दिन ये सारी दुनिया ख़तम हो जाएगी\n" + "लेकिन ये सिंक में पड़े बर्तन कभी ख़तम नहीं होंगे। ";
        String HsFunny19=" घरवाले मर्ज़ी से हेअरकट तक तो कराने नहीं देते\n" + "\n" + "मर्ज़ी से शादी क्या घंटा करने देंगे। ";
        String HsFunny20=" गाड़ी की चाबी लेने अम्बानी जी जाएं… तो शोरूम वाले बोलते होंगे की गाड़ी की चाबी चाइये या शोरूम की। ";


        String HsSad1=" कल मैं उसके गली से गुजर रहा था क्या बताऊँ मेरे ऊपर क्या गुजर रहा थी ";
        String HsSad2=" इन सब में सबसे ज्यादा मशरूफ लगी आप I ज्यादा कुछ नहीं TV का Cartoon लगी आप  ";
        String HsSad3=" दुनिया का दस्तूर है ये, जिसे टूट कर चाहोगे ,वही तोड़ कर जाएगा  ";
        String HsSad4=" दिन दूसरों के कामों में बीत जाती है,और रात आपकी यादों में बीत जाती है ";
        String HsSad5=" बहुत दिनों से नजर में थी,पता नहीं किसकी नजर लगी ,आज कल नजर नहीं आती  ";
        String HsSad6=" अधूरे आशिक के बाद ही लोग पुरे शायर बनते है  ";
        String HsSad7=" कभी कभी कुछ लोग ऐसा काम करते है की उनके Face पर देने का मन करता है बहुत Hard बहुत Hard ";
        String HsSad8=" जुर्म का पता नहीं, बस सजा दिये जा रही है ज़िंदगी ";
        String HsSad9=" वक्त बहुत कुछ छीन लेती है खैर मैं तो किसी का आशिक था ";
        String HsSad10=" आज कल लोग दूरियों का फ़ायदा उठा कर मजबूरियां बता जाते है ";
        String HsSad11=" रोज पूछते थे मुझसे मेरा हाल, आज कल किसी और से पूछ रही है ";
        String HsSad12=" जवाब तो उन्हें चाहिए जो सवाल करते है मैंने तो इजाजत मांगी है ";
        String HsSad13=" मेरा बस चले तो मैं आपको काजल लगा के देखूं, कही आपको मेरी नजर ना लग जाय  ";
        String HsSad14=" आशिकों के Insurance होते तो इतने लोग इश्क में नहीं मरते ";
        String HsSad15=" कुछ घंटों की मुलाक़ात सालों बया कर गई ";
        String HsSad16=" कभी कभी लोग कुछ ऐसा कह जाते है हमें आपकी याद दिला जाते है ";
        String HsSad17=" एक बेनाम सी मुहब्बत, मैंने किसी गुमनाम के नाम कर दी  ";
        String HsSad18=" इश्क अगर दायरें में रहा, तो शादी में क्या बुराई है  ";
        String HsSad19=" मेरी सिगरेट के तलब से भी अहम हो तुम, कैसे कहूं सबसे अलग हो तुम  ";
        String HsSad20=" दाग दिल पर लगी है ,और हम है की लिबास धोये जा रहे है ";


        String HsMotivatinal1=" किसी के काम करने का Action ही आपके अंदर Motivation लाता है  ";
        String HsMotivatinal2=" Success की सबसे खास बात है की, वो मेहनत करने वालों पर फ़िदा हो जाती है  ";
        String HsMotivatinal3=" अगर आप Failure को Attention नहीं देंगे तो आपको कभी भी Success नहीं मिलेगी  ";
        String HsMotivatinal4=" दूसरों के चेहरे हम याद रखें हमारी ऐसी फितरत नहीं लोग हमारा चेहरा देख के अपनी फितरत बदल ले ऐसी हमारी फितरत है   ";
        String HsMotivatinal5=" शायद ये चेहरा मेरा नहीं है लेकिन कुछ चेहरे देखकर मुझे मेरा चेहरा बदलने का मन करता है  ";
        String HsMotivatinal6=" जो किसी के Fan है उनका कभी कोई Fan नहीं बनता  ";
        String HsMotivatinal7=" बिना दुरी तय किये हुए कही दूर आप नहीं पहुंच सकते   ";
        String HsMotivatinal8=" जब रास्तों पर चलते चलते मंजिल का ख्याल ना आये तो आप सही रास्ते पर है   ";
        String HsMotivatinal9=" अगर ख्वाईश कुछ अलग करने की है तो दिल और दिमाग के बीच बगावत लाजमी है  ";
        String HsMotivatinal10=" जिस काम में काम करने की हद पार ना फिर वो काम किसी काम का नहीं  ";
        String HsMotivatinal11=" मुनाफा का तो पता नहीं लेकिन बेचने वाले तो यादों को भी कारोबार बना कर बेच देते है  ";
        String HsMotivatinal12=" सफलता तक पहुंचने के लिए असफलता के Road से गुजरनी पड़ेगी  ";
        String HsMotivatinal13=" जो सही करने की हिम्मत उसी में आती है जो गलती करने से नहीं डरते है  ";
        String HsMotivatinal14=" तब तक अपने काम पर काम करें जब तक की आप सफल नहीं हो जाते  ";
        String HsMotivatinal15=" हर कोई जन्म से ही किसी ना किसी काम में Champion होता है I बस पता चलने की देर होती है  ";
        String HsMotivatinal16=" कभी कभी किसी की जुनून को देख कर अपने आप में भी जुनून आ जाता है  ";
        String HsMotivatinal17=" Luck का तो पता नहीं लेकिन अवसर जरूर मिलती है मेहनत करने वालों को  ";
        String HsMotivatinal18=" पैसा ही नहीं एक मात्र Measurement है सफलता की  ";
        String HsMotivatinal19=" जिसने भी किया है कुछ बड़ा वो कभी किसी से नहीं डरा  ";
        String HsMotivatinal20=" कहते सब है Dont Judge Me , लेकिन करते सब है  ";


        String HsFestival1=" कह दो अंधेरो से कही और घर बना ले मेरे मुल्क में रोशनी का सेलाब आया है..\n" + "\"हेप्पी दीपावली\" ";
        String HsFestival2=" हर साल आता है, हर साल जाता है....इस नए साल में आपको वो सब मिले...\n" + "जो आपका दिल चाहता है..! नया साल मुबारक ! ";
        String HsFestival3=" राधा का रंग और कन्हया की पिचकारी, प्यार के रंग से रंग दो दुनिया सारी...\n" + "ये रंग न जाने कोई जात न कोई बोली, मुबारक हो आपको रंग भरी होली..... ";
        String HsFestival4=" कुदरत का हर रंग आप पर बरसे, हर कोई आपसे होली खेलने को तरसे....\n" + "रंग दे आपको मिल के सब इतना की, आप वो अंग उतारने को तरसे....\n" + "\"होली की हार्दिक सुभकामनाये\" ";
        String HsFestival5=" हंमेशा मीठी रहे आपकी बोली, खुशियों से भर जाए आपकी झोली...\n" + "आप को हमारी और से हप्पी होली.... ";
        String HsFestival6=" पिचकारी की धार, गुलाल की बौछार, अपनों का प्यार...\n" + "यही है होली का त्योहार..\"होली की आपको शुभ कामनाये\" ";
        String HsFestival7=" रात को नया चाँद मुबारक, चाँद को चांदनी मुबारक, फलक को सितारे मुबारक..\n" + "सितारों को बुलंदी मुबारक, और आपको हमारी तरफ से \"ईद मुबारक\" ";
        String HsFestival8=" वतन हमारा एसा कोई न छोड़ पाए, रिश्ता हमारा एसा कोई न तोड़ पाए.....\n" + "दिल एक है, जान एक है हमारी, हिदुस्तान हमारा है यह शान है हमारी...\n" + "\"स्वतंत्रता दिवस की बधाई\" ";
        String HsFestival9=" कुछ नशा तिरंगे की आन का है, कुछ नशा मातृभूमि की शान का है...\n" + "हम लहेरायेंगे हर जगह यर तिरंगा, नशा ये हिंदुस्तान के सम्मान का है.....\n" + "\"स्वतंत्र दिवस का हार्दिक अभिनन्दन\" ";
        String HsFestival10=" होता है प्यार क्या दुनिया को जिसने बताया, दिल के रिश्तो को जिसने प्रेम से सजाया...\n" + "आज उस प्र के देवता का जन्मदिन आया...\"हप्पी जन्माष्टमी\" ";
        String HsFestival11=" कान्हा के किरदार का कोई और न छोर, इक पल वो जगदीश है, इक पल माखनचोर...\n" + "श्री कृष्ण आपके जीवन में सदैव खुशियों के दीप जलाये रखे...\n" + "\"जन्माष्टमी की हार्दिक शुभकामनाये\" ";
        String HsFestival12=" ये लम्हा कुछ खास है, बाहें के हाथों में भाई का हाथ है, ओ बहन तेरे लिए मेरे\n" + "पास कुछ खास है, तेरे सुखों के खातीर मेरी बहेना तेरा भाई हंमेशा तेरे साथ है....\n" +"\"हैप्पी रक्षा बंधन\" ";
        String HsFestival13=" आपके लिए मेरा दिल यही दुआ करता है की, कामयाबी आपके कदम चूमे और\n" + "आप हंमेशा जिंदगी में कामयाब हो...\"राखी की ढेर सारी शुभकामनाये\" ";
        String HsFestival14=" चन्दन का टिका रेशम का धागा, सावन की सुगंध बारिश की फुहार...\n" + "भाई की उम्मीद बहना का प्यार, मुबारक हो आपको रक्षा बंधन का त्यौहार... ";
        String HsFestival15=" भगवान् श्री गणेश की कृपा,  बनी रहे आप पर हर दम, हर कार्य में सफलता मिले...\n" + "जीवन में न आये कोई गम...\"गणेश चतुर्थी की शुभ कामनाए\" ";
        String HsFestival16="  गणेश जी का रूप निराला, चेहरा कितना भोला भाला, जिसे भी आती है कोई मुसीबत\n" + "उसे इन्ही ने संभाला.....\"गणेश चतुर्थी की हार्दिक शुभ कामनाए\" ";
        String HsFestival17=" देवी माँ के कदम आपके घर में आये, आप ख़ुशी से नहाये...\n" + "परेशानियाँ आपसे आँख चुरायें, नवरात्रि की आपको ढेर सारी शुभ कामनाएं.... ";
        String HsFestival18=" विजया दशमी का शुभ अवसर, आपके और आपके परिवार के जीवन में सुख संमृद्धि और शान्तु भर दे...\n" + "\"हप्पी दशहरा\" ";
        String HsFestival19=" रावण जलाओ, बुरे को आग लगाओ, अच्छाई को अपनाओ.\n" + "खूब धूमधाम से दशहरा मनाओ...\"हेप्पी दशहरा\" ";
        String HsFestival20=" दीपक की रोशनी, मिठाइयों की मिठास, पटाखों की बौछार...\n" + "धन की बरसात, हरपल हर दिन आपके लिए लाये दीपावली का त्यौहार..\n" + "\"शुभ दीपावली\" ";


        String HsGoodmorning1=" अगर लोग सिर्फ जरूरत पर ही आपको याद करते हैं, तो उन्हें गलत मत समझिए, क्योंकि आप उनकी जिंदगी की वह रोशनी की किरण है जो उन्हें सिर्फ अंधेरे में दिखाई देती है  ";
        String HsGoodmorning2=" “भरोसा” बहुत बड़ी पूंजी है\n" + "यूं ही नहीं बांटी जाती…\n" + "यह… खुद पर रखो तो ताकत और दूसरे पर रखो तो “कमजोरी” बन जाता है  ";
        String HsGoodmorning3=" विकल्प मिलेंगे बहुत,\n" + "मार्ग भटकाने के लिए,\n" + "संकल्प एक ही काफी है,\n" + "मंजिल तक जाने के लिए..!!  ";
        String HsGoodmorning4=" हमें हर संबंध को,\n" + "समय देना चाहिए,\n" + "क्या पता कल हमारे पास,\n" + "समय हो पर संबंध ना हो!  ";
        String HsGoodmorning5=" सुप्रभात\n" + "कर्मों की आवाज\n" + "शब्दों से ऊँची होती है\n" + "Good Morning  ";
        String HsGoodmorning6=" भगवान् ने सिर्फ\n" + "दो ही रास्ते दिए हैं|\n" + "या तो देकर जाइये\n" + "या फिर छोड़कर जाइये||\n" + "साथ ले जाने की\n" + "कोई व्यवस्था नहीं है\n" + "इसलिए सदा प्रसन्न रहें|\n" + "सुप्रभात  ";
        String HsGoodmorning7=" ये कशमकश का वहम मत पालो,\n" + "जो काम ख़ुशी दे,\n" + "आज ही कर डालो\n" + "गुड मॉर्निंग  ";
        String HsGoodmorning8=" जो व्यक्ति हर पल दुःख का रोना रोता है\n" + "सुख उसके दरवाजे से ही लौट जाता है  ";
        String HsGoodmorning9=" यूँ ही नहीं मिलती मंजिलें यक़ीनन\n" + "एक जूनून सा दिल में जगाना पड़ता है\n" + "पूछा चिड़िया से किसी ने,\n" + "कैसे बनाया आशियाना?\n" + "बोली भरनी पड़ती है उड़ान बार -बार\n" + "तिनका -तिनका उठाना पड़ता है\n" + "Good Morning  ";
        String HsGoodmorning10=" खुद को बिखरने मत देना किसी हाल में\n" + "लोग गिरे हुए मकान की ईंटें तक ले जाते हैं\n" + "सुप्रभात  ";
        String HsGoodmorning11=" दुआओं का कोई रंग नहीं होता\n" + "लेकिन जब रंग लाती है\n" + "तो जिंदगी रंगों से भर जाती है\n" + "सुप्रभात (Good Morning)  ";
        String HsGoodmorning12=" वक्त का काम तो गुजर जाना है\n" + "बुरा है तो सब्र करो\n" + "अच्छा है तो शुक्र करो\n" + "शुभ प्रभात\n" + "Good Morning  ";
        String HsGoodmorning13=" आशा चाहे कितनी भी कम हो\n" + "निराशा से बेहतर ही होती है\n" + "सुप्रभात – Good Morning  ";
        String HsGoodmorning14=" हँसता हुआ मन\n" + "और\n" + "हँसता हुआ चेहरा\n" + "यही जीवन की सच्ची संपत्ति है\n" + "Good Morning Dosto  ";
        String HsGoodmorning15=" जिंदगी आसान नहीं होती\n" + "इसे आसान बनाना पड़ता है…\n" + "कुछ अंदाज से\n" + "कुछ नजरअंदाज से\n" + "Good Morning Ji !!  ";
        String HsGoodmorning16=" परवाह, आदर और थोड़ा समय\n" + "यही वो दौलत है जो अक्सर,\n" + "हमारे अपने हमसे चाहते हैं\n" + "Good Morning!! Suprbhat  ";
        String HsGoodmorning17=" सुख, शांति एवं समृद्धि\n" + "की मंगलकामना\n" + "के साथ सुबह की नमस्कार\n" + "** सुप्रभात **  ";
        String HsGoodmorning18=" संतोष ही सबसे बड़ा धन है\n" + "जिसके पास संतोष है..\n" + "वह स्वस्थ है, सुखी है और\n" + "वही सबसे बड़ा धनवान है\n" + "*** Good Morning ***  ";
        String HsGoodmorning19=" हे ईश्वर….\n" + "बस एक छोटी सी दुआ है\n" + "जिन लम्हों में\n" + "मेरे अपने सभी मुस्कुराते हों\n" + "वो लम्हे कभी खत्म ना हों\n" + "सुप्रभात [ Good Morning ]  ";
        String HsGoodmorning20=" जिंदगी…\n" + "जो शेष है…\n" + "बस वो ही विशेष है\n" + "बाकि सब अवशेष है!\n" + "** सुप्रभातम **  ";


        String HsGoodNight1=" यकीन रखिये, ऊपर वाले का फैसले हमारे फैसलों से ज्यादा बेहतर होते हैं. Good Night ";
        String HsGoodNight2=" दीपक रात भर अँधेरे से लड़ता है तभी उजाला करता है, तुम भी लड़ो और उजाला करो Good Night ";
        String HsGoodNight3=" ना हारने से डरिये ना जीतने से डरिये, ज़िंदगी में चलते रहिये और हर दिन कुछ सीखते रहिये शुभ रात्रि..lovesove.com ";
        String HsGoodNight4=" रात को मेहनत करने वाला ही, दिन के इम्तिहान में सफल होता है शुभ रात्रि शुभ रात्रि..lovesove.com ";
        String HsGoodNight5=" वक्त पर अपनी गलती ना मानना बहुत बड़ी गलती है शुभ रात्रि..lovesove.com ";
        String HsGoodNight6=" खुद को इतना कमजोर मत बनाना कि, दूसरों के एहसान की जरूरत पड़ने लगे ! शुभरात्रि..lovesove.com ";
        String HsGoodNight7=" लग रहे दूरियां तो क्या हुआ याद... नजरों से नहीं दिल से किया जाता है... शुभरात्रि..lovesove.com ";
        String HsGoodNight8=" हमको मिल जाए आप जैसे हजार, इतनी दुनिया भी मत दिखाइए! शुभरात्रि..lovesove.com ";
        String HsGoodNight9=" कभी कभी किसी से ऐसा रिश्ता बन जाता है, कि हर चीज से पहले उसी का ख्याल आ जाता है..! शुभरात्रि..lovesove.com ";
        String HsGoodNight10=" जब तक हम अपने आप से सुलह नहीं कर लेते, तब तक हम दुनिया से भी सुलह नहीं कर सकते ! शुभरात्रि..lovesove.com ";
        String HsGoodNight11=" तेरी सांसों में बिखर जाऊं तो अच्छा है, बन के रूह तेरे जिस्म मे उतार जाऊं तो अच्छा है, किसी रात तेरी गोद में सर रख कर सो जाऊं, उस रात की कभी सुबह ना हो तो अच्छा .. Good night..lovesove.com ";
        String HsGoodNight12=" हर रात मेरा नाम बोल कर सोया करो, खिड़की खोल तकिया मोड़ के सोया करो, हम भी आएंगे तुम्हारे ख्यालों में, इसलिये थोड़ी सी जगह छोड़ के सोया करो।..lovesove.com ";
        String HsGoodNight13=" न चाहो किसी को इतना की तुम्हारी चाहत उसकी मजबूरी बन जाये चाहो किसी को इतना की तुम्हारी चाहत उसके लिए जरुरी बन जाये गुड नाईट..lovesove.com ";
        String HsGoodNight14=" देखो फिर से रात आ गयी गूड नाईट कहने की बात याद आ गयी बैठे थे गुम सुम होकर चाँद को देखा तो तुम्हारी याद आ गयी ।..lovesove.com ";
        String HsGoodNight15=" बीता हुआ कल बदला नहीं जा सकता, लेकिन आने वाला कल हमेशा आपके हाथ में होता है! शुभ रात्रि..lovesove.com ";
        String HsGoodNight16=" रात है काफी, ठंडी हवा चल रही है, याद में आपकी किसी की मुस्कान खिल रही है, उनके सपनों की दुनिया में आप खो जाओ, आंखे करो बंद और आराम से सो जाओ... गुड नाइट..!!!..lovesove.com ";
        String HsGoodNight17=" हमें हर संभल को, समय देना चाहिए, क्योंकि क्या पता कल हमारे पास समय हो पर संबंध ना हो! शुभ रात्रि....lovesove.com ";
        String HsGoodNight18=" जिंदगी छोटी नहीं होती बस ख्वाहिश बढ़ जाती है! **शुभ रात्रि**..lovesove.com ";
        String HsGoodNight19=" ख्वाब और हकीकत में सिर्फ इतना फर्क है, ख्वाब टूट जाते हैं, हकीकत तोड़ देती है. शुभ रात्रि!..lovesove.com ";
        String HsGoodNight20=" बहक जाती है नींद आखिर क्यों उनकी बात में, कुछ तो राज़ ज़रुर है इन काली काली रात में! शुभ रात्रि !!!..lovesove.com ";





        attitude=new ArrayList<>();
        attitude.add(HsAttitude1);
        attitude.add(HsAttitude2);
        attitude.add(HsAttitude3);
        attitude.add(HsAttitude4);
        attitude.add(HsAttitude5);
        attitude.add(HsAttitude6);
        attitude.add(HsAttitude7);
        attitude.add(HsAttitude8);
        attitude.add(HsAttitude9);
        attitude.add(HsAttitude10);
        attitude.add(HsAttitude11);
        attitude.add(HsAttitude12);
        attitude.add(HsAttitude13);
        attitude.add(HsAttitude14);
        attitude.add(HsAttitude15);
        attitude.add(HsAttitude16);
        attitude.add(HsAttitude17);
        attitude.add(HsAttitude18);
        attitude.add(HsAttitude19);
        attitude.add(HsAttitude20);

        dekhPagali=new ArrayList<>();
        dekhPagali.add(HsDekhPagali1);
        dekhPagali.add(HsDekhPagali2);
        dekhPagali.add(HsDekhPagali3);
        dekhPagali.add(HsDekhPagali4);
        dekhPagali.add(HsDekhPagali5);
        dekhPagali.add(HsDekhPagali6);
        dekhPagali.add(HsDekhPagali7);
        dekhPagali.add(HsDekhPagali8);
        dekhPagali.add(HsDekhPagali9);
        dekhPagali.add(HsDekhPagali10);
        dekhPagali.add(HsDekhPagali11);
        dekhPagali.add(HsDekhPagali12);
        dekhPagali.add(HsDekhPagali13);
        dekhPagali.add(HsDekhPagali14);
        dekhPagali.add(HsDekhPagali15);
        dekhPagali.add(HsDekhPagali16);
        dekhPagali.add(HsDekhPagali17);
        dekhPagali.add(HsDekhPagali18);
        dekhPagali.add(HsDekhPagali19);
        dekhPagali.add(HsDekhPagali20);

        love=new ArrayList<>();
        love.add(HsLove1);
        love.add(HsLove2);
        love.add(HsLove3);
        love.add(HsLove4);
        love.add(HsLove5);
        love.add(HsLove6);
        love.add(HsLove7);
        love.add(HsLove8);
        love.add(HsLove9);
        love.add(HsLove10);
        love.add(HsLove11);
        love.add(HsLove12);
        love.add(HsLove13);
        love.add(HsLove14);
        love.add(HsLove15);
        love.add(HsLove16);
        love.add(HsLove17);
        love.add(HsLove18);
        love.add(HsLove19);
        love.add(HsLove20);

        friendship=new ArrayList<>();
        friendship.add(HsFriendship1);
        friendship.add(HsFriendship2);
        friendship.add(HsFriendship3);
        friendship.add(HsFriendship4);
        friendship.add(HsFriendship5);
        friendship.add(HsFriendship6);
        friendship.add(HsFriendship7);
        friendship.add(HsFriendship8);
        friendship.add(HsFriendship9);
        friendship.add(HsFriendship10);
        friendship.add(HsFriendship11);
        friendship.add(HsFriendship12);
        friendship.add(HsFriendship13);
        friendship.add(HsFriendship14);
        friendship.add(HsFriendship15);
        friendship.add(HsFriendship16);
        friendship.add(HsFriendship17);
        friendship.add(HsFriendship18);
        friendship.add(HsFriendship19);
        friendship.add(HsFriendship20);

        rain=new ArrayList<>();
        rain.add(HsRain1);
        rain.add(HsRain2);
        rain.add(HsRain3);
        rain.add(HsRain4);
        rain.add(HsRain5);
        rain.add(HsRain6);
        rain.add(HsRain7);
        rain.add(HsRain8);
        rain.add(HsRain9);
        rain.add(HsRain10);
        rain.add(HsRain11);
        rain.add(HsRain12);
        rain.add(HsRain13);
        rain.add(HsRain14);
        rain.add(HsRain15);
        rain.add(HsRain16);
        rain.add(HsRain17);
        rain.add(HsRain18);
        rain.add(HsRain19);
        rain.add(HsRain20);


        funny=new ArrayList<>();
        funny.add(HsFunny1);
        funny.add(HsFunny2);
        funny.add(HsFunny3);
        funny.add(HsFunny4);
        funny.add(HsFunny5);
        funny.add(HsFunny6);
        funny.add(HsFunny7);
        funny.add(HsFunny8);
        funny.add(HsFunny9);
        funny.add(HsFunny10);
        funny.add(HsFunny11);
        funny.add(HsFunny12);
        funny.add(HsFunny13);
        funny.add(HsFunny14);
        funny.add(HsFunny15);
        funny.add(HsFunny16);
        funny.add(HsFunny17);
        funny.add(HsFunny18);
        funny.add(HsFunny19);
        funny.add(HsFunny20);

        sad=new ArrayList<>();
        sad.add(HsSad1);
        sad.add(HsSad2);
        sad.add(HsSad3);
        sad.add(HsSad4);
        sad.add(HsSad5);
        sad.add(HsSad6);
        sad.add(HsSad7);
        sad.add(HsSad8);
        sad.add(HsSad9);
        sad.add(HsSad10);
        sad.add(HsSad11);
        sad.add(HsSad12);
        sad.add(HsSad13);
        sad.add(HsSad14);
        sad.add(HsSad15);
        sad.add(HsSad16);
        sad.add(HsSad17);
        sad.add(HsSad18);
        sad.add(HsSad19);
        sad.add(HsSad20);

        motivatinal=new ArrayList<>();
        motivatinal.add(HsMotivatinal1);
        motivatinal.add(HsMotivatinal2);
        motivatinal.add(HsMotivatinal3);
        motivatinal.add(HsMotivatinal4);
        motivatinal.add(HsMotivatinal5);
        motivatinal.add(HsMotivatinal6);
        motivatinal.add(HsMotivatinal7);
        motivatinal.add(HsMotivatinal8);
        motivatinal.add(HsMotivatinal9);
        motivatinal.add(HsMotivatinal10);
        motivatinal.add(HsMotivatinal11);
        motivatinal.add(HsMotivatinal12);
        motivatinal.add(HsMotivatinal13);
        motivatinal.add(HsMotivatinal14);
        motivatinal.add(HsMotivatinal15);
        motivatinal.add(HsMotivatinal16);
        motivatinal.add(HsMotivatinal17);
        motivatinal.add(HsMotivatinal18);
        motivatinal.add(HsMotivatinal19);
        motivatinal.add(HsMotivatinal20);

        festival=new ArrayList<>();
        festival.add(HsFestival1);
        festival.add(HsFestival2);
        festival.add(HsFestival3);
        festival.add(HsFestival4);
        festival.add(HsFestival5);
        festival.add(HsFestival6);
        festival.add(HsFestival7);
        festival.add(HsFestival8);
        festival.add(HsFestival9);
        festival.add(HsFestival10);
        festival.add(HsFestival11);
        festival.add(HsFestival12);
        festival.add(HsFestival13);
        festival.add(HsFestival14);
        festival.add(HsFestival15);
        festival.add(HsFestival16);
        festival.add(HsFestival17);
        festival.add(HsFestival18);
        festival.add(HsFestival19);
        festival.add(HsFestival20);

        goodMorning=new ArrayList<>();
        goodMorning.add(HsGoodmorning1);
        goodMorning.add(HsGoodmorning2);
        goodMorning.add(HsGoodmorning3);
        goodMorning.add(HsGoodmorning4);
        goodMorning.add(HsGoodmorning5);
        goodMorning.add(HsGoodmorning6);
        goodMorning.add(HsGoodmorning7);
        goodMorning.add(HsGoodmorning8);
        goodMorning.add(HsGoodmorning9);
        goodMorning.add(HsGoodmorning10);
        goodMorning.add(HsGoodmorning11);
        goodMorning.add(HsGoodmorning12);
        goodMorning.add(HsGoodmorning13);
        goodMorning.add(HsGoodmorning14);
        goodMorning.add(HsGoodmorning15);
        goodMorning.add(HsGoodmorning16);
        goodMorning.add(HsGoodmorning17);
        goodMorning.add(HsGoodmorning18);
        goodMorning.add(HsGoodmorning19);
        goodMorning.add(HsGoodmorning20);


        goodNight=new ArrayList<>();
        goodNight.add(HsGoodNight1);
        goodNight.add(HsGoodNight2);
        goodNight.add(HsGoodNight3);
        goodNight.add(HsGoodNight4);
        goodNight.add(HsGoodNight5);
        goodNight.add(HsGoodNight6);
        goodNight.add(HsGoodNight7);
        goodNight.add(HsGoodNight8);
        goodNight.add(HsGoodNight9);
        goodNight.add(HsGoodNight10);
        goodNight.add(HsGoodNight11);
        goodNight.add(HsGoodNight12);
        goodNight.add(HsGoodNight13);
        goodNight.add(HsGoodNight14);
        goodNight.add(HsGoodNight15);
        goodNight.add(HsGoodNight16);
        goodNight.add(HsGoodNight17);
        goodNight.add(HsGoodNight18);
        goodNight.add(HsGoodNight19);
        goodNight.add(HsGoodNight20);






        //loveRomantic

       /* loveRomantic=new ArrayList<>();
        loveRomantic.add( getCorrectUrl( img1 ) );
        loveRomantic.add(getCorrectUrl(  img2));
        loveRomantic.add(getCorrectUrl(  img3));
*/
    }

    public ArrayList<String> getAttitude(){
        return attitude;
    }
    public ArrayList<String> getDekhPagali(){
        return dekhPagali;
    }
    public ArrayList<String> getLove(){
        return love;
    }
    public ArrayList<String> getFriendship(){
        return friendship;
    }
    public ArrayList<String> getRain(){
        return rain;
    }
    public ArrayList<String> getFunny(){
        return funny;
    }
    public ArrayList<String> getSad(){
        return sad;
    }
    public ArrayList<String> getMotivatinal(){
        return motivatinal;
    }
    public ArrayList<String> getFestival(){
        return festival;
    }
    public ArrayList<String> getGoodMorning(){
        return goodMorning;
    }
    public ArrayList<String> getGoodNight(){
        return goodNight;
    }







}
