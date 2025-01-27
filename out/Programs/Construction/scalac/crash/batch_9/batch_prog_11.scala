package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[T_A[T_A[Int, (Int,Int)], T_A[Byte, Char]], C]
case class CC_B(a: T_A[Char, T_A[Char, Int]], b: T_A[CC_A[Boolean], CC_A[Byte]]) extends T_A[T_A[T_A[Int, (Int,Int)], T_A[Byte, Char]], Int]

val v_a: T_A[T_A[T_A[Int, (Int,Int)], T_A[Byte, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: CC_B(_, _)