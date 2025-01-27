package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_B[T_A, T_A], c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[C](a: T_B[C, CC_B], b: Byte, c: CC_B) extends T_B[C, CC_B]
case class CC_E[D]() extends T_B[D, CC_B]

val v_a: T_B[CC_A, CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _, _), _, CC_B(CC_A(_, _, _))) => 0 
  case CC_D(CC_E(), _, CC_B(CC_A(_, _, _))) => 1 
  case CC_E() => 2 
}
}