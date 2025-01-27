package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_B, c: T_B) extends T_A[(T_B,Int)]
case class CC_B[B](a: CC_A) extends T_A[(T_B,Int)]
case class CC_C(a: T_A[CC_B[Byte]], b: Char, c: CC_A) extends T_B
case class CC_D(a: Byte) extends T_B
case class CC_E(a: CC_C, b: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), CC_C(_, _, _))) => 0 
  case CC_C(_, _, CC_A(_, CC_D(_), CC_C(_, _, _))) => 1 
  case CC_C(_, _, CC_A(_, CC_E(_, _), CC_C(_, _, _))) => 2 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), CC_D(_))) => 3 
  case CC_C(_, _, CC_A(_, CC_D(_), CC_D(_))) => 4 
  case CC_C(_, _, CC_A(_, CC_E(_, _), CC_D(_))) => 5 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), CC_E(_, _))) => 6 
  case CC_C(_, _, CC_A(_, CC_D(_), CC_E(_, _))) => 7 
  case CC_C(_, _, CC_A(_, CC_E(_, _), CC_E(_, _))) => 8 
  case CC_D(_) => 9 
  case CC_E(CC_C(_, _, CC_A(_, _, _)), _) => 10 
}
}