package Program_18 

object Test {
sealed trait T_B[B, C]
case class CC_C[D, E](a: Int, b: Char, c: T_B[E, E]) extends T_B[E, D]
case class CC_D[G, F]() extends T_B[F, G]

val v_a: CC_C[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A Boolean))