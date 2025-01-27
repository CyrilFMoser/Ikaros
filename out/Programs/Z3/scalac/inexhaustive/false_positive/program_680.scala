package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Boolean, b: Byte) extends T_A[T_A[(Boolean,Char), Char], C]
case class CC_B[E]() extends T_A[E, CC_A[Int, (Char,Byte)]]

val v_a: T_A[T_A[(Boolean,Char), Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A (T_A (Tuple Boolean Char) Char) Char))
// This is not matched: Pattern match is empty without constants