package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: Int) extends T_A[T_A[T_B]]
case class CC_C(a: T_A[T_A[T_B]], b: CC_A, c: Boolean) extends T_B
case class CC_D(a: T_A[Char], b: CC_B) extends T_B
case class CC_E(a: T_A[T_A[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), CC_A(_), _) => 0 
  case CC_C(CC_B(_), CC_A(_), _) => 1 
  case CC_D(_, _) => 2 
  case CC_E(CC_B(_)) => 3 
}
}
// This is not matched: CC_E(CC_A(_))