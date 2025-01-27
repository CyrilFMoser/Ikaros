package Program_30 

object Test {
sealed trait T_B[C, D]
case class CC_D[K](a: (Byte,Char)) extends T_B[T_B[Int, Boolean], K]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D((0,_)) => 0 
}
}
// This is not matched: (CC_B Char Wildcard (T_A Char))