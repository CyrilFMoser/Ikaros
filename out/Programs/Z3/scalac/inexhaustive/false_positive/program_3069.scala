package Program_15 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B(a: T_A[Char]) extends T_A[T_A[Boolean]]
case class CC_C(a: CC_B, b: Char, c: T_A[CC_B]) extends T_A[T_A[CC_B]]

val v_a: T_A[T_A[CC_B]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, 'x', _) => 1 
  case CC_C(CC_B(_), _, _) => 2 
}
}
// This is not matched: (CC_A (T_A (CC_B (T_A Boolean) (T_A (T_A Boolean))))
//      Boolean
//      (T_A (T_A (CC_B (T_A Boolean) (T_A (T_A Boolean))))))
// This is not matched: (CC_B Char Wildcard (T_A Char))