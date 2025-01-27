package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_B, C]
case class CC_B(a: CC_A[T_A[T_B, T_B]]) extends T_B
case class CC_C(a: T_A[(T_B,CC_B), T_A[T_B, Int]], b: CC_A[(CC_B,Byte)]) extends T_B
case class CC_D(a: CC_A[CC_C], b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_A(_)) => 1 
  case CC_D(_, CC_B(_)) => 2 
  case CC_D(_, CC_C(_, _)) => 3 
}
}
// This is not matched: CC_D(_, CC_D(_, _))