package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[Boolean]) extends T_A[Char]
case class CC_B() extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_A (CC_B Wildcard (T_A Int)) (CC_A Wildcard Wildcard (T_A Int)) (T_A Int))