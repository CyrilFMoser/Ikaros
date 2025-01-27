package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Boolean]]) extends T_A[Char]
case class CC_B(a: T_B[T_B[CC_A]], b: T_A[Char]) extends T_A[Char]
case class CC_C(a: T_A[T_A[CC_A]], b: T_B[CC_A], c: (CC_B,(CC_A,CC_B))) extends T_A[Char]
case class CC_D(a: Int) extends T_B[T_A[CC_C]]
case class CC_E(a: (CC_A,T_A[Byte]), b: CC_B, c: T_A[T_A[Char]]) extends T_B[T_A[CC_C]]
case class CC_F(a: T_B[CC_D]) extends T_B[T_A[CC_C]]

val v_a: T_B[T_A[CC_C]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E((CC_A(_),_), CC_B(_, _), _) => 1 
}
}
// This is not matched: CC_F(_)