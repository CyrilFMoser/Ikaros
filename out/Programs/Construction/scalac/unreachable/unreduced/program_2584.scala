package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Boolean) extends T_A[(T_A[Byte],Boolean)]
case class CC_B(a: Char) extends T_A[(T_A[Byte],Boolean)]
case class CC_C(a: T_A[CC_A], b: T_A[(CC_B,CC_A)]) extends T_A[(T_A[Byte],Boolean)]

val v_a: T_A[(T_A[Byte],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}