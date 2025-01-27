package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_B[T_A, T_A]], b: T_A, c: Boolean) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_B[CC_A, CC_A]
case class CC_C() extends T_B[CC_A, CC_A]
case class CC_D[C](a: C) extends T_B[CC_A, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_C() => 1 
  case CC_D(_) => 2 
}
}