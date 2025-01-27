package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[(Char,Byte)]], b: T_A[Boolean]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Byte, b: T_B[CC_A], c: T_B[T_A[(Boolean,Int)]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: T_B[Int]) extends T_A[T_A[T_A[Boolean]]]
case class CC_D[C](a: T_B[C]) extends T_B[T_B[T_B[CC_C]]]
case class CC_E() extends T_B[T_B[T_B[CC_C]]]
case class CC_F(a: CC_C, b: CC_E) extends T_B[T_B[T_B[CC_C]]]

val v_a: T_B[T_B[T_B[CC_C]]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_F(CC_C(_), CC_E()) => 1 
}
}
// This is not matched: CC_E()