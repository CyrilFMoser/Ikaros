package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (Boolean,(T_B,T_B))) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_A[Byte], b: T_B, c: Int) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: CC_B, b: T_B, c: CC_B) extends T_B
case class CC_D(a: CC_C, b: T_B, c: T_A[CC_B]) extends T_B
case class CC_E(a: T_A[Char], b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_D(_, _, _)