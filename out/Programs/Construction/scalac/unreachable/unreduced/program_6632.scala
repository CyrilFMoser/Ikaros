package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (Int,T_A[Boolean]), b: Byte, c: T_B) extends T_A[Boolean]
case class CC_B(a: (T_B,Boolean)) extends T_A[Boolean]
case class CC_C() extends T_A[(T_B,Boolean)]
case class CC_D(a: T_A[T_A[Boolean]], b: CC_C) extends T_B
case class CC_E(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C()) => 0 
  case CC_E(_) => 1 
}
}