package Program_15 

object Test {
sealed trait T_B[C]
case class CC_C[F](a: Int) extends T_B[F]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard (T_A Char Boolean))