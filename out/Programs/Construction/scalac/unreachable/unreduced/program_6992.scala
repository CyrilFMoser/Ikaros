package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Char]) extends T_A[C, Char]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[D, Char]
case class CC_C[E](a: T_A[E, Char]) extends T_A[E, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_A(CC_C(CC_A(_))) => 4 
  case CC_A(CC_C(CC_B(_, _))) => 5 
  case CC_A(CC_C(CC_C(_))) => 6 
  case CC_B(_, _) => 7 
  case CC_C(CC_A(CC_A(_))) => 8 
  case CC_C(CC_A(CC_B(_, _))) => 9 
  case CC_C(CC_A(CC_C(_))) => 10 
  case CC_C(CC_B(_, _)) => 11 
  case CC_C(CC_C(CC_A(_))) => 12 
  case CC_C(CC_C(CC_B(_, _))) => 13 
  case CC_C(CC_C(CC_C(_))) => 14 
}
}