package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_B[Char],T_B[Boolean])) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[T_B[CC_A]], b: CC_A, c: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C[C](a: C, b: (CC_A,CC_A), c: T_B[CC_B]) extends T_B[C]
case class CC_D[D](a: CC_A) extends T_B[D]
case class CC_E[E](a: (T_B[CC_B],CC_A)) extends T_B[E]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), _, CC_C(_, _, CC_C(_, _, _))) => 0 
  case CC_C(CC_B(_, _, _), _, CC_C(_, _, CC_D(_))) => 1 
  case CC_C(CC_B(_, _, _), _, CC_D(_)) => 2 
  case CC_C(CC_B(_, _, _), _, CC_E((_,_))) => 3 
  case CC_D(CC_A((_,_))) => 4 
  case CC_E(_) => 5 
}
}
// This is not matched: CC_C(CC_B(_, _, _), _, CC_C(_, _, CC_E(_)))