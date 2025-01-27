package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C, b: T_A, c: T_B[Int, C]) extends T_A
case class CC_B(a: T_B[T_A, T_A], b: T_B[T_B[(Char,Boolean), Boolean], CC_A[Byte]], c: T_B[CC_A[(Boolean,Int)], CC_A[T_A]]) extends T_A
case class CC_C() extends T_A
case class CC_D[D](a: CC_B, b: CC_B, c: T_B[CC_C, D]) extends T_B[CC_C, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _, _)