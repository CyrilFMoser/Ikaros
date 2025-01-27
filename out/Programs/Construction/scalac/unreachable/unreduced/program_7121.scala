package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[D], b: Byte, c: Int) extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D() extends T_B[T_A[T_A[Char]]]
case class CC_E(a: (CC_D,CC_B[CC_D]), b: T_B[CC_B[Boolean]]) extends T_B[T_A[T_A[Char]]]

val v_a: T_A[CC_E] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}