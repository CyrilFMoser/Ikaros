package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[Char, E], b: T_A[E, E]) extends T_A[E, T_B[T_B[Boolean, Int], Byte]]
case class CC_B[F]() extends T_A[F, T_B[T_B[Boolean, Int], Byte]]
case class CC_C[G]() extends T_A[G, T_B[T_B[Boolean, Int], Byte]]
case class CC_D[H, I](a: T_B[I, I], b: I) extends T_B[H, I]

val v_a: T_A[Char, T_B[T_B[Boolean, Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _), _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}