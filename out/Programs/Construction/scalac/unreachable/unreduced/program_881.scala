package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[(Char,Int)]]) extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_B[T_A[Boolean]]]
case class CC_C(a: T_B[CC_B], b: Boolean) extends T_A[T_B[T_A[Boolean]]]
case class CC_D[C](a: Int, b: (T_A[CC_B],(Byte,CC_B)), c: CC_B) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]
case class CC_F(a: Boolean, b: CC_C, c: CC_E) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(12, (_,_), CC_B(_, _)) => 0 
  case CC_E() => 1 
  case CC_F(_, _, CC_E()) => 2 
}
}
// This is not matched: CC_D(_, (_,_), CC_B(_, _))