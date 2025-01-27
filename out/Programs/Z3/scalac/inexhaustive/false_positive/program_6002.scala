package Program_13 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[Char], c: T_A[Char]) extends T_A[T_A[(Boolean,Byte)]]
case class CC_B[B](a: T_A[B], b: Int) extends T_A[T_A[(Boolean,Byte)]]

val v_a: T_A[T_A[(Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_B(CC_A(_, _, _), 12) => 2 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A (T_A (Tuple Boolean Byte))))
// This is not matched: Pattern match is empty without constants