package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: CC_A, b: Byte, c: T_B[T_B[Char]]) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D(a: CC_C) extends T_B[CC_B]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), _) => 0 
  case CC_C(CC_C(_, _), _) => 1 
}
}
// This is not matched: CC_C(CC_A(_), _)