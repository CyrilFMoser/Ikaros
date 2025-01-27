package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C]) extends T_A[(Boolean,Byte), C]
case class CC_B() extends T_A[T_A[Boolean, T_A[Byte, Byte]], CC_A[CC_A[(Char,Byte), (Byte,Int)], CC_A[Int, Byte]]]
case class CC_C(a: T_A[Byte, CC_A[CC_B, CC_B]], b: CC_A[CC_A[CC_B, Char], CC_A[CC_B, CC_B]]) extends T_A[T_A[Boolean, T_A[Byte, Byte]], CC_A[CC_A[(Char,Byte), (Byte,Int)], CC_A[Int, Byte]]]

val v_a: T_A[T_A[Boolean, T_A[Byte, Byte]], CC_A[CC_A[(Char,Byte), (Byte,Int)], CC_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(_)) => 1 
}
}