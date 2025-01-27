package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_B[E, E]) extends T_B[(T_A[Boolean],Int), E]
case class CC_C[F]() extends T_B[(T_A[Boolean],Int), F]
case class CC_D[G](a: CC_C[CC_C[G]]) extends T_B[(T_A[Boolean],Int), G]

val v_a: T_B[(T_A[Boolean],Int), Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C()