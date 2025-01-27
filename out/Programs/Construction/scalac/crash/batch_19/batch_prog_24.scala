package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}