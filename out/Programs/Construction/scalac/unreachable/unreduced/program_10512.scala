package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[(T_A,(Int,Boolean)), C], b: C) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[Char, CC_A[T_A]], b: T_B[(CC_B,CC_B), CC_B], c: Char) extends T_B[CC_B, Boolean]
case class CC_D() extends T_B[CC_B, Boolean]
case class CC_E() extends T_B[CC_B, Boolean]

val v_a: T_B[CC_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D() => 1 
  case CC_E() => 2 
}
}