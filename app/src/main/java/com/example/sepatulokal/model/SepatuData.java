package com.example.sepatulokal.model;

import java.util.ArrayList;
import com.example.sepatulokal.R;

public class SepatuData {
    public static String[] shoesNames = {
            "NAH Project",
            "Compass",
            "GeOff MAX",
            "Saint Barkley",
            "Piero",
            "Brodo",
            "Kodachi",
            "Ventela",
            "Jhonson",
            "Eagle"
    };

    public static String[] shoesDetails = {
            "Sepatu merk NAH Project mulai viral dan dikenal khalayak umum ketika digunakan oleh Jokowi, Presiden RI. Merk ini dipilih oleh Jokowi karena kualitasnya yang bagus dan untuk meningkatkan kesadaran warga Indonesia akan produk-produk keluaran lokal.Beberapa produk andalannya adalah sepatu FlexiKnit 1.0 dan v2.0 yang digunakan oleh Jokowi.",

            "Compass merupakan merk sepatu buatan Indonesia yang sudah ada sejak tahun 1998 dan berawal dari bisnis keluarga di kota Bandung. Merk ini berspesialisasi di tipe sneakers kanvas dengan perpaduan desain klasik dan modern.Kekhasan sneakers keluaran Compass adalah garis putih yang dikatakan melambangkan Gazelle, binatang penuh kecepatan yang terus melaju ke depan.Tipe yang tersedia dan digemari oleh masyarakat di seluruh Indonesia antara lain adalah Gazelle Hi, Gazelle Low, dan edisi Vintage yang dijual terbatas dalam kesempatan-kesempatan tertentu saja",

            "Geoff Max Footwear (GMX) merupakan merk lokal yang juga memproduksi sneakers kanvas dengan variasi warna dan tipe yang bisa kamu pilih. Apabila dilihat sekilas, desain sepatu ini mirip dengan sepatu keluaran Amerika Serikat, Vans. Dengan harga yang sangat terjangkau jauh, kamu bisa mendapatkan sneakers dengan salah satu kualitas terbaik.Jika menggunakan sepatu ini, penampilan kamu dijamin semakin kece!",

            "Sneakers merk Saint Barkley juga merupakan salah satu merk lokal yang digunakan oleh Jokowi dan mengundang perhatian dari khalayak umum. Merk yang berasal dari Bandung ini menawarkan serangkaian koleksi sneakers dengan tampilan vintage dan kualitas yang sangat nyaman untuk digunakan.Produk sneakers Saint Barkley memiliki pelanggan setia di mancanegara dan sudah cukup sering diimpor ke luar negeri.Untuk ukuran produk lokal, dapat dibilang bahwa produk Saint Barkley berhasil membawa nama baik Indonesia.",

            "Jika dilihat dari namanya, mungkin beberapa orang tidak menyangka bahwa Piero merupakan merk lokal. Kualitas yang ditawarkan juga sangat baik, menunjukkan bahwa kualitas produksi sepatu di Indonesia sudah sangat meningkat.Untuk pria, terdapat kategori sepatu Essential, Active, Classic, dan Evo. Sedangkan untuk wanita, koleksi terbagi menjadi tiga yaitu Active, Classic, dan Evo.Kamu bisa memilih sneakers yang diinginkan sesuai dengan selera dan kebutuhan.",

            "Biasa dikenal dengan koleksi sepatu outdoor seperti boots, ternyata Brodo juga memiliki koleksi sneakers yang tidak kalah berkualitasnya. Nama koleksi sneakers terbaru dari Brodo adalah Fujin. Terdapat dua varian Fujin yang bisa kamu pilih sebagai sepatu andalanmu sehari-hari, yaitu varian all black dan juga hitam dengan sol berwarna putih.Sepatu ini memudahkan mobilitas kamu agar terasa lebih ringan tetapi tetap memberikan support yang baik untuk kaki.",

            "Merk sepatu dari Jepang yang sekarang diakuisisi oleh lokal ini sudah dikenal baik oleh masyarakat Indonesia. Pasalnya, banyak anak sekolah yang sering menggunakan sepatu Kodachi sehari-hari karena kualitasnya yang dapat tahan lama.Belakangan ini sneakers Kodachi mulai kembali digemari oleh masyarakat, karena desainnya yang klasik dan khas dengan tiga garis diagonal di bagian samping sepatu.",

            "Ventela® Shoes mulai di perkenalkan pada tahun 2017 oleh William Ventela, seorang pemilik pabrik sepatu vulkanisir sejak tahun 1989 di Bandung, Jawa Barat. Ventela® Shoes memiliki berbagai macam jenis dan model yang cocok di gunakan untuk berbagai jenis kegiatan. Setiap pasang Ventela® Shoes melalui proses yang panjang dan detail, mulai dari pemilihan material, proses produksi hingga pemeriksaan kualitas yang sangat ketat. Hal ini dilakukan agar kualitas Ventela® Shoes terjaga dengan baik. Dengan sumber daya yang berlimpah Ventela® Shoes mampu memproduksi sepatu dengan kuantitas besar dan kualitas terbaik sehingga semua kalangan dapat memiliki sepatu berkualitas tinggi dengan harga yang terjangkau.",

            "Satu lagi sneaker high top dengan nuansa hijau yang menggoda. Johnson menjadi sebuah merek lokal asal Bandung yang meramaikan pasar sepatu lokal. Seperti sepatu lokal yang banyak beredar, Johnson juga memakai teknologi vulcanized yang menguatkan sol sepatu karena dibantu dengan proses pemanasan. Seri Galaxy Pro dengan warna green ini menarik dan gak kalah keren dari Compass Pop Meets Pop. Dengan sedikit balutan rubber gum yang membuat semakin gaya, sepatu ini juga dibanderol dengan harga yang masuk akal yakni Rp265.000 saja.",

            "Untuk urusan sepatu olahraga, pria bisa percayakan dengan brand lokal sepatu Indonesia ini. Sudah sejak 1986, Eagle menghadirkan model sneakers yang cocok dikenakan untuk pria aktif dinamis. Sampai sekarang, Eagle dirasa paling pas untuk dipakai ketika sedang berolahraga mulai dari running, jogging, tenis sampai futsal. Kisaran harga dari sepatu sneakers Eagle sekitar Rp260 ribuan."
};

    public static int[] shoesImages = {
        R.drawable.nahproject,
        R.drawable.compass,
        R.drawable.geoffmax,
        R.drawable.saintbarkley,
        R.drawable.piero,
        R.drawable.brodo,
        R.drawable.kodachi,
        R.drawable.ventela,
        R.drawable.johnson,
        R.drawable.eagle
        };

    public static ArrayList<Sepatu> getListData() {
        ArrayList<Sepatu> list = new ArrayList<>();
        for (int position = 0; position < shoesNames.length; position++) {
        Sepatu sepatu = new Sepatu();
        sepatu.setNama(shoesNames[position]);
        sepatu.setDeskripsi(shoesDetails[position]);
        sepatu.setPhoto(shoesImages[position]);
        list.add(sepatu);
        }
        return list;
        }
        }


