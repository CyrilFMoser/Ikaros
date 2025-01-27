package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C], c: T_B) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[(Int,CC_A[T_B]), (Int,CC_A[T_B])], (Int,CC_A[T_B])]
case class CC_C[D](a: D, b: CC_B) extends T_A[T_A[CC_A[CC_B], CC_A[CC_B]], CC_A[CC_B]]
case class CC_D(a: T_B, b: CC_B) extends T_B
case class CC_E(a: Boolean, b: T_A[T_B, Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, CC_B()), _) => 0 
  case CC_D(CC_E(_, _), _) => 1 
  case CC_E(_, _) => 2 
}
}