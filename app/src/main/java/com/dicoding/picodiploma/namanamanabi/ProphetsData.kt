package com.dicoding.picodiploma.namanamanabi

object ProphetsData {

    private val namaNabi = arrayOf(
        "Nabi Adam", "Nabi Idris", "Nabi Nuh", "Nabi Hud", "Nabi Sholeh",
        "Nabi Ibrahim", "Nabi Luth", "Nabi Ismail", "Nabi Ishaq", "Nabi Yaqub",
        "Nabi Yusuf", "Nabi Ayub", "Nabi Syuaib", "Nabi Musa", "Nabi Harun",
        "Nabi Zulkifli", "Nabi Daud", "Nabi Sulaiman", "Nabi Ilyas", "Nabi Ilyasa",
        "Nabi Yunus", "Nabi Zakaria", "Nabi Yahya", "Nabi Isa", "Nabi Muhammad"
    )

    private val detailNabi = arrayOf(
        "Nabi pertama dari 25 nama nabi ini adalah satu-satunya nabi yang diciptakan di Surga. Nabi Adam diciptakan dari tanah yang ada di permukaan bumi. Beliau hidup di surga selama beberapa waktu bersama istrinya Hawa.\n" +
                "\nDalam kisahnya, nabi Adam terbujuk rayuan setan sehingga dihukum turun ke bumi oleh Allah. Di bumi, nabi Adam menjadi manusia pertama yang kemudian disebut dengan Bapak Manusia.",

        "Nabi Idris adalah anak keturunan Nabi Adam yang keenam dari pernikahan anaknya yaitu Qobil dan Iqlima.\n" +
                "\nNabi Idris dikenal sebagai manusia yang pandai membaca dan menulis. Beliau menguasai banyak ilmu seperti perbintangan, matematika, merawat hewan hingga menjahit.",

        "Nabi yang satu ini dikenal memiliki kesabaran yang luas. Dakwahnya yang berlangsung hampir seumur hidupnya tidak membawa hasil maksimal. Bahkan, keluarga nabi Nuh sendiri pun ada yang belum beriman kepada Allah.\n" +
                "\nNabi Nuh diberikan beberapa mukjizat. Salah satunya adalah membuat bahtera besar untuk menyelamatkan kaumnya dan kehidupan binatang dari banjir bandang.",

        "Nabi Hud diutus untuk mengajak kaum Aad berhenti menuhankan atau menyembah berhala.Nabi Hud mengajak kaum Aad untuk menyembah kepada Allah.\n" +
                "\nAkan tetapi, ajakan nabi Hud nampaknya tidak didengarkan oleh kaum Aad tersebut.. Hingga akhirnya membuat Allah murka dan Allah mendatangkan bencana yang berupa badai gurun selama tujuh hari tujuh malam.",

        "Beliau adalah keturunan keenam dari Nabi Nuh yang tinggal di daerah bekas kaum nabi Hud atau bangsa Aad. Kaum nabi Saleh bernama kaum Tsamud. Mereka juga tidak mengenal tuhan dan menyembah berhala. Untuk itu nabi Saleh mengajak mereka untuk meninggalkan berhala dan menyembah kepada Allah.\n" +
                "\nMukjizat nabi Saleh adalah mampu mengeluarkan unta betina dari sebuah batu ketika memukulkan telapak tangannya.",

        "Nabi Ibrahim bisa dikatakan sebagai bapak para nabi. Hampir semua nabi setelah beliau adalah keturunannya. Nabi Ibrahim didatangkan untuk membenahi kaum yang dipimpin raja Namrud. Kaum ini telah mengalami kerusakan seburuk-buruknya termasuk raja Namrud yang menganggap dirinya sebagai Tuhan.\n" +
                "\nDalam kisahnya nabi Ibrahim telah menghancurkan patung-patung dan berhala yang disemabah oleh pengikut raja Namrud. Karena perbuatannya ini beliau ditangkap dan diikat di alun-alun kota kemudian di bakar. Namun atas kehendak Allah, api membara yang membakar nabi Ibrahim menjadi terasa dingin. Inilah yang menjadi mukzijat nabi Ibrahim dari Allah yang tidak mempan dibakar.",

        "Nabi Luth diutus untuk memperbaiki moral kaum Gomorah yang senang berhubungan sesama jenis. Kaum ini melakukan perbuatan keji yaitu perilaku yang menyimpang yang sangat dilarang oleh Allah. Akan tetapi, ajakan dan seruan nabi Luth untuk meningga;kan perbuatan yang dilarang tersebut tidak diindahkan oleh kaum ini.\n" +
                "\nAkibatnya mereka dihukum dengan gempa bumi dan hujan meteor yang dahsyat yang membinasakan seluruh penduduk kota. Hingga sekarang sisa-sisa kaum Gomoroh masih dapat terlihat dengan kondisi yang sudah membatu atau menjadi fosil.",

        "Nabi Ismail mendapat mukjizat dari Allah dengan munculnya air zamzam dari hentakan kakinya ketika masih kecil. Bahkan hingga sekarang air zam-zam yang berada di Mekah tetap mengalirkan sumber air yang tidak pernah kering. Selain itu, beliau sudah memiliki ketaatan kepada Allah sejak dia masih belia. Hal ini ketika beliau diuji oleh Allah melalui ayahnya nabi Ibrahim untuk dikorbankan kepada Allah.\n" +
                "\nNamun akhirnya penyembelihan nabi Ismail  akhirnya diganti dengan kambing yang dikirim dari Surga. Hal inilah yang akhirnya menjadi asal usul ibadah Qurban di hari raya Idul Adha.",

        "Nabi Ishaq juga merupakan anak nabi Ibrahim atau saudara nabi Ismail. Hanya nabi Ishaq dilahirkan dai ibu yang berbeda, yaitu dari ibu Sarah. Nabi Ishaq turut serta bersama nabi Ibrahim berdakwah menyampaikan ajaran kebenaran.\n" +
                "\nNabi Ishaq dikaruniai anak kembar yang diberinya nama Lishu dan Yaqub. Lishu adalah nenek moyang bangsa Romawi sedangkan Yaqub merupakan nenek moyang bani Israil.",

        "Nabi Yaqub adalah anak nabi Ishaq yang menjadi nenek moyang bangsa bani Israil. Beliau dikaruniai oleh Allah dengan 12 anak.\n" +
                "\nNabi Yaqub meneruskan ajaran tentang keesaan Allah yang diterimanya. Sebelum meninggal dunia, beliau berpesan agar supaya anak-anaknya tetap berpegang pada ajaran ayahnya.",

        "Nabi Yusuf merupakan anak ke-12 dari nabi Yaqub bin Ishaq. Beliau adalah anak kesayangan dari nabi Yaqub. Hal ini membuat iri saudara-saudaranya yang akhirnya membuang beliau ketika masih kecil dengan memasukkannya ke dalam sumur.\n" +
                "\nAkhirnya nabi Yusuf selamat dan dijual kepada raja Mesir. Perjalanan hidupnya penuh dengan rintangan karena nabi yang berparas tampan ini mendapatkan ujian fitnah dari istri pejabat kerajaan Mesir. Mukjizat yang dimiliki oleh nabi Yusuf adalah memiliki kelebihan yang mampu menafsirkan mimpi. Karena kelebihannya ini, beliau dihormati oleh masyarakat sekitarnya.\n" +
                "\nNama Yusuf disebut sebanyak 27 kali dalam “surat Yusuf” di kitab Al-Quran. Kisah beliau juga diceritakan dalam surah tersebut yang Allah sebut sebagai “kisah terbaik dalam Al-Quran”.",

        "Nabi Ayub bisa dikatakan sebagai salah satu nabi tersabar yang pernah ada. Kehidupannya penuh dengan kebaikan dan kaya raya. Akan tetapi hal ini tidak membuatnya sombong dan kufur. Allah mengujinya melalui penderitaan panjang dengan penyakit kulit hingga hartanya habis.\n" +
                "\nBahkan istri dan anak-anak pergi meninggalkannya. Namun, ketabahan dan kesabaran nabi Ayub mampu melewati cobaan itu semua. Akhirnya beliau sembuh dari sakitnya dan menjadi kaya raya kembali.",

        "Nabi Syuaib diutus untuk kaum Madyan, namun kaum ini tetap ingkar dan menolak ajakan nabi Syuaib untuk menyembah kepada Allah. Allah melaknat kaum Madyan dengan badai panas dan awan hitam hingga semua penduduknya musnah.",

        "Kitab Taurat adalah salah satu mukjizat Nabi Musa yang diturunkan oleh Allah. Beliau ditugaskan untuk membebaskan bani Israel dari perbudakan dan membawanya keluar dari Mesir. Atas ijin Allah, beliau juga mampu mengubah tongkat menjadi ular dan membelah laut Merah. Akan tetapi, mukjizat ini tidak mampu mengajak Firaun menyembah Allah.\n" +
                "\nNabi Musa juga memiliki mukjizat yang pernah berbicara dengan Allah secara langsung. Dari ajaran beliau terkenal dengan 10 perintah Allah atau “The Ten Commandments”.",

        "Nabi Harun adalah saudara Nabi Musa yang membantunya berdakwah untuk mengingatkan Fir’aun. Beliau dikaruniai kemampuan berbahasa yang luar biasa. Nabi Harun berjuang untuk kaumnya yang menyembah berhala agar mau meninggalkannya.",

        "Nabi Zulkifli merupakan salah satu dari anak nabi Ayub yang selamat dari reruntuhan rumah. Beliau ditus Allah untuk menyebarkan kebaikan ke kaum Amoria di Damaskus. Beliau mengajak para menyembah berhala supaya menyembah Tuhan Yang Maha Esa, dan taat beribadah kepada-Nya serta membayar zakat. Nabi ini dikaruniai sifat sabar yang sangat besar dan rasa dermawan yang tinggi.",

        "Nabi Daud atau sering disebut juga dengan nabi Dawud. Beliau adalah orang yang mengalahkan Jalut (Goliath) dan diberi mukjizat dapat melunakkan dan membengkokkan besi. Kemudian beliau menjadi raja menggantikan Jalut yang dikalahkannya.\n" +
                "\nBeliau menerima wahyu berupa kitab Zabur. Beliau sangat fasih membaca isi kitab Zabur dengan suara yang merdunya, hingga membuat pegunungan dan burung ikut bertasbih. Nama beliau disebutkan sebanyak 16 kali di dalam Al-Quran. Jadi mukjizat nabi Daud adalah dapat berkomunikasi dengan burung, memiliki suara merdu dan bisa melunakkan besi dengan tangan kosong.",

        "Nabi Sulaiman adalah putra dari nabi Daud yang meneruskan ayahnya menjadi seorang raja. Nabi Sulaiman adalah nabi yang memiliki kekayaan yang sangat banyak. Bahkan kekayaan yang dimilikinya tidak dapat dihitung karena terlalu banyak.\n" +
                "\nNabi yang satu ini memiliki bermacam-macam mukjizat. Diantaranya adalah bisa bicara dengan binatang, dapat menundukkan angin serta tingkat kesabaran yang luar biasa.",

        "Nabi Ilyas adalah keturunan ke-4 dari Nabi Harun. Beliau ditugaskan berdakwah kepada orang-orang Finisia dan Bani Israel yang menyembah berhala bernama Baal di Kota Baalbak, Syam.\n" +
                "\nKota Baalbak ini diambil dari nama berhala yang mereka sembah. Nabi Ilyas mengajak kaumnya untuk menyembah Allah namum mereka ingkar. Itulah sebabnya Allah menurunkan azab.",

        "Nabi Ilyasa adalah seorang anak yang diangkat dan diasuh oleh Nabi Ilyas. Beliau melanjutkan perjuangan ayahnya untuk berdakwah. Beliau ditugaskan untuk berdakwah kepada Bani Israil dan orang-orang Amoria di daerah Panyas, Syam.\n" +
                "\nNabi Ilyasa memiliki kesabaran tingkat tinggi, karenanya beliau diberi mukjizat besar seperti mampu menghidupkan orang mati.",

        "Nabi Yunus diutus oleh Tuhan untuk pergi ke Niniwe dan mengingatkan penduduknya akan datangnya murka Tuhan dalam waktu 40 hari. Namun sampai hari ke-39 belum juga ada murka Tuhan, akhirnya beliau merasa kecewa dan frustrasi sehingga meninggalkan kaumnya. Kemudian beliau meninggalkan Niniwie dan pergi naik kapal. Namun kapal yang ditumpanginya terjebak badai besar yang akhirnya membuat beliau terjun ke laut.\n" +
                "\nAkhirnya beliau dimaakan oleh ikan paus raksasa, namun tidak wafat. Allah memberikan pelajaran pada nabi Yunus yang meninggalkan kaumnya dengan hukuman hidup di dalam perut ikan paus. Di dalam perut ikan Paus inilah beliau memanjatkan doa keselamatan dan penyesalan telah meninggalkan kaumnya. Akhirnya setelah 3 hari tinggal di perutnya, beliau disemprotkan keluar oleh ikan Paus tersebut.",

        "Nabi Zakaria adalah keturunan dari nabi Sulaiman. Nabi Zakaria diutus untuk memperbaiki kaum Bani Israil yang tinggal di Palestina. Nabi Zakaria berdakwah hingga usia renta dan baru dianugerahi anak di usianya tersebut.",

        "Nabi Yahya adalah anak dari Nabi Zakaria yang lahir ketika Nabi Zakaria sudah sangat tua. Nabi Yahya adalah seorang manusia yang berprinsip, integritasnya tinggi serta benar-benar menegakkan kebenaran.\n" +
                "\nBeliau dikaruniai hikmah dan ilmu ketika masih anak-anak. Beliau hormat pada orang tuanya, dan tidak sombong ataupun durhaka. Beliau juga pintar dan tajam pemikirannya. Itulah mengapa Nabi Yahya selalu menjadi orang yang dapat menyelesaikan masalah di kalangan kaumnya.",

        "Nabi Isa terlahir dengan mukjizat Allah pada seorang perempuan suci bernama Maryam. Beliau mendapatkan mukjizat kitab Injil dan menjadi nabi dari umat Nasrani. Nabi Isa adalah nabi dan rasul yang merupakan salah satu dari Ulul Azmi. Dalam Al-Qur’an, beliau disebut “Isa bin Maryam” atau “Isa al-Masih”. Beliau ditugaskan oleh Allah untuk berdakwah kepada Bani Israil di Palestina.\n" +
                "\nNabi Isa membawa kabar mengenai kedatangan nabi penutup yakni Nabi Muhammad. Akan tetapi, banyak umatnya yang tidak mau mengakuinya hingga saat ini. Nabi Isa juga memiliki mukjizat yang dapat berbicara pada waktu masih bayi. Beliau juga dapat menghidupkan burung yang sudah mati atau orang yang sudah mati.",

        "Nabi Muhammad adalah Nabi dan Rasul terakhir yang diutus Allah. Umatnya adalah seluruh manusia di muka bumi yang hidup mulai jaman Nabi Muhammad hingga akhir jaman. Rasulullah mengajarkan dan mengesakan Allah sebagaimana yang dibawa dan diajarkan oleh nabi dan rasul sebelumnya.\n" +
                "\nBeliau adalah Rasul penutup dan tidak akan ada lagi nabi yang diturunkan setelah beliau. Oleh sebab itu, semua umat manusia sekarang ini wajib mengimani Nabi Muhammad.\n" +
                "\nMukjizat nabi Muhammad adalah kitab suci Al-Quran. Kitab suci Al-Quran sebagai kitab suci yang terakhir sebagai penyempurna kitab-kitab sebelumnya yang diturunkan oleh Allah.\n" +
                "\nSelain itu beliau juga memiliki mukjizat dengan perjalanan Isra’ dan Mi’raj yang hanya dilakukan dalam waktu semalam."

    )

    private val nameImages = intArrayOf(
        R.drawable.nabiadam,
        R.drawable.nabiidris,
        R.drawable.nabinuh,
        R.drawable.nabihud,
        R.drawable.nabisaleh,
        R.drawable.nabiibrahim,
        R.drawable.nabiluth,
        R.drawable.nabiismail,
        R.drawable.nabiishaq,
        R.drawable.nabiyaqub,
        R.drawable.nabiyusuf,
        R.drawable.nabiayub,
        R.drawable.nabisyuaib,
        R.drawable.nabimusa,
        R.drawable.nabiharun,
        R.drawable.nabizulkifli,
        R.drawable.nabidaud,
        R.drawable.nabisulaiman,
        R.drawable.nabiilyas,
        R.drawable.nabiilyas,
        R.drawable.nabiyunus,
        R.drawable.nabizakaria,
        R.drawable.nabiyahya,
        R.drawable.nabiisa,
        R.drawable.nabimuhammad
    )

    val listData: ArrayList<Nabi>
        get() {
            val list = arrayListOf<Nabi>()
            for (position in namaNabi.indices) {
                val nabi = Nabi()
                nabi.name = namaNabi[position]
                nabi.detail = detailNabi[position]
                nabi.gambartulisan = nameImages[position]
                list.add(nabi)
            }
            return list
        }

}