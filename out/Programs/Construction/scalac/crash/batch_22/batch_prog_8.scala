package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}