package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[Byte]
case class CC_C(a: Boolean, b: CC_A) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, CC_A(_))