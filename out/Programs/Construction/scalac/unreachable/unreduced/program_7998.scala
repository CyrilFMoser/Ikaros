package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[CC_A], b: CC_A) extends T_A[T_A[Boolean]]
case class CC_C(a: CC_B, b: Byte, c: T_A[T_A[CC_B]]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(CC_A(_))) => 1 
  case CC_B(_, CC_A(CC_C(_, _, _))) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_B(_, CC_A(CC_B(_, _)))