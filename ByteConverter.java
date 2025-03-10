package Lesson3;

public class ByteConverter {

    public static void byteConverter(long bytes){

        if (bytes < 1024)
        {
            System.out.printf("No of bytes is :" + bytes + "bytes");
        }
        if(bytes < 1024*1024)
        {
            double kilobytes = bytes / 1024;
            System.out.printf("%.2f KB %n",kilobytes );
        }
        if(bytes < 1024* 1024*1024)
        {
            double megabytes = bytes / (1024 * 1024);
            System.out.printf("%.2f MB %n", megabytes );
        }
        if(bytes < 1024L* 1024* 1024* 1024)
        {
            double gigabytes = bytes / (1024 * 1024 * 1024);
            System.out.printf("%.2f GB %n", gigabytes);
        }
        else
        {
            double teraBytes= bytes /(1024 *1024 *1024 * 1024);

            System.out.printf("%.2f TB %n",teraBytes);
            }
    }


    public static void main(String[] args) {
        long dataSize= 11111111111L;
        byteConverter(dataSize);

    }
}

