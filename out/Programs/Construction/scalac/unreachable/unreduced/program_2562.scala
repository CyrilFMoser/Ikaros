package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[Boolean]) extends T_A[T_A[Boolean]]
case class CC_B(a: CC_A, b: Byte, c: CC_A) extends T_A[T_A[Boolean]]
case class CC_C(a: Int, b: CC_B) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), 0, _) => 1 
  case CC_B(CC_A(_, _), _, _) => 2 
  case CC_C(_, CC_B(_, 0, _)) => 3 
}
}
// This is not matched: CC_C(_, CC_B(_, _, _))