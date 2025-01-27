package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Char],Byte), b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C() extends T_A[T_A[CC_B[T_A[Byte, Char]], CC_B[T_A[Byte, Char]]], CC_B[T_A[Byte, Char]]]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B() => 1 
}
}