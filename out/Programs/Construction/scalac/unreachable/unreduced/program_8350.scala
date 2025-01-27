package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean, b: T_A[(Byte,Int), (Boolean,Boolean)], c: T_A[(Char,Byte), T_A[Int, Int]]) extends T_A[Byte, T_A[(Int,Int), T_A[Byte, Char]]]
case class CC_B(a: T_A[CC_A, CC_A]) extends T_A[Byte, T_A[(Int,Int), T_A[Byte, Char]]]
case class CC_C(a: CC_B, b: CC_A, c: CC_B) extends T_A[Byte, T_A[(Int,Int), T_A[Byte, Char]]]

val v_a: T_A[Byte, T_A[(Int,Int), T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}