package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Boolean, C]
case class CC_B(a: T_A[Byte, T_A[T_B, T_B]]) extends T_B
case class CC_C(a: CC_B, b: T_A[Boolean, T_B], c: T_A[Boolean, CC_A[CC_B]]) extends T_B
case class CC_D[D](a: CC_A[D], b: D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_B(_), _, _) => 1 
  case CC_D(_, _) => 2 
}
}