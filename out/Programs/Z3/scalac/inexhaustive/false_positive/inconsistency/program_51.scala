package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_B(a: T_B[Char], b: T_B[T_A]) extends T_B[Char]
case class CC_C() extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(CC_B(CC_B(_, _), _), _) => 1 
}
}
// This is not matched: (CC_B Boolean
//      (CC_B Boolean (CC_B Boolean Wildcard (T_A Boolean)) (T_A Boolean))
//      (T_A Boolean))