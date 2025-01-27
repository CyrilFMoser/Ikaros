package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_A) extends T_A
case class CC_B(a: T_B[CC_A, (CC_A,CC_A)], b: T_A) extends T_A
case class CC_C[C](a: C, b: CC_B) extends T_B[C, Char]
case class CC_D[D](a: T_B[D, Char], b: CC_A, c: Boolean) extends T_B[D, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _))) => 1 
  case CC_A(_, CC_B(_, CC_A(_, _))) => 2 
  case CC_A(_, CC_B(_, CC_B(_, _))) => 3 
  case CC_B(_, CC_A(_, _)) => 4 
  case CC_B(_, CC_B(_, _)) => 5 
}
}