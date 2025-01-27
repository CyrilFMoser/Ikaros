package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_B[Char], b: T_B[CC_A[(Boolean,Byte)]]) extends T_A[CC_A[Char]]
case class CC_C() extends T_A[CC_A[Char]]
case class CC_D(a: CC_A[T_A[CC_C]], b: CC_C, c: CC_A[CC_A[CC_C]]) extends T_B[(CC_C,CC_B)]
case class CC_E(a: Boolean, b: Int, c: CC_D) extends T_B[(CC_C,CC_B)]
case class CC_F(a: T_B[T_A[CC_C]]) extends T_B[(CC_C,CC_B)]

val v_a: T_A[CC_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}