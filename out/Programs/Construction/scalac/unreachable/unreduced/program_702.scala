package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Int],(Int,Int)), b: Int, c: C) extends T_A[(T_A[Int, Boolean],T_A[Int, Boolean]), C]
case class CC_B[D](a: CC_A[D], b: CC_A[D], c: CC_A[D]) extends T_A[(T_A[Int, Boolean],T_A[Int, Boolean]), D]
case class CC_C[E]() extends T_A[(T_A[Int, Boolean],T_A[Int, Boolean]), E]

val v_a: T_A[(T_A[Int, Boolean],T_A[Int, Boolean]), Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _, _)