package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[CC_A[Byte], T_A[CC_A[Byte], CC_A[Byte]]]) extends T_A[Int, T_A[Int, Int]]
case class CC_C[D]() extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_C()) => 2 
}
}
// This is not matched: CC_C()