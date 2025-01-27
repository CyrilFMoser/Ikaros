package Program_13 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C, D](a: T_A[D], b: Int) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(_, _), _) => 1 
  case CC_B(_, 12) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: (CC_B Char Boolean Wildcard Wildcard (T_A Char))
// This is not matched: Pattern match is empty without constants