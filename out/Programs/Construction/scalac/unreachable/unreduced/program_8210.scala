package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[(Char,Char), T_A[Boolean, Int]]]
case class CC_B[D]() extends T_A[D, T_A[(Char,Char), T_A[Boolean, Int]]]
case class CC_C[E](a: CC_A[E], b: CC_A[E], c: T_A[(Boolean,Byte), E]) extends T_A[E, T_A[(Char,Char), T_A[Boolean, Int]]]

val v_a: T_A[Boolean, T_A[(Char,Char), T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}