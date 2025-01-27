package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B, c: T_B) extends T_A[C, T_A[T_A[T_B, T_B], T_A[T_B, T_B]]]
case class CC_B[D](a: T_B, b: CC_A[D]) extends T_A[D, T_A[T_A[T_B, T_B], T_A[T_B, T_B]]]
case class CC_C(a: Char, b: CC_A[CC_B[T_B]], c: T_A[T_B, CC_A[T_B]]) extends T_B
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: CC_B[Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E(CC_B(_, CC_A(_, _, _))) => 1 
}
}
// This is not matched: CC_D(CC_C(_, _, _))