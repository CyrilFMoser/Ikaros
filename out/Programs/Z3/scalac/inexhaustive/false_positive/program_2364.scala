package Program_30 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C, D](a: CC_A[C], b: C) extends T_A[C]
case class CC_C(a: CC_A[Boolean], b: CC_B[(Char,Int), Char]) extends T_A[CC_A[Boolean]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(_, 'x') => 2 
}
}
// This is not matched: (CC_B Char (CC_A Boolean Boolean) Wildcard Char (T_A Char))
// This is not matched: Pattern match is empty without constants