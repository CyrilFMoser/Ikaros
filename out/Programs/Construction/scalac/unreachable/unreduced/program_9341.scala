package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_A[Char]), b: T_A[(T_B,T_B)]) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_A[((Boolean,Byte),T_B)], b: (T_A[T_B],T_B), c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: T_B, b: T_A[CC_A], c: CC_B) extends T_B
case class CC_D[B](a: (CC_B,T_B), b: T_A[B], c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, _, _) => 1 
}
}