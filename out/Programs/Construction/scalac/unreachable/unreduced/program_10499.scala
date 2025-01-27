package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Char]], b: T_B[Boolean], c: T_A[T_A[Byte]]) extends T_A[T_B[T_A[Byte]]]
case class CC_B() extends T_A[T_B[T_A[Byte]]]
case class CC_C[C](a: (T_A[CC_B],T_A[CC_A]), b: CC_B, c: C) extends T_B[C]
case class CC_D[D](a: CC_B, b: D, c: D) extends T_B[D]
case class CC_E[E]() extends T_B[E]

val v_a: T_A[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C((_,_), _, _), CC_C(_, _, _), _) => 0 
  case CC_A(CC_D(CC_B(), _, _), CC_C(_, _, _), _) => 1 
  case CC_A(CC_E(), CC_C(_, _, _), _) => 2 
  case CC_A(CC_C((_,_), _, _), CC_D(CC_B(), _, _), _) => 3 
  case CC_A(CC_D(CC_B(), _, _), CC_D(CC_B(), _, _), _) => 4 
  case CC_A(CC_E(), CC_D(CC_B(), _, _), _) => 5 
  case CC_A(CC_C((_,_), _, _), CC_E(), _) => 6 
  case CC_A(CC_D(CC_B(), _, _), CC_E(), _) => 7 
  case CC_B() => 8 
}
}
// This is not matched: CC_A(CC_E(), CC_E(), _)