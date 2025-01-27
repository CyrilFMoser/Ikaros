package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: ((Int,(Byte,Int)),(Int,Char)), b: T_A[T_A[Boolean]]) extends T_A[T_A[(Int,Char)]]
case class CC_B[C](a: Boolean, b: (Int,CC_A), c: CC_A) extends T_A[C]
case class CC_C() extends T_B[CC_A]
case class CC_D() extends T_B[CC_A]
case class CC_E(a: T_B[T_A[CC_D]], b: Byte) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
  case CC_E(_, _) => 2 
}
}