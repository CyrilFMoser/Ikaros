package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[T_A, T_A], c: T_A) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_A, b: (Boolean,CC_A)) extends T_B[CC_B, C]
case class CC_E[D](a: D) extends T_B[CC_B, D]

val v_a: T_B[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_D(_, (_,CC_A(_, _, _))) => 0 
  case CC_E(_) => 1 
}
}