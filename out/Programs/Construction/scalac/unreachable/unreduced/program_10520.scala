package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, Boolean], Byte]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: T_A, c: T_A) extends T_B[Char, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_B() => 2 
}
}
// This is not matched: CC_A(CC_A(CC_B(), _), _)