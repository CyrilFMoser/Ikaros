package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
  case CC_C() => 1 
}
}
// This is not matched: (CC_B T_A)