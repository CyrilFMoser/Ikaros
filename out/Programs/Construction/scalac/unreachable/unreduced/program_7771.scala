package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[T_B]], b: Char) extends T_A[T_A[T_B]]
case class CC_C(a: CC_B, b: T_A[T_A[CC_B]], c: T_A[T_A[CC_B]]) extends T_B
case class CC_D(a: T_A[T_A[T_B]]) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, CC_C(_, _, _)), _) => 1 
  case CC_B(CC_A(_, CC_D(_)), _) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _), _), _)