package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Boolean],Int), b: Boolean) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[T_B[CC_A, CC_A]], b: CC_A, c: (CC_A,T_B[CC_A, Byte])) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: T_B[T_B[CC_A, CC_B], CC_B], b: CC_B) extends T_A[T_A[T_A[Boolean]]]
case class CC_D[D](a: CC_A, b: CC_A) extends T_B[Char, D]
case class CC_E[E](a: T_B[Char, E], b: (CC_D[CC_C],T_B[Char, (Char,Char)]), c: T_B[T_B[E, E], E]) extends T_B[Char, E]
case class CC_F() extends T_B[Char, T_B[Char, T_B[CC_B, CC_C]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, true) => 0 
  case CC_A(_, false) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, CC_B(_, _, _)) => 3 
}
}