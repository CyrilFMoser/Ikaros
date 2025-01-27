package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_B[T_B[CC_B, CC_A], T_A]) extends T_A
case class CC_D[C](a: Char, b: T_A, c: Int) extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B())) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B()) => 3 
  case CC_A(CC_C(_, _)) => 4 
  case CC_B() => 5 
  case CC_C(_, _) => 6 
}
}