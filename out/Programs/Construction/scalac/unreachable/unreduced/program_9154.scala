package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_B[CC_A]
case class CC_C(a: T_B[CC_A], b: T_B[CC_A], c: Byte) extends T_B[CC_A]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, CC_A(_, _, _)), _) => 0 
  case CC_C(_, CC_C(_, CC_B(_, _), 0), _) => 1 
  case CC_C(_, CC_C(_, CC_B(_, _), _), _) => 2 
  case CC_C(_, CC_C(_, CC_C(_, _, _), 0), _) => 3 
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), _) => 4 
}
}