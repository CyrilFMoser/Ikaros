package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Boolean, (T_A,T_A)], b: Char) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D[C](a: C) extends T_B[C, CC_C]
case class CC_E(a: Int, b: CC_B) extends T_B[T_A, CC_C]

val v_a: T_B[T_A, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_D(CC_B()) => 1 
  case CC_D(CC_C(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_D(CC_C(CC_A(_, _), CC_B())) => 3 
  case CC_D(CC_C(CC_A(_, _), CC_C(_, _))) => 4 
  case CC_D(CC_C(CC_B(), CC_A(_, _))) => 5 
  case CC_D(CC_C(CC_B(), CC_B())) => 6 
  case CC_D(CC_C(CC_B(), CC_C(_, _))) => 7 
  case CC_D(CC_C(CC_C(_, _), CC_A(_, _))) => 8 
  case CC_D(CC_C(CC_C(_, _), CC_B())) => 9 
  case CC_D(CC_C(CC_C(_, _), CC_C(_, _))) => 10 
  case CC_E(_, _) => 11 
}
}