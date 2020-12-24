public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {
            int intBucketCount = (int) Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
            return intBucketCount;

        } else {
            return -1;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width > 0 && height > 0 && areaPerBucket > 0) {
            int intValue = (int) Math.ceil((width * height) / areaPerBucket);
            return intValue;
        } else {
            return -1;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area > 0 && areaPerBucket > 0) {
            int bucketValue = (int) Math.ceil(area / areaPerBucket);
            return bucketValue;
        } else {
            return -1;
        }
    }
}
