package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[Boolean], c: (T_B,T_B)) extends T_A[Byte]
case class CC_B(a: T_A[Byte]) extends T_A[Byte]
case class CC_C() extends T_A[Byte]
case class CC_D(a: Byte) extends T_B
case class CC_E(a: CC_C, b: CC_C, c: T_A[(Char,Int)]) extends T_B
case class CC_F(a: CC_E) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
  case CC_D(_) => 1 
  case CC_E(_, CC_C(), _) => 2 
  case CC_F(_) => 3 
}
}