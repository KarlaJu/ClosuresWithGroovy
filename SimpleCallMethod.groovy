//Dada la ecuación ax^2 +bx +c = 0
//La determinante ∆ es b^2 - 4ac

def calculoDeDiscriminante(a, b, c){
  (b*b) - (4*a*c)
}
println "Dado 1x^2 + 16x + 64 => ∆ = ${calculoDeDiscriminante}"

def unaSolucion(a,b,c){
  def d = calculoDeDiscriminante (a,b,c){
    if(d < 0)
      throw new RuntimeException('No tiene solucion'))
    ((-1*b) + Math.sqrt(d)) / (2*a)
  }

  println "Dado 1x^2 + 16x + 64 => x1 = ${unaSolucion(1,16,64)}"
}

//Closures con simples llamadas a funciones