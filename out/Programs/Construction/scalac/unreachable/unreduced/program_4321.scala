package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: (Int,Char), b: T_B[CC_A, (Char,T_A)], c: T_B[T_B[T_A, T_A], T_B[(Boolean,Char), CC_A]]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: Boolean, b: CC_C, c: CC_A) extends T_B[(T_B[Int, CC_A],Boolean), C]
case class CC_E[D]() extends T_B[D, CC_C]
case class CC_F[E]() extends T_B[E, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C(_)) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C(CC_A(CC_A(_))) => 6 
  case CC_C(CC_A(CC_B(_, _, _))) => 7 
  case CC_C(CC_A(CC_C(_))) => 8 
  case CC_C(CC_B(_, _, _)) => 9 
  case CC_C(CC_C(_)) => 10 
}
}