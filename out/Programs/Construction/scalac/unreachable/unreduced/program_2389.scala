package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_A[E]) extends T_A[E]
case class CC_C[F](a: Byte) extends T_A[F]
case class CC_D[G](a: G) extends T_B[T_B[CC_A[Boolean], T_A[Int]], G]
case class CC_E[H]() extends T_B[T_B[CC_A[Boolean], T_A[Int]], H]
case class CC_F[I]() extends T_B[T_B[CC_A[Boolean], T_A[Int]], I]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, CC_A())) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_C(_))) => 4 
  case CC_B(_, CC_C(0)) => 5 
  case CC_B(_, CC_C(_)) => 6 
}
}
// This is not matched: CC_C(_)