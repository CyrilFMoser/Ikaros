package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[T_A[Byte, Byte], Byte]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]) extends T_A[T_A[CC_A[CC_A[Char]], CC_A[CC_A[Char]]], CC_A[CC_A[Char]]]
case class CC_C[E](a: (CC_B[Byte],CC_B[Int]), b: E) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[CC_A[CC_A[Char]], CC_A[CC_A[Char]]], CC_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_B(CC_A(_, _, CC_C(_, _))) => 2 
  case CC_B(CC_C((_,_), CC_A(_, _, _))) => 3 
  case CC_C(_, _) => 4 
}
}