package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Char]]) extends T_A[T_B[T_B[Char]]]
case class CC_B[C](a: C, b: Byte) extends T_B[C]
case class CC_C[D](a: T_B[D], b: T_A[D]) extends T_B[D]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(CC_B(_, _), _)) => 0 
  case CC_A(CC_C(CC_B(_, _), _)) => 1 
  case CC_A(CC_C(CC_C(_, _), _)) => 2 
}
}
// This is not matched: CC_A(CC_B(CC_C(_, _), _))