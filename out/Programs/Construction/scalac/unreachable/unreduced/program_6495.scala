package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[Char, C]) extends T_A[Char, C]
case class CC_B(a: T_A[(T_B,Boolean), CC_A[T_B]]) extends T_A[Char, CC_A[Int]]
case class CC_C(a: T_A[T_A[CC_B, CC_B], Byte]) extends T_A[Char, CC_A[Int]]
case class CC_D(a: T_A[Char, Int]) extends T_B
case class CC_E(a: T_A[T_A[Char, CC_C], T_A[CC_D, Int]]) extends T_B
case class CC_F(a: CC_E, b: T_A[CC_D, CC_E]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_A(_))) => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_F(_, _)