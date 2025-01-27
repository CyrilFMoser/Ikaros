package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B) extends T_A[T_B, C]
case class CC_B[D](a: D) extends T_A[T_B, D]
case class CC_C[E]() extends T_A[T_B, E]
case class CC_D(a: T_A[CC_A[T_B], Int], b: Char, c: (CC_C[T_B],(Int,T_B))) extends T_B

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)