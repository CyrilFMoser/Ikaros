package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_A, c: T_B[Char]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D(a: T_B[Char], b: T_B[Char]) extends T_B[Char]
case class CC_E(a: T_B[T_B[Char]]) extends T_B[Char]
case class CC_F() extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _), CC_D(_, _)) => 0 
  case CC_D(CC_D(_, _), CC_E(_)) => 1 
  case CC_D(CC_D(_, _), CC_F()) => 2 
  case CC_D(CC_E(_), CC_D(_, _)) => 3 
  case CC_D(CC_E(_), CC_E(_)) => 4 
  case CC_D(CC_E(_), CC_F()) => 5 
  case CC_D(CC_F(), CC_D(_, _)) => 6 
  case CC_D(CC_F(), CC_E(_)) => 7 
  case CC_D(CC_F(), CC_F()) => 8 
  case CC_E(_) => 9 
  case CC_F() => 10 
}
}