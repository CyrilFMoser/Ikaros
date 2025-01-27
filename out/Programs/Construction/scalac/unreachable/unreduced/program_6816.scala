package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Byte], b: T_A[Char], c: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: Char, b: CC_A, c: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: CC_A, b: T_A[Byte]) extends T_B
case class CC_D(a: T_B) extends T_B
case class CC_E(a: T_A[Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 0 
  case CC_C(_, CC_A(CC_A(_, _, _), _, CC_B(_, _, _))) => 1 
  case CC_C(_, CC_A(CC_B(_, _, _), _, CC_A(_, _, _))) => 2 
  case CC_C(_, CC_A(CC_B(_, _, _), _, CC_B(_, _, _))) => 3 
  case CC_C(_, CC_B(_, CC_A(_, _, _), CC_A(_, _, _))) => 4 
  case CC_C(_, CC_B(_, CC_A(_, _, _), CC_B(_, _, _))) => 5 
  case CC_D(CC_C(_, _)) => 6 
  case CC_D(CC_D(_)) => 7 
  case CC_D(CC_E(CC_A(_, _, _))) => 8 
  case CC_D(CC_E(CC_B(_, _, _))) => 9 
  case CC_E(_) => 10 
}
}