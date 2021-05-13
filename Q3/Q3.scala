object book extends App {
  def cost(copies: Int) : Double =  {
    var cost: Double =0;
    if(copies>50){
      cost=(copies-50)*0.75+(50*3)+(24.95*copies*60/100);
    }
    else{
      cost=(copies*3)+(24.95*copies*60/100);
    }
    return cost;
  }
val c=cost(60);
println(f"$c%1.2f");
}
