package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, E], b: T_A[D, D], c: T_A[E, T_A[E, Char]]) extends T_A[E, D]
case class CC_B[F, G](a: G) extends T_A[F, G]
case class CC_C[H, I](a: T_A[H, I], b: H) extends T_A[H, I]
case class CC_D(a: Char) extends T_B[Boolean]
case class CC_E(a: CC_A[(Boolean,CC_D), Boolean], b: T_B[T_A[Boolean, CC_D]]) extends T_B[Boolean]
case class CC_F() extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
  case CC_D(_) => 1 
  case CC_E(_, _) => 2 
  case CC_F() => 3 
}
}