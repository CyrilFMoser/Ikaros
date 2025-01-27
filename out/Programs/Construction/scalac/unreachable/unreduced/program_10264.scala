package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Char]], C]
case class CC_B[D](a: CC_A[D], b: (T_A[Int, Char],((Int,Char),Boolean))) extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Char]], D]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Boolean, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}