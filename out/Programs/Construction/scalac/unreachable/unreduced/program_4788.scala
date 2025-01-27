package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: Char, c: T_A[D]) extends T_A[D]
case class CC_B[E](a: Boolean, b: Boolean, c: T_B[E, E]) extends T_A[E]
case class CC_C(a: T_A[CC_B[Char]], b: CC_B[CC_B[Int]], c: CC_A[(Char,Byte)]) extends T_B[CC_A[T_A[Int]], CC_A[T_A[Byte]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_B(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, CC_B(_, _, _)) => 2 
  case CC_A(CC_B(_, _, _), _, CC_B(_, _, _)) => 3 
  case CC_B(_, _, _) => 4 
}
}