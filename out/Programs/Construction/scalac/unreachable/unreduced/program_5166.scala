package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: D, b: Byte) extends T_A[C]
case class CC_B() extends T_B[T_B[(Int,Int)]]
case class CC_C() extends T_B[T_B[(Int,Int)]]
case class CC_D(a: CC_B, b: T_B[T_A[CC_B]], c: CC_B) extends T_B[T_B[(Int,Int)]]

val v_a: T_B[T_B[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(_, _, CC_B()) => 1 
}
}
// This is not matched: CC_C()