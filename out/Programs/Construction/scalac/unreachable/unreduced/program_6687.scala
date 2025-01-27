package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_A[T_A[T_B]], c: Boolean) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_B], b: T_B) extends T_A[T_A[T_B]]
case class CC_C(a: Byte, b: T_A[T_A[T_B]]) extends T_B
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: CC_B, b: T_A[CC_C], c: CC_A) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _, _), _), _, _) => 0 
  case CC_A(CC_A(_, CC_B(_, _), _), _, _) => 1 
  case CC_A(CC_B(_, CC_C(_, _)), _, _) => 2 
  case CC_A(CC_B(_, CC_D(_)), _, _) => 3 
  case CC_A(CC_B(_, CC_E(_, _, _)), _, _) => 4 
  case CC_B(_, CC_C(_, _)) => 5 
  case CC_B(_, CC_D(CC_C(_, _))) => 6 
  case CC_B(_, CC_E(CC_B(_, _), _, _)) => 7 
}
}