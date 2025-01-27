package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E]() extends T_A[E, CC_A[E, E]]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}