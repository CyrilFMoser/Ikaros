package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_B[E, E], E], b: (Char,T_B[Int, Boolean]), c: T_A[E, E]) extends T_A[T_B[E, E], E]
case class CC_B(a: T_B[T_B[Byte, Byte], T_A[Char, Byte]], b: T_A[T_B[Byte, Byte], Byte]) extends T_A[T_B[T_A[Byte, CC_A[Byte]], T_A[Byte, CC_A[Byte]]], T_A[Byte, CC_A[Byte]]]
case class CC_C(a: T_A[CC_A[CC_B], T_B[Char, Int]], b: Char) extends T_A[T_B[T_A[Byte, CC_A[Byte]], T_A[Byte, CC_A[Byte]]], T_A[Byte, CC_A[Byte]]]
case class CC_D[G, F](a: CC_B) extends T_B[G, F]
case class CC_E[I, H]() extends T_B[I, H]

val v_a: T_A[T_B[T_A[Byte, CC_A[Byte]], T_A[Byte, CC_A[Byte]]], T_A[Byte, CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), (_,CC_D(_)), _) => 0 
  case CC_A(CC_A(_, _, _), (_,CC_E()), _) => 1 
  case CC_A(CC_B(CC_D(_), CC_A(_, _, _)), (_,CC_D(_)), _) => 2 
  case CC_A(CC_B(CC_D(_), CC_A(_, _, _)), (_,CC_E()), _) => 3 
  case CC_A(CC_B(CC_E(), CC_A(_, _, _)), (_,CC_D(_)), _) => 4 
  case CC_A(CC_B(CC_E(), CC_A(_, _, _)), (_,CC_E()), _) => 5 
  case CC_A(CC_C(_, _), (_,CC_D(_)), _) => 6 
  case CC_A(CC_C(_, _), (_,CC_E()), _) => 7 
  case CC_B(_, _) => 8 
  case CC_C(_, _) => 9 
}
}