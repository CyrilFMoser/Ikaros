package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_A[(Byte,Char), (Boolean,Byte)]]
case class CC_C[G, F]() extends T_A[F, G]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A Boolean))