package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, (Boolean,Byte)]], b: T_A[T_B[Boolean, Byte]], c: T_A[Byte]) extends T_A[T_B[Int, T_B[Char, Boolean]]]
case class CC_B[D](a: T_B[Byte, (CC_A,Byte)]) extends T_B[Byte, D]
case class CC_C(a: CC_A, b: CC_A) extends T_B[Byte, T_B[Byte, CC_B[CC_A]]]

val v_a: T_B[Byte, T_B[Byte, CC_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_C(_, CC_A(_, _, _)) => 1 
}
}