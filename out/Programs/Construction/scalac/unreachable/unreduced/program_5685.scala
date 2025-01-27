package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,(T_A,T_A)), b: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B[C](a: T_B[C, C], b: Char, c: T_B[C, CC_A]) extends T_B[C, CC_A]
case class CC_C[D](a: T_B[D, CC_A]) extends T_B[D, CC_A]

val v_a: T_B[Byte, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B(_, _, CC_C(_))) => 1 
  case CC_C(CC_C(CC_B(_, _, _))) => 2 
  case CC_C(CC_C(CC_C(_))) => 3 
}
}
// This is not matched: CC_C(CC_B(_, _, CC_B(_, _, _)))