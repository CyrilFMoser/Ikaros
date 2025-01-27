package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_A, b: Byte, c: T_B[Int]) extends T_A
case class CC_D(a: CC_A, b: Byte, c: T_A) extends T_B[CC_C]
case class CC_E(a: T_B[T_B[CC_C]], b: T_A) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, CC_A(CC_A(_, _), _)) => 1 
  case CC_E(_, CC_A(CC_B(_), _)) => 2 
  case CC_E(_, CC_A(CC_C(_, _, _), _)) => 3 
  case CC_E(_, CC_C(CC_A(_, _), _, _)) => 4 
}
}
// This is not matched: CC_E(_, CC_B(_))