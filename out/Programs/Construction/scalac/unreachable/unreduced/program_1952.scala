package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Char, b: T_A[D, CC_A[D]], c: (T_A[Char, Boolean],T_A[(Int,Char), Char])) extends T_A[D, T_A[D, D]]
case class CC_C[E]() extends T_A[E, CC_A[CC_A[E]]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, (_,_))) => 1 
  case CC_B(_, _, _) => 2 
}
}