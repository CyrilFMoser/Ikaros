package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_D(a: Char) extends T_B[T_A]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
}
}
// This is not matched: (CC_A Int Int Wildcard (T_A (Tuple Int Int) Int))