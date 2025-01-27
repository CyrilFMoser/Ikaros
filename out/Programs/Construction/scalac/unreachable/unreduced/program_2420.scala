package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B(a: Byte, b: T_B[Boolean], c: T_A) extends T_A
case class CC_C(a: Char) extends T_A
case class CC_D(a: T_A) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_A(_, _), CC_D(_))) => 0 
  case CC_D(CC_A(CC_B(_, _, _), CC_D(_))) => 1 
  case CC_D(CC_A(CC_C(_), CC_D(_))) => 2 
  case CC_D(CC_B(_, _, CC_A(_, _))) => 3 
  case CC_D(CC_B(_, _, CC_B(_, _, _))) => 4 
  case CC_D(CC_B(_, _, CC_C(_))) => 5 
  case CC_D(CC_C('x')) => 6 
  case CC_D(CC_C(_)) => 7 
}
}