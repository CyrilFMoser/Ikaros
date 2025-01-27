package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[T_B[Boolean]]) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: CC_B, b: T_A, c: T_A) extends T_B[(T_A,CC_B)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_B(_, CC_B(CC_A(_, _), _)) => 2 
  case CC_B(_, CC_B(CC_B(_, _), _)) => 3 
}
}