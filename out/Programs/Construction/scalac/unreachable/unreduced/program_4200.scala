package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B(a: CC_A[CC_A[(Char,Int), Char], CC_A[Byte, Byte]], b: Int) extends T_B[CC_A[(Byte,Byte), T_A[Int, Boolean]], CC_A[T_A[Int, Boolean], CC_A[Byte, Boolean]]]
case class CC_C(a: T_A[Char, (CC_B,CC_B)]) extends T_B[CC_A[(Byte,Byte), T_A[Int, Boolean]], CC_A[T_A[Int, Boolean], CC_A[Byte, Boolean]]]
case class CC_D(a: (T_B[CC_B, CC_B],Char), b: Boolean, c: T_A[CC_B, T_A[CC_C, CC_C]]) extends T_B[CC_A[(Byte,Byte), T_A[Int, Boolean]], CC_A[T_A[Int, Boolean], CC_A[Byte, Boolean]]]

val v_a: T_B[CC_A[(Byte,Byte), T_A[Int, Boolean]], CC_A[T_A[Int, Boolean], CC_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_D((_,_), _, CC_A()) => 1 
}
}
// This is not matched: CC_B(CC_A(), _)