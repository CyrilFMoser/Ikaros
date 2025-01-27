package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Byte], b: T_A[T_A[Char]], c: T_B[Int]) extends T_A[T_B[Char]]
case class CC_B() extends T_A[T_B[Char]]
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: CC_C[D], b: T_B[D]) extends T_B[D]
case class CC_E[E](a: CC_A, b: Byte, c: E) extends T_B[E]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(), CC_C()) => 0 
  case CC_D(CC_C(), CC_D(_, _)) => 1 
  case CC_D(CC_C(), CC_E(_, _, _)) => 2 
  case CC_E(CC_A(_, _, _), 0, _) => 3 
  case CC_E(CC_A(_, _, _), _, _) => 4 
}
}
// This is not matched: CC_C()