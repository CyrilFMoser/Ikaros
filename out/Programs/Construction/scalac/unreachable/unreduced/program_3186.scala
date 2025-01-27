package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Int, c: C) extends T_A[T_A[T_A[Char, (Int,Int)], T_A[Int, Boolean]], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[T_A[Char, (Int,Int)], T_A[Int, Boolean]], D]
case class CC_C[E](a: CC_A[E], b: Byte, c: CC_B[E]) extends T_A[T_A[T_A[Char, (Int,Int)], T_A[Int, Boolean]], E]

val v_a: T_A[T_A[T_A[Char, (Int,Int)], T_A[Int, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}