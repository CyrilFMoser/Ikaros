package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: T_A[C], b: T_A[C]) extends T_A[C]
case class CC_C(a: T_A[T_B], b: Int, c: CC_A[T_B]) extends T_B
case class CC_D(a: CC_C, b: T_A[CC_C]) extends T_B
case class CC_E[D](a: T_A[D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_A()) => 0 
  case CC_E(_) => 1 
  case CC_C(CC_A(), 12, _) => 2 
  case CC_C(_, _, CC_A()) => 3 
  case CC_C(_, 12, _) => 4 
  case CC_C(_, _, _) => 5 
  case CC_C(CC_A(), _, CC_A()) => 6 
  case CC_D(CC_C(_, _, _), CC_B(_, _)) => 7 
  case CC_D(_, CC_A()) => 8 
}
}
// This is not matched: (CC_E T_B Wildcard T_B)
// This is not matched: Pattern match is empty without constants