package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: Char, b: T_A, c: T_B[C, C]) extends T_A
case class CC_B(a: Int, b: T_B[T_B[Char, T_A], Byte], c: T_B[CC_A[(Char,Boolean)], T_B[T_A, T_A]]) extends T_A
case class CC_C[D]() extends T_B[CC_A[T_A], D]
case class CC_D() extends T_B[CC_A[T_A], T_A]
case class CC_E(a: T_A, b: CC_A[Int], c: T_A) extends T_B[CC_A[T_A], T_B[CC_A[T_A], T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _, _), _) => 1 
}
}
// This is not matched: CC_B(_, _, _)