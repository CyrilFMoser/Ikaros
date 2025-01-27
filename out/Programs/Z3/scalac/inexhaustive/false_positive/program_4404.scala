package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: (T_A,T_A)) extends T_B[Char]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, (CC_B(),_)) => 0 
}
}
// This is not matched: (CC_A (T_A Int Int) Int Wildcard Wildcard Wildcard (T_A Int (T_A Int Int)))