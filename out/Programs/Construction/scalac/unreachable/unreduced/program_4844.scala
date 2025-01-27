package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_A[T_A[Byte]]) extends T_A[T_B[T_B[Char]]]
case class CC_B(a: T_B[Char], b: CC_A) extends T_B[Char]
case class CC_C() extends T_B[Char]
case class CC_D() extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), CC_A(_, _)) => 0 
  case CC_B(CC_B(CC_C(), _), CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_D(), _), CC_A(_, _)) => 2 
  case CC_B(CC_C(), CC_A(_, _)) => 3 
  case CC_B(CC_D(), CC_A(_, _)) => 4 
  case CC_C() => 5 
  case CC_D() => 6 
}
}