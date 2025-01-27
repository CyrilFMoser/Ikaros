package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_A, c: T_B[(T_A,T_A)]) extends T_A
case class CC_B(a: T_A, b: Char, c: T_B[T_B[Byte]]) extends T_B[Byte]
case class CC_C(a: T_A, b: T_B[Byte], c: Int) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _, _), _), _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}