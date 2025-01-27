package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[C, T_A[Int, T_A[(Char,Char), Byte]]]
case class CC_B[D]() extends T_A[D, T_A[Int, T_A[(Char,Char), Byte]]]
case class CC_C[E](a: T_A[E, E], b: CC_B[E], c: E) extends T_A[E, T_A[Int, T_A[(Char,Char), Byte]]]

val v_a: T_A[Boolean, T_A[Int, T_A[(Char,Char), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}