package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[((Char,Boolean),Byte)], b: T_B[T_B[(Byte,Boolean)]], c: T_A[Int]) extends T_A[T_B[T_B[Boolean]]]
case class CC_B(a: Char) extends T_A[T_B[T_B[Boolean]]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_B[T_B[Boolean]]]
case class CC_D[C](a: Char) extends T_B[C]
case class CC_E[D](a: T_B[D]) extends T_B[D]

val v_a: T_A[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, CC_A(_, _, _))