package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: (T_A[T_B],T_B), c: T_B) extends T_A[T_B]
case class CC_C() extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: T_A[CC_B]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (CC_A(_),CC_D(_)), _) => 1 
  case CC_B(_, (CC_B(_, _, _),CC_D(_)), _) => 2 
  case CC_B(_, (CC_B(_, _, _),CC_E()), _) => 3 
}
}
// This is not matched: CC_B(_, (CC_A(_),CC_E()), _)