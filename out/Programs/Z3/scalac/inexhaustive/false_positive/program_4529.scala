package Program_10 

object Test {
sealed trait T_B[C, D]
case class CC_D[K, L](a: K) extends T_B[K, L]

val v_a: CC_D[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_A Wildcard (CC_C Char (T_A Char)) (T_A Char)) (T_A Char))