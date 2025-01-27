package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_B, b: CC_A[D], c: CC_A[D]) extends T_A[D, T_A[D, D]]
case class CC_C(a: CC_B[T_A[(Boolean,Int), T_B]], b: (CC_B[Boolean],CC_A[T_B]), c: CC_B[CC_B[T_B]]) extends T_A[T_B, T_A[T_B, T_B]]
case class CC_D(a: CC_A[Byte], b: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_E(a: CC_A[(CC_D,T_B)], b: Char, c: Char) extends T_B
case class CC_F(a: Boolean, b: CC_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), CC_A(_)) => 0 
  case CC_D(CC_A(_), CC_B(_, _, CC_A(_))) => 1 
  case CC_E(_, _, _) => 2 
  case CC_F(_, CC_A(_)) => 3 
}
}
// This is not matched: CC_D(CC_A(_), CC_C(CC_B(_, _, _), (_,_), _))