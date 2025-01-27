package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[Byte]) extends T_A[B]
case class CC_B[C](a: T_A[C]) extends T_A[C]
case class CC_C(a: T_A[T_B]) extends T_A[CC_B[T_A[T_B]]]
case class CC_D[D](a: T_A[D], b: CC_A[D]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: T_A[CC_E], b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_F(_, _) => 1 
}
}
// This is not matched: CC_D(_, _)