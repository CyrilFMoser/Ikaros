package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Byte, Char], T_B[Int, Byte]]) extends T_A[(T_B[(Char,Byte), Boolean],Int), T_B[Char, T_A[Char, Int]]]
case class CC_B() extends T_A[(T_B[(Char,Byte), Boolean],Int), T_B[Char, T_A[Char, Int]]]
case class CC_C(a: (T_A[Int, CC_A],T_A[Byte, CC_B]), b: T_B[Char, (CC_B,CC_A)], c: Int) extends T_A[(T_B[(Char,Byte), Boolean],Int), T_B[Char, T_A[Char, Int]]]
case class CC_D[E]() extends T_B[Int, E]

val v_a: T_A[(T_B[(Char,Byte), Boolean],Int), T_B[Char, T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C((_,_), _, _)