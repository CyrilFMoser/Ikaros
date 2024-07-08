package Program_2 

 object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E](a: CC_A[Boolean, E]) extends T_A[T_A[(Int,Boolean), Int], E]

val v_a: T_A[T_A[(Int,Boolean), Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_B(CC_A()) => 2 
}
}