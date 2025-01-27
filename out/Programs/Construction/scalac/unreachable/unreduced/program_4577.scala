package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: Byte) extends T_A[T_B]
case class CC_C(a: ((CC_A,Byte),T_A[CC_B]), b: T_A[Char], c: CC_B) extends T_A[T_B]
case class CC_D[B]() extends T_B
case class CC_E(a: Char, b: (Boolean,CC_B), c: T_A[T_B]) extends T_B
case class CC_F(a: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, CC_B(_)) => 1 
}
}
// This is not matched: CC_B(_)