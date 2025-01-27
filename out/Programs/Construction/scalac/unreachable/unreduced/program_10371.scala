package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: Char) extends T_A
case class CC_B[B](a: T_A, b: T_A, c: B) extends T_A
case class CC_C(a: CC_B[CC_B[CC_A]], b: Int, c: Char) extends T_B[CC_B[(T_A,CC_A)]]
case class CC_D(a: T_B[Byte], b: T_A) extends T_B[CC_B[(T_A,CC_A)]]
case class CC_E(a: CC_D) extends T_B[CC_B[(T_A,CC_A)]]

val v_a: T_B[CC_B[(T_A,CC_A)]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, CC_A(_, _, _)) => 1 
  case CC_D(_, CC_B(CC_A(_, _, _), _, _)) => 2 
  case CC_E(CC_D(_, _)) => 3 
}
}
// This is not matched: CC_D(_, CC_B(CC_B(_, _, _), _, _))