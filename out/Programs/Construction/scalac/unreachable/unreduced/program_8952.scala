package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[(Boolean,Boolean)]], b: Byte) extends T_A[T_A[T_B[Int]]]
case class CC_B[C](a: C, b: ((CC_A,(Char,Char)),T_A[CC_A]), c: T_B[C]) extends T_A[T_A[T_B[Int]]]
case class CC_C(a: CC_B[CC_A], b: CC_A, c: CC_A) extends T_A[T_A[T_B[Int]]]
case class CC_D[D](a: Boolean) extends T_B[D]

val v_a: T_A[T_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B(_, _, CC_D(_)), CC_A(_, _), CC_A(_, _)) => 1 
}
}
// This is not matched: CC_A(_, _)