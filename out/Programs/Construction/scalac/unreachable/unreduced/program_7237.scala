package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[CC_A]], c: T_A) extends T_A
case class CC_C(a: T_B[CC_A], b: T_A, c: CC_A) extends T_A
case class CC_D(a: Byte, b: CC_A, c: T_B[T_B[CC_C]]) extends T_B[T_B[CC_C]]
case class CC_E(a: T_A) extends T_B[T_B[CC_C]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)