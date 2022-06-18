function sumador(...n) {
    var sum=0;
    var i;
    for(i=0;i<n.length;i++){
      sum+=n[i];
    }
    return sum;
}