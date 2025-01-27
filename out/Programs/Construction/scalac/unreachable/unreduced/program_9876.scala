package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: Char) extends T_B
case class CC_D(a: Byte) extends T_B
case class CC_E(a: CC_C, b: CC_A, c: CC_B) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_), CC_C(_)) => 0 
  case CC_A(_, CC_D(_), CC_C(_)) => 1 
  case CC_A(_, CC_E(_, _, CC_B(_)), CC_C(_)) => 2 
  case CC_A(_, CC_C(_), CC_D(_)) => 3 
  case CC_A(_, CC_D(_), CC_D(_)) => 4 
  case CC_A(_, CC_E(_, _, CC_B(_)), CC_D(_)) => 5 
  case CC_A(_, CC_D(_), CC_E(CC_C(_), _, _)) => 6 
  case CC_A(_, CC_E(_, _, CC_B(_)), CC_E(CC_C(_), _, _)) => 7 
  case CC_B(_) => 8 
}
}
// This is not matched: CC_A(_, CC_C(_), CC_E(CC_C(_), _, _))