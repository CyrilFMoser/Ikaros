package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[(T_A[Boolean],Boolean)]
case class CC_C(a: Boolean, b: CC_A, c: T_B) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(true, CC_A(_), _) => 0 
  case CC_C(false, CC_A(_), _) => 1 
  case CC_D() => 2 
}
}