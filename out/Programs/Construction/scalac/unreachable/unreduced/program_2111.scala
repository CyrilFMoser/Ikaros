package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Byte, Int], T_A[Byte]], b: T_B[T_A[Int], T_A[Char]], c: T_B[T_B[Char, Byte], Char]) extends T_A[T_A[T_A[(Byte,Int)]]]
case class CC_B(a: T_A[CC_A], b: Char, c: T_B[T_B[CC_A, CC_A], T_A[CC_A]]) extends T_A[T_A[T_A[(Byte,Int)]]]
case class CC_C(a: T_B[Byte, Int]) extends T_A[T_A[T_A[(Byte,Int)]]]

val v_a: T_A[T_A[T_A[(Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_)