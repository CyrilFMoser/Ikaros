package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B(a: (T_A[Byte, (Char,Int)],T_A[Byte, Byte]), b: T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]) extends T_A[T_A[CC_A[T_A[(Byte,Int), Byte]], CC_A[T_A[(Byte,Int), Byte]]], CC_A[T_A[(Byte,Int), Byte]]]
case class CC_C(a: Char, b: Boolean) extends T_A[T_A[CC_A[T_A[(Byte,Int), Byte]], CC_A[T_A[(Byte,Int), Byte]]], CC_A[T_A[(Byte,Int), Byte]]]

val v_a: T_A[T_A[CC_A[T_A[(Byte,Int), Byte]], CC_A[T_A[(Byte,Int), Byte]]], CC_A[T_A[(Byte,Int), Byte]]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), CC_A(_, _, _)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)