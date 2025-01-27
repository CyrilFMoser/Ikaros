package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]]) extends T_A[T_B[T_A[Char]]]
case class CC_B() extends T_A[T_B[T_A[Char]]]
case class CC_C(a: CC_A, b: T_A[T_B[CC_A]]) extends T_A[T_B[T_A[Char]]]
case class CC_D[C](a: CC_C, b: Char, c: T_A[C]) extends T_B[C]
case class CC_E[D](a: D, b: D) extends T_B[D]
case class CC_F[E]() extends T_B[E]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(true, _) => 1 
  case CC_E(false, _) => 2 
  case CC_F() => 3 
}
}