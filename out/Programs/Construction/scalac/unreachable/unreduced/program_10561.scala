package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[(Char,Char)]], b: T_B[T_B[(Int,Boolean)]], c: T_B[Boolean]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: (Int,((Int,Char),CC_A)), c: T_B[T_B[CC_A]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C() extends T_A[T_A[T_A[Byte]]]
case class CC_D[C]() extends T_B[C]
case class CC_E(a: CC_D[Boolean], b: T_B[Char], c: CC_B) extends T_B[CC_B]
case class CC_F(a: CC_C, b: CC_A) extends T_B[CC_B]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(), CC_D()) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}