package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, (Int,Int)], T_B[Int, Int]], b: T_A[(Boolean,Boolean)], c: T_B[T_B[Int, Char], T_A[Int]]) extends T_A[T_B[(Char,Int), T_B[(Byte,Char), Byte]]]
case class CC_B(a: Byte, b: Int) extends T_A[T_B[(Char,Int), T_B[(Byte,Char), Byte]]]
case class CC_C(a: Boolean) extends T_A[T_B[(Char,Int), T_B[(Byte,Char), Byte]]]

val v_a: T_A[T_B[(Char,Int), T_B[(Byte,Char), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _)