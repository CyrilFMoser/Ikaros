package Program_31 

object Test {
sealed trait T_B[B, C]
case class CC_C[E, F](a: E) extends T_B[E, F]

val v_a: CC_C[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard (T_A Char Boolean))