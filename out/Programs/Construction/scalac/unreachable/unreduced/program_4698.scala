package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: T_B) extends T_A[T_B, C]
case class CC_B() extends T_A[T_B, Int]
case class CC_C() extends T_A[T_B, Int]
case class CC_D() extends T_B
case class CC_E(a: Byte, b: Int, c: T_A[T_A[T_B, Int], CC_A[T_B]]) extends T_B

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_D()), _) => 0 
  case CC_A(CC_A(_, CC_E(_, _, _)), _) => 1 
}
}