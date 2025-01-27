package Program_14 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Char, b: T_A[D, D], c: D) extends T_A[T_A[Boolean, (Char,Char)], C]
case class CC_B(a: CC_A[Int, (Byte,Int)]) extends T_A[T_A[Boolean, (Char,Char)], CC_A[Boolean, Int]]

val v_a: T_A[T_A[Boolean, (Char,Char)], Byte] = null
val v_b: Int = v_a match{
  case CC_A('x', _, _) => 0 
  case CC_A('x', CC_A(_, _, _), _) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B (T_A Byte))