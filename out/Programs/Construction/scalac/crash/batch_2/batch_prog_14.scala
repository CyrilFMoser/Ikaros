package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B[B]() extends T_B[B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}