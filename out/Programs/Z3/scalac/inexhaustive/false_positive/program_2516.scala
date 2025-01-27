package Program_30 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[C], b: C, c: Char) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Char T_B Wildcard Wildcard Wildcard (T_A Char))
// This is not matched: Pattern match is empty without constants