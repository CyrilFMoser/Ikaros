package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: Boolean, b: T_B[C, C]) extends T_A
case class CC_B(a: (Byte,T_B[T_A, T_A])) extends T_A
case class CC_C(a: T_B[T_B[T_A, CC_B], ((Byte,Boolean),CC_B)], b: T_B[CC_A[T_A], T_A], c: CC_B) extends T_A
case class CC_D[D](a: T_A) extends T_B[D, CC_A[D]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, CC_B((_,_))) => 1 
}
}
// This is not matched: CC_A(_, _)