package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_B[E, E], c: CC_A[E]) extends T_A[E]
case class CC_C(a: T_A[Char], b: (T_A[Char],T_A[Char])) extends T_B[CC_B[Boolean], T_A[T_A[Char]]]

val v_a: T_B[CC_B[Boolean], T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), (CC_A(),CC_A())) => 0 
  case CC_C(CC_B(CC_A(), _, CC_A()), (CC_A(),CC_A())) => 1 
  case CC_C(CC_B(CC_B(_, _, _), _, CC_A()), (CC_A(),CC_A())) => 2 
  case CC_C(CC_A(), (CC_A(),CC_B(_, _, _))) => 3 
  case CC_C(CC_B(CC_A(), _, CC_A()), (CC_A(),CC_B(_, _, _))) => 4 
  case CC_C(CC_B(CC_B(_, _, _), _, CC_A()), (CC_A(),CC_B(_, _, _))) => 5 
  case CC_C(CC_A(), (CC_B(_, _, _),CC_A())) => 6 
  case CC_C(CC_B(CC_A(), _, CC_A()), (CC_B(_, _, _),CC_A())) => 7 
  case CC_C(CC_B(CC_B(_, _, _), _, CC_A()), (CC_B(_, _, _),CC_A())) => 8 
  case CC_C(CC_A(), (CC_B(_, _, _),CC_B(_, _, _))) => 9 
  case CC_C(CC_B(CC_A(), _, CC_A()), (CC_B(_, _, _),CC_B(_, _, _))) => 10 
  case CC_C(CC_B(CC_B(_, _, _), _, CC_A()), (CC_B(_, _, _),CC_B(_, _, _))) => 11 
}
}