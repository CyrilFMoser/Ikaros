package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Boolean, b: T_B[CC_A, T_B[T_A, T_A]], c: CC_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: CC_C) extends T_B[C, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A()) => 2 
  case CC_C(CC_B(true, _, _)) => 3 
  case CC_C(CC_B(false, _, _)) => 4 
  case CC_C(CC_C(CC_A())) => 5 
  case CC_C(CC_C(CC_B(_, _, _))) => 6 
  case CC_C(CC_C(CC_C(_))) => 7 
}
}