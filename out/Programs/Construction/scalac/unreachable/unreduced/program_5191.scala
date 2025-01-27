package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[(Int,Int)]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Int) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_A, b: CC_B) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(0, _), CC_B(12)) => 2 
  case CC_C(CC_A(0, _), CC_B(_)) => 3 
  case CC_C(CC_A(_, _), CC_B(12)) => 4 
}
}
// This is not matched: CC_C(CC_A(_, _), CC_B(_))