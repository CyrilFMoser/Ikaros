package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, D]) extends T_A[T_B[T_A[Int, Int]], D]
case class CC_B[E](a: T_A[E, E]) extends T_B[E]
case class CC_C(a: T_B[T_B[(Char,Byte)]], b: Int, c: CC_B[CC_A[Int]]) extends T_B[(T_B[Boolean],CC_A[Int])]
case class CC_D(a: T_A[CC_A[(Char,Boolean)], Byte], b: CC_C) extends T_B[(T_B[Boolean],CC_A[Int])]

val v_a: T_B[(T_B[Boolean],CC_A[Int])] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_D(_, _)