public class min{
public static double min3(double n1,double n2,double n3) {
    double result;
    if (n1<n2 && n1<n3)
    return(n1);
    else if (n2<n3 && n2<n3)
    return(n2);
    else return(n3);
}
public static void main(String[] args) {
 double v1=4.5, v2=6.7, v3=7.8;
 double min;
  min=min3(v1,v2,v3);
  System.out.printf("minnimum of %f %f %f is %f\n",v1,v2,v3,min);
}
public static double max3(double n1,double n2,double n3) {
    double max;
    if (n1>n2 && n1>n3)
    return(n1);
    else if (n2>n3 && n2>n1)
    return(n2);
    else return(n3);
}
public static double mid3(double n1,double n2,double n3) {
    double mid;
    if (min3(n1,n2,n3) < n1)
    return (n1);
    if (min3(n1,n2,n3) < n2)
    return (n2);
    else return(n3);
}}

