package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Int]
case class CC_B[D](a: T_A[D, Int], b: D, c: T_A[D, D]) extends T_A[D, Int]
case class CC_C[E]() extends T_A[E, Int]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(CC_B(_, _, _), _, _) => 2 
  case CC_B(CC_C(), _, _) => 3 
  case CC_C() => 4 
}
}