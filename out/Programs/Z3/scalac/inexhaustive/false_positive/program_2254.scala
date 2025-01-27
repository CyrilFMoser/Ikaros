package Program_30 

object Test {
sealed trait T_B[A, B]
case class CC_B[D, C](a: C) extends T_B[D, C]

val v_a: CC_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Wildcard
//      Wildcard
//      (Tuple (CC_B Wildcard (CC_A Wildcard T_A) Wildcard T_A) Wildcard)
//      T_A)