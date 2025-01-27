package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[CC_A], b: T_A[Char]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A Boolean)))