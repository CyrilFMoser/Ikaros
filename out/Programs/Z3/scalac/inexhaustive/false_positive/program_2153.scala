package Program_31 

object Test {
sealed trait T_B[B, C]
case class CC_D[H, G](a: (Char,Char)) extends T_B[G, H]

val v_a: CC_D[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_D(('x',_)) => 0 
}
}
// This is not matched: (CC_A T_A)