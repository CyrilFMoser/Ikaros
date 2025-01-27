package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: Byte, b: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: T_A[Byte], b: T_A[Int], c: Int) extends T_A[Byte]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _)) => 1 
  case CC_A(CC_C(_, _, _)) => 2 
}
}