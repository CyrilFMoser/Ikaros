package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[(Char,Int)], c: T_A[T_A[Char]]) extends T_A[(T_A[Char],T_A[Int])]
case class CC_B[B]() extends T_A[(T_A[Char],T_A[Int])]
case class CC_C(a: CC_B[Char], b: CC_B[Char], c: (CC_A,CC_B[CC_A])) extends T_A[(T_A[Char],T_A[Int])]

val v_a: T_A[(T_A[Char],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}