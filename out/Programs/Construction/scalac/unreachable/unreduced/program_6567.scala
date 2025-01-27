package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char], b: T_A[T_A[Char]], c: T_A[Char]) extends T_A[Char]
case class CC_B[C](a: T_A[Char], b: T_A[Char]) extends T_B[C]
case class CC_C[D]() extends T_B[D]

val v_a: T_B[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_C() => 1 
}
}