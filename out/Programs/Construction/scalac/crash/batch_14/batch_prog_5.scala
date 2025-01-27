package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C]) extends T_A[C, D]
case class CC_B[F, E](a: T_A[E, E]) extends T_A[F, E]
case class CC_C[G](a: T_A[G, G], b: T_A[G, G]) extends T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]], G]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}