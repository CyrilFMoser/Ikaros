package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,T_A)], b: T_A, c: T_B[Boolean]) extends T_A
case class CC_B(a: Char, b: Int) extends T_B[T_A]
case class CC_C(a: T_A) extends T_B[T_A]
case class CC_D(a: CC_A, b: CC_B) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_A(_, _, _), _)) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)