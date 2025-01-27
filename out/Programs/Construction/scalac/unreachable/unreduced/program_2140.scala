package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: CC_A, b: Int, c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C() extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: T_A[CC_A], b: CC_B, c: Boolean) extends T_B
case class CC_E(a: CC_D, b: ((CC_D,CC_C),CC_C), c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(_, _, CC_A(_, CC_D(_, _, _))) => 0 
  case CC_E(_, _, CC_A(_, CC_E(_, _, _))) => 1 
}
}
// This is not matched: CC_D(_, _, _)