package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, (T_B,T_A[T_B, T_B])]
case class CC_C(a: CC_B[CC_B[T_B]], b: (T_A[T_B, T_B],T_B), c: CC_A[CC_B[T_B]]) extends T_B
case class CC_D(a: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_), (_,_), CC_A(_, _)) => 0 
  case CC_D(_) => 1 
}
}