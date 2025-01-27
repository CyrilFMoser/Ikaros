package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[T_B]], c: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: Byte, b: T_A[T_B]) extends T_B
case class CC_D(a: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _))) => 1 
  case CC_B(CC_C(_, CC_A(_, _, _))) => 2 
  case CC_B(CC_D(CC_A(_, _, _))) => 3 
  case CC_C(_, CC_A(_, _, _)) => 4 
  case CC_D(CC_A(_, _, _)) => 5 
}
}
// This is not matched: CC_B(CC_B(CC_D(_)))