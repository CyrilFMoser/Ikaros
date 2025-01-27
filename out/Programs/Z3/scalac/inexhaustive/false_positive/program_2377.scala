package Program_30 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Byte], c: T_A[(Int,Boolean)]) extends T_A[T_A[Boolean]]
case class CC_B(a: Byte, b: CC_A, c: Int) extends T_A[T_A[CC_A]]
case class CC_C[B](a: CC_A, b: CC_B) extends T_A[T_A[CC_A]]

val v_a: T_A[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_B(0, CC_A(_, _, _), 12) => 1 
  case CC_C(CC_A(_, _, _), _) => 2 
  case CC_C(CC_A(_, _, _), CC_B(_, _, _)) => 3 
  case CC_C(_, _) => 4 
}
}
// This is not matched: (CC_C Boolean
//      Wildcard
//      Wildcard
//      (T_A (T_A (CC_A Boolean (T_A Boolean) Boolean Boolean))))
// This is not matched: Pattern match is empty without constants