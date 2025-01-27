package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: T_B, c: Byte) extends T_A[Int]
case class CC_B(a: T_B, b: Boolean, c: T_B) extends T_A[Int]
case class CC_C(a: CC_A, b: Char) extends T_A[Int]
case class CC_D(a: T_A[T_A[CC_A]], b: T_B, c: CC_A) extends T_B
case class CC_E() extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _, _), _) => 0 
  case CC_A(_, CC_E(), _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, _) => 3 
}
}