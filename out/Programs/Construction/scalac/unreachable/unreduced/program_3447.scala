package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: T_A[T_A[Byte]]) extends T_A[(T_A[T_B],T_B)]
case class CC_B(a: T_A[Boolean], b: CC_A) extends T_B
case class CC_C(a: Char, b: T_B, c: (T_A[(Byte,Byte)],CC_A)) extends T_B
case class CC_D(a: CC_C, b: CC_B, c: (CC_A,CC_A)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C('x', _, _) => 1 
  case CC_D(_, CC_B(_, _), _) => 2 
}
}
// This is not matched: CC_C(_, _, _)