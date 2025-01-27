package Program_15 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[Boolean]) extends T_A[T_A[Int]]
case class CC_B[B, C](a: T_A[C], b: Boolean, c: (CC_A,CC_A)) extends T_A[B]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), _) => 0 
  case CC_B(CC_A(_, _), _, (CC_A(_, _),CC_A(_, _))) => 1 
  case CC_B(CC_A(_, _), _, _) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: (CC_A (CC_B Byte Boolean Wildcard Boolean Wildcard (T_A Byte))
//      Wildcard
//      (T_A (T_A Int)))
// This is not matched: (CC_B (CC_C (CC_A Wildcard Wildcard Wildcard T_A) Wildcard Wildcard T_A)
//      Wildcard
//      T_A)