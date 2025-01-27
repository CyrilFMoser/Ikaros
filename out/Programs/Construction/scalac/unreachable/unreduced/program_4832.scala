package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C(a: T_B[T_B[Boolean]], b: CC_A, c: CC_A) extends T_B[CC_A]
case class CC_D(a: CC_A) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_B(0), _) => 1 
  case CC_A(CC_B(_), _) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: CC_A(CC_A(CC_B(_), _), _)