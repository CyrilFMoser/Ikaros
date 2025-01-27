package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: T_A[D]) extends T_A[D]
case class CC_B[E, F](a: (Byte,T_B[Byte, Boolean]), b: F, c: T_A[E]) extends T_A[E]
case class CC_C() extends T_A[CC_B[T_A[Int], T_A[Char]]]
case class CC_D[G]() extends T_B[G, T_A[Byte]]

val v_a: T_A[CC_B[T_A[Int], T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(0, _)) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
  case CC_A(_, CC_B((_,_), _, CC_A(_, _))) => 2 
  case CC_A(_, CC_B((_,_), _, CC_B(_, _, _))) => 3 
  case CC_A(_, CC_B((_,_), _, CC_C())) => 4 
  case CC_A(_, CC_C()) => 5 
  case CC_B((_,_), _, CC_A(_, _)) => 6 
  case CC_B((_,_), _, CC_B(_, _, _)) => 7 
  case CC_B((_,_), _, CC_C()) => 8 
  case CC_C() => 9 
}
}