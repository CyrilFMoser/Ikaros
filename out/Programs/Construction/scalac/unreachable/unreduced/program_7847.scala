package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Byte], b: T_B, c: T_A[T_B]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C() extends T_A[Byte]
case class CC_D(a: CC_B) extends T_B

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()