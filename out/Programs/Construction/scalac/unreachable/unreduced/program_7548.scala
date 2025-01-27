package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[(Byte,Int)]], b: T_B[T_B[Int, Boolean], (Int,Char)]) extends T_A[T_A[T_B[(Byte,Byte), (Boolean,Char)]]]
case class CC_B(a: T_B[Boolean, CC_A]) extends T_A[T_A[T_B[(Byte,Byte), (Boolean,Char)]]]
case class CC_C(a: T_B[T_A[CC_A], CC_B]) extends T_A[T_A[T_B[(Byte,Byte), (Boolean,Char)]]]
case class CC_D[D, E]() extends T_B[D, E]
case class CC_E[F]() extends T_B[Int, F]

val v_a: T_A[T_A[T_B[(Byte,Byte), (Boolean,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D()) => 0 
  case CC_B(CC_D()) => 1 
}
}
// This is not matched: CC_C(CC_D())