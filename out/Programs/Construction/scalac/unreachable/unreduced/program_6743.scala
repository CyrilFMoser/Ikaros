package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[(T_A[Boolean],Int)]
case class CC_B(a: Char) extends T_A[(T_A[Boolean],Int)]
case class CC_C(a: T_A[CC_B], b: Int, c: T_B[CC_B, T_A[CC_B]]) extends T_A[(T_A[Boolean],Int)]
case class CC_D(a: T_A[(Byte,CC_B)], b: T_B[(CC_B,Boolean), Int], c: T_A[T_B[Char, CC_C]]) extends T_B[Char, CC_C]

val v_a: T_A[(T_A[Boolean],Int)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)