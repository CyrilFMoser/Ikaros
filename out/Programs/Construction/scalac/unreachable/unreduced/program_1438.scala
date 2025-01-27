package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[(T_A[Boolean],T_A[Byte])]
case class CC_B(a: Boolean, b: CC_A) extends T_A[(T_A[Boolean],T_A[Byte])]

val v_a: T_A[(T_A[Boolean],T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(true, _) => 1 
  case CC_B(false, _) => 2 
}
}