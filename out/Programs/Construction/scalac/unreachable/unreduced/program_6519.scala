package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Char, c: T_B[T_B[T_A]]) extends T_A
case class CC_B() extends T_B[CC_A]
case class CC_C(a: CC_B, b: T_B[CC_A], c: T_B[T_B[T_A]]) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), CC_C(_, _, _), _) => 1 
}
}
// This is not matched: CC_C(CC_B(), CC_B(), _)