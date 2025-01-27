package Program_14 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: B) extends T_A[B]
case class CC_B[C, D](a: C, b: T_A[D], c: T_A[C]) extends T_A[C]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, CC_A(_, _)) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(_, CC_B(_, _, _), _) => 3 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 4 
  case CC_B(_, CC_B(_, _, _), CC_A(_, _)) => 5 
}
}
// This is not matched: (CC_B Boolean
//      Boolean
//      Wildcard
//      (CC_A Boolean Boolean Wildcard (T_A Boolean))
//      Wildcard
//      (T_A Boolean))
// This is not matched: (CC_C Wildcard T_A)