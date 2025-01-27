package Program_31 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A, c: (T_A,T_A)) extends T_A
case class CC_B[B](a: T_A, b: T_B[B]) extends T_B[B]
case class CC_C[C, D]() extends T_B[C]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(CC_A(_, _, _), CC_C()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C()) => 3 
}
}
// This is not matched: (CC_C (CC_A T_A T_A (T_B T_A) T_A) T_A (T_B (CC_A T_A T_A (T_B T_A) T_A)))
// This is not matched: Pattern match is empty without constants