package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[Boolean, Char], Char]
case class CC_B(a: (Boolean,Int), b: CC_A[Char]) extends T_A[CC_A[Byte], T_A[Boolean, Char]]

val v_a: T_A[T_A[Boolean, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Boolean Char) Char))
// This is not matched: Pattern match is empty without constants