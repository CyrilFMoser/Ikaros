package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[Int, Char]) extends T_A[C, Char]
case class CC_B() extends T_A[Boolean, Char]
case class CC_C[D](a: T_A[D, Char]) extends T_A[D, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_C(_))) => 1 
  case CC_A(_, CC_C(_)) => 2 
  case CC_C(CC_A(_, CC_A(_, _))) => 3 
  case CC_C(CC_A(_, CC_C(_))) => 4 
  case CC_C(CC_C(CC_A(_, _))) => 5 
  case CC_C(CC_C(CC_C(_))) => 6 
}
}