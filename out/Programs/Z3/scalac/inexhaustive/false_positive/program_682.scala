package Program_31 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: Int, b: Int) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_A, b: T_B[C], c: CC_A[C]) extends T_B[C]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), CC_C(_, _, _), _) => 0 
  case CC_C(CC_A(_, _), CC_C(_, _, _), CC_A(_, _)) => 1 
  case CC_C(CC_B(), CC_C(_, _, _), CC_A(_, _)) => 2 
}
}
// This is not matched: (CC_C (CC_B (T_B (T_B T_A)))
//      (CC_A T_A Wildcard Wildcard T_A)
//      Wildcard
//      Wildcard
//      (T_B (CC_B (T_B (T_B T_A)))))
// This is not matched: Pattern match is empty without constants