package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, T_A[D, D]]
case class CC_B(a: CC_A[CC_A[Byte]], b: T_A[Int, Boolean]) extends T_B[CC_A[((Int,Byte),(Int,Char))]]
case class CC_C(a: T_A[T_B[CC_B], T_A[CC_B, CC_B]]) extends T_B[CC_A[((Int,Byte),(Int,Char))]]
case class CC_D() extends T_B[CC_A[((Int,Byte),(Int,Char))]]

val v_a: T_B[CC_A[((Int,Byte),(Int,Char))]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C(_)