package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[Char]], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[(Char,(Byte,Boolean))]) extends T_B[CC_A]
case class CC_D[B]() extends T_B[CC_A]
case class CC_E(a: T_B[CC_C], b: T_A) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_C(_)