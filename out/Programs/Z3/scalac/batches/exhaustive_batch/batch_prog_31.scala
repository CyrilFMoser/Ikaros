package Program_31 

 object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[E, E], E]
case class CC_B(a: CC_A[Char]) extends T_B[CC_A[Boolean], Int]

val v_a: T_B[CC_A[Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B(CC_A()) => 1 
}
}