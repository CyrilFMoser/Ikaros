package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_A[T_B[Char]]) extends T_A[Boolean]
case class CC_B(a: Byte) extends T_A[Boolean]
case class CC_C(a: Boolean, b: T_A[T_B[Byte]], c: CC_B) extends T_B[T_A[(CC_A,Int)]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}