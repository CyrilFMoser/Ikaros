package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, Int], Char], b: T_A[C, C], c: C) extends T_A[C, Int]
case class CC_B[D](a: Byte) extends T_A[D, Int]
case class CC_C[E]() extends T_A[E, Int]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 0) => 0 
  case CC_A(_, _, _) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_B(_)