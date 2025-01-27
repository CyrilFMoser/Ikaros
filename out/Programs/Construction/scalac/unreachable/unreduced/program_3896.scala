package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: (T_A[Byte, Boolean],CC_A[Byte]), b: Char, c: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C() extends T_A[T_A[CC_A[CC_B[Char]], CC_A[CC_B[Char]]], CC_A[CC_B[Char]]]

val v_a: T_A[T_A[CC_A[CC_B[Char]], CC_A[CC_B[Char]]], CC_A[CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A()), _, CC_A()) => 1 
  case CC_B((_,CC_A()), _, CC_B((_,_), _, CC_A())) => 2 
  case CC_B((_,CC_A()), _, CC_B((_,_), _, CC_B(_, _, _))) => 3 
  case CC_B((_,CC_A()), _, CC_B((_,_), _, CC_C())) => 4 
  case CC_B((_,CC_A()), _, CC_C()) => 5 
  case CC_C() => 6 
}
}