package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C, c: C) extends T_A[C, T_A[Byte, T_A[(Char,Byte), Byte]]]
case class CC_B[D]() extends T_A[T_A[(Char,Boolean), T_A[Char, Char]], T_A[Byte, T_A[(Char,Byte), Byte]]]
case class CC_C(a: (CC_B[Char],CC_A[Char]), b: CC_B[Boolean]) extends T_A[T_A[(Char,Boolean), T_A[Char, Char]], T_A[Byte, T_A[(Char,Byte), Byte]]]

val v_a: T_A[T_A[(Char,Boolean), T_A[Char, Char]], T_A[Byte, T_A[(Char,Byte), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C((CC_B(),CC_A(_, _, _)), _)