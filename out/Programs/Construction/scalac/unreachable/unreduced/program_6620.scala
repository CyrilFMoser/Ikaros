package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B() extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_C, b: Byte, c: T_A[CC_A[CC_C], T_A[(Int,Int), CC_C]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_D(_, _, _) => 2 
}
}