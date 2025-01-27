package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (Int,T_B), b: Char, c: T_A[T_B]) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: CC_A, b: CC_A, c: T_A[T_A[T_B]]) extends T_B
case class CC_C(a: CC_B, b: CC_A, c: CC_A) extends T_B
case class CC_D(a: T_B, b: CC_C, c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(CC_B(_, CC_A(_, _, _), _), _, _) => 2 
  case CC_D(CC_D(_, _, _), _, _) => 3 
}
}
// This is not matched: CC_D(CC_C(_, _, _), _, _)