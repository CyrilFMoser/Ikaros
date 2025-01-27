package Program_28 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: Char, b: Boolean) extends T_A[D, C]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A('x', _) => 1 
}
}
// This is not matched: (CC_A Int Boolean Boolean Wildcard Wildcard (T_A Int Boolean))
// This is not matched: Pattern match is empty without constants