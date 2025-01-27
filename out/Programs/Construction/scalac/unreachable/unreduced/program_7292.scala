package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[Int, D]
case class CC_B[E]() extends T_A[Int, E]
case class CC_C(a: Int, b: T_A[(Char,Char), Boolean], c: CC_A[T_A[Boolean, Int]]) extends T_A[Int, T_A[Int, T_A[Int, Int]]]

val v_a: T_A[Int, T_A[Int, T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(12, _, CC_A()) => 2 
}
}
// This is not matched: CC_C(_, _, CC_A())