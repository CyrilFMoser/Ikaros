package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[((Char,Boolean),Int)], b: T_A[T_B[Boolean]]) extends T_A[T_B[(Char,Char)]]
case class CC_B(a: Char) extends T_A[T_B[(Char,Char)]]
case class CC_C[C](a: T_B[C], b: CC_B, c: C) extends T_A[T_B[(Char,Char)]]
case class CC_D[D](a: D, b: T_B[D]) extends T_B[D]
case class CC_E(a: (T_B[CC_A],T_B[CC_A]), b: CC_D[T_B[CC_A]], c: CC_D[T_B[CC_A]]) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_A[T_B[(Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)