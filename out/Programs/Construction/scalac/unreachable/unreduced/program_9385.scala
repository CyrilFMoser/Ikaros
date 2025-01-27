package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]], b: T_B[T_A[Char]]) extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_C(a: T_B[Int], b: (T_A[Char],T_A[Char])) extends T_A[Char]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, (CC_A(_, _),CC_A(_, _))) => 0 
  case CC_C(_, (CC_A(_, _),CC_B())) => 1 
  case CC_C(_, (CC_A(_, _),CC_C(_, _))) => 2 
  case CC_C(_, (CC_B(),CC_A(_, _))) => 3 
  case CC_C(_, (CC_B(),CC_B())) => 4 
  case CC_C(_, (CC_B(),CC_C(_, _))) => 5 
  case CC_C(_, (CC_C(_, _),CC_A(_, _))) => 6 
  case CC_C(_, (CC_C(_, _),CC_B())) => 7 
}
}
// This is not matched: CC_C(_, (CC_C(_, _),CC_C(_, _)))