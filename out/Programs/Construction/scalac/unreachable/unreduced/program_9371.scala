package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, Int], T_A[Byte]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A, c: Boolean) extends T_A[T_A[T_A[Byte]]]
case class CC_C() extends T_A[CC_A]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
}
}