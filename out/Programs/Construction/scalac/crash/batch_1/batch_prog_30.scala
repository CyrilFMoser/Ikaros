package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Boolean, b: D, c: T_A[C, D]) extends T_A[C, D]
case class CC_B[E, F](a: T_A[E, E], b: (T_A[(Int,Char), Int],Byte), c: T_A[E, E]) extends T_A[E, F]
case class CC_C[G, H](a: T_A[H, H]) extends T_A[G, H]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (CC_A(_, _, _),_), _) => 1 
  case CC_B(_, (CC_B(_, _, _),_), _) => 2 
  case CC_B(_, (CC_C(_),_), _) => 3 
  case CC_C(CC_A(true, true, CC_A(_, _, _))) => 4 
  case CC_C(CC_A(true, false, CC_A(_, _, _))) => 5 
  case CC_C(CC_A(true, true, CC_B(_, _, _))) => 6 
  case CC_C(CC_A(true, false, CC_B(_, _, _))) => 7 
  case CC_C(CC_A(true, true, CC_C(_))) => 8 
  case CC_C(CC_A(true, false, CC_C(_))) => 9 
  case CC_C(CC_A(false, true, CC_A(_, _, _))) => 10 
  case CC_C(CC_A(false, false, CC_A(_, _, _))) => 11 
  case CC_C(CC_A(false, true, CC_B(_, _, _))) => 12 
  case CC_C(CC_A(false, false, CC_B(_, _, _))) => 13 
  case CC_C(CC_A(false, true, CC_C(_))) => 14 
  case CC_C(CC_A(false, false, CC_C(_))) => 15 
  case CC_C(CC_B(_, _, _)) => 16 
  case CC_C(CC_C(CC_A(_, _, _))) => 17 
  case CC_C(CC_C(CC_C(_))) => 18 
}
}
// This is not matched: CC_C(CC_C(CC_B(_, _, _)))