package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B() extends T_A
case class CC_D() extends T_B[T_B[T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), _) => 1 
}
}
// This is not matched: (CC_A Boolean Boolean Boolean Wildcard Wildcard (T_A Boolean Boolean))