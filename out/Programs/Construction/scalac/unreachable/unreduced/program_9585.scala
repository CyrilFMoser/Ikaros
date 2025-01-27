package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C) extends T_A[C]
case class CC_B(a: Char) extends T_B[CC_A[T_B[Byte]]]
case class CC_C() extends T_B[CC_A[T_B[Byte]]]
case class CC_D(a: (T_B[CC_B],CC_A[CC_B]), b: T_B[Boolean]) extends T_B[CC_A[T_B[Byte]]]

val v_a: T_B[CC_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_B(_)