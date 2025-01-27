package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_A[E, E]], b: T_A[E, (Char,Byte)], c: E) extends T_A[E, T_A[E, E]]
case class CC_B(a: T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]]) extends T_A[CC_A[CC_A[Byte]], T_A[CC_A[CC_A[Byte]], CC_A[CC_A[Byte]]]]
case class CC_C[F](a: T_B[F, F]) extends T_A[F, T_A[F, F]]
case class CC_D[G, H](a: T_A[G, G]) extends T_B[H, G]
case class CC_E[I, J]() extends T_B[I, J]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_D(_)) => 0 
  case CC_C(CC_E()) => 1 
}
}