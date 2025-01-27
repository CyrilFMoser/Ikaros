package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean, b: T_A[Int, Int], c: T_A[Int, Boolean]) extends T_A[T_A[Int, Byte], (Boolean,Byte)]
case class CC_B(a: Char, b: Boolean, c: T_A[Boolean, CC_A]) extends T_A[T_A[Int, Byte], (Boolean,Byte)]
case class CC_C[C](a: CC_A) extends T_A[T_A[Int, Byte], (Boolean,Byte)]

val v_a: T_A[T_A[Int, Byte], (Boolean,Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B('x', _, _) => 3 
}
}
// This is not matched: (CC_C Boolean Wildcard (T_A (T_A Int Byte) (Tuple Boolean Byte)))
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (T_A Int Byte) (Tuple Boolean Byte)))