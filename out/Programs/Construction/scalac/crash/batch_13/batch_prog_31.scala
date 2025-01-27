package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, T_A], (T_A,T_A)], c: Boolean) extends T_A
case class CC_B[D, C](a: T_B[C, C], b: T_B[D, D], c: CC_A) extends T_B[C, D]
case class CC_C[F, E](a: T_B[E, E]) extends T_B[F, E]
case class CC_D[G, H](a: T_B[G, G]) extends T_B[H, G]

val v_a: CC_D[CC_A, Char] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
}
}