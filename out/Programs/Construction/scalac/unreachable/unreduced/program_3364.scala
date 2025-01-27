package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Byte], b: T_B[T_B[Boolean]]) extends T_A[T_B[Boolean]]
case class CC_B[C](a: T_B[C]) extends T_A[C]
case class CC_C(a: T_A[T_B[Boolean]]) extends T_A[T_B[Boolean]]
case class CC_D(a: (T_A[CC_A],(CC_A,CC_A))) extends T_B[T_A[CC_C]]
case class CC_E(a: T_B[T_A[CC_C]], b: CC_D, c: Boolean) extends T_B[T_A[CC_C]]

val v_a: T_B[T_A[CC_C]] = null
val v_b: Int = v_a match{
  case CC_D((CC_B(_),(_,_))) => 0 
  case CC_E(_, _, _) => 1 
}
}