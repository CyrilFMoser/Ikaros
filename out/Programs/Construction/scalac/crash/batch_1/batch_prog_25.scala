package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_B[C](a: C, b: CC_A[C], c: (T_A[Boolean],T_A[Char])) extends T_A[C]
case class CC_C[D]() extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _), (CC_A(_, _, _),CC_A(_, _, _))) => 1 
  case CC_B(_, CC_A(_, _, _), (CC_A(_, _, _),CC_B(_, _, _))) => 2 
  case CC_B(_, CC_A(_, _, _), (CC_A(_, _, _),CC_C())) => 3 
  case CC_B(_, CC_A(_, _, _), (CC_B(_, _, _),CC_A(_, _, _))) => 4 
  case CC_B(_, CC_A(_, _, _), (CC_B(_, _, _),CC_B(_, _, _))) => 5 
  case CC_B(_, CC_A(_, _, _), (CC_B(_, _, _),CC_C())) => 6 
  case CC_B(_, CC_A(_, _, _), (CC_C(),CC_A(_, _, _))) => 7 
  case CC_B(_, CC_A(_, _, _), (CC_C(),CC_B(_, _, _))) => 8 
  case CC_C() => 9 
}
}
// This is not matched: CC_B(_, CC_A(_, _, _), (CC_C(),CC_C()))