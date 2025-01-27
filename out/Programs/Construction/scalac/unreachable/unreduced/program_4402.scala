package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Char, C]) extends T_A[Char, C]
case class CC_B() extends T_A[Char, Char]
case class CC_C(a: T_A[CC_B, CC_A[CC_B]], b: T_A[Char, Char]) extends T_A[Char, Char]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B())) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B()) => 3 
  case CC_A(CC_C(_, CC_A(_))) => 4 
  case CC_A(CC_C(_, CC_B())) => 5 
  case CC_A(CC_C(_, CC_C(_, _))) => 6 
  case CC_B() => 7 
  case CC_C(_, _) => 8 
}
}