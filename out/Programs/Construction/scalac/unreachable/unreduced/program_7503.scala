package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(T_B[Char],Char)]
case class CC_B(a: T_A[T_B[CC_A]], b: T_B[T_A[(Char,Int)]]) extends T_B[T_A[T_A[CC_A]]]
case class CC_C(a: Int, b: Int, c: T_A[CC_B]) extends T_B[T_A[T_A[CC_A]]]
case class CC_D(a: Char) extends T_B[T_A[T_A[CC_A]]]

val v_a: T_B[T_A[T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D('x') => 1 
  case CC_D(_) => 2 
}
}
// This is not matched: CC_C(_, _, _)