package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D, E](a: T_A[D, E], b: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]], T_A[Boolean, Boolean]]) extends T_A[T_A[Char, Char], Char]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(12, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_A(_, _))) => 1 
  case CC_A(_, CC_A(12, CC_B(_, _))) => 2 
  case CC_A(_, CC_A(_, CC_B(_, _))) => 3 
  case CC_A(_, CC_A(12, CC_C(_))) => 4 
  case CC_A(_, CC_A(_, CC_C(_))) => 5 
  case CC_A(_, CC_B(_, _)) => 6 
  case CC_A(_, CC_C(CC_A(_, _))) => 7 
  case CC_A(_, CC_C(CC_B(_, _))) => 8 
  case CC_B(_, _) => 9 
  case CC_C(CC_A(_, CC_A(_, _))) => 10 
  case CC_C(CC_A(_, CC_B(_, _))) => 11 
  case CC_C(CC_B(_, _)) => 12 
}
}