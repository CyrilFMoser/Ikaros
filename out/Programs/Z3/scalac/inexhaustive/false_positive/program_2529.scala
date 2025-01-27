package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: C, c: T_A[C, D]) extends T_A[C, T_A[Boolean, Int]]
case class CC_B(a: Int, b: T_A[(Byte,Byte), Byte], c: CC_A[Boolean, (Boolean,Char)]) extends T_A[Boolean, T_A[Boolean, Int]]
case class CC_C(a: CC_A[Int, CC_B]) extends T_A[Boolean, T_A[Boolean, Int]]

val v_a: T_A[T_A[Boolean, T_A[Boolean, Int]], T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _, _), CC_A(_, _, _)) => 1 
  case CC_A(_, CC_B(_, _, _), _) => 2 
  case CC_A(_, CC_C(_), _) => 3 
  case CC_A(_, _, CC_A(_, _, _)) => 4 
}
}
// This is not matched: (CC_A (T_A Boolean (T_A Boolean Int))
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_A Boolean (T_A Boolean Int)) (T_A Boolean Int)))
// This is not matched: (CC_B Int Wildcard (T_A (Tuple Int Int) Int))