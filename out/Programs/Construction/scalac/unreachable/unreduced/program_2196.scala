package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]], b: T_B[Int, T_B[Boolean, Int]], c: T_A[T_B[Char, Boolean]]) extends T_A[T_B[(Int,Byte), T_B[Char, Int]]]
case class CC_B(a: T_B[CC_A, T_B[Byte, Char]], b: Char) extends T_A[T_B[(Int,Byte), T_B[Char, Int]]]
case class CC_C(a: Byte, b: CC_B) extends T_A[T_B[(Int,Byte), T_B[Char, Int]]]

val v_a: T_A[T_B[(Int,Byte), T_B[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}