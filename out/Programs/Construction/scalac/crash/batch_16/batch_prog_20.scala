package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[D]]
case class CC_B[E]() extends T_A[E, T_B[E]]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}