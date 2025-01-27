package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[E, D]
case class CC_B[G, F](a: T_A[F, F], b: G, c: T_A[F, G]) extends T_A[G, F]

val v_a: CC_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}