package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int, b: T_A[((Int,Int),Int)]) extends T_A[C]
case class CC_B(a: Int) extends T_B[Byte]
case class CC_C(a: T_B[(CC_B,CC_B)], b: T_B[Byte]) extends T_B[Byte]
case class CC_D() extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_B(_)) => 1 
  case CC_C(_, CC_C(_, CC_B(_))) => 2 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 3 
  case CC_C(_, CC_C(_, CC_D())) => 4 
  case CC_D() => 5 
}
}
// This is not matched: CC_C(_, CC_D())