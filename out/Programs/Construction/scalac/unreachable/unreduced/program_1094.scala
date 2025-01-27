package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: Int, c: T_B[E, E]) extends T_A[T_A[T_B[Boolean, Boolean], T_A[Int, Boolean]], E]
case class CC_B[F](a: CC_A[F], b: F, c: T_B[F, CC_A[F]]) extends T_A[T_A[T_B[Boolean, Boolean], T_A[Int, Boolean]], F]
case class CC_C[G](a: Int, b: Int) extends T_A[T_A[T_B[Boolean, Boolean], T_A[Int, Boolean]], G]
case class CC_D[H]() extends T_B[(T_B[Int, Boolean],Boolean), H]
case class CC_E[I](a: CC_B[I], b: T_A[I, I]) extends T_B[(T_B[Int, Boolean],Boolean), (CC_A[Byte],Boolean)]

val v_a: T_A[T_A[T_B[Boolean, Boolean], T_A[Int, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}