package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[Char]], b: Boolean, c: Int) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A], c: T_B[Byte]) extends T_A
case class CC_C[B](a: T_A) extends T_B[CC_B]
case class CC_D(a: T_A, b: CC_A, c: Byte) extends T_B[CC_B]
case class CC_E(a: CC_D) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
  case CC_C(CC_B(_, _, _)) => 1 
  case CC_D(_, _, _) => 2 
  case CC_E(CC_D(_, _, _)) => 3 
}
}