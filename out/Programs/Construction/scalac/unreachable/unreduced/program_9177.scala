package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B, b: T_B, c: C) extends T_A[C, Char]
case class CC_B() extends T_B
case class CC_C(a: T_A[Byte, (CC_B,Boolean)], b: Byte) extends T_B

val v_a: CC_A[T_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _, _) => 0 
  case CC_A(CC_C(_, _), _, _) => 1 
}
}