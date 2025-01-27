package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[T_A[D, D], D]]
case class CC_B[E](a: T_B[E], b: CC_A[E]) extends T_A[E, T_A[T_A[E, E], E]]
case class CC_C[F](a: ((Boolean,Int),T_A[Byte, Char])) extends T_A[F, T_A[T_A[F, F], F]]
case class CC_D[G](a: G) extends T_B[G]
case class CC_E[H](a: Char, b: CC_C[H]) extends T_B[H]

val v_a: T_A[Boolean, T_A[T_A[Boolean, Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(_), CC_A()) => 1 
  case CC_B(CC_E(_, CC_C(_)), CC_A()) => 2 
  case CC_C(((_,_),_)) => 3 
}
}