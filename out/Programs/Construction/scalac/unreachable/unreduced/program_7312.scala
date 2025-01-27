package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Byte], Char], b: T_A[T_A[(Byte,Byte), Char], T_A[Byte, Boolean]], c: T_A[T_A[Int, Char], T_A[Boolean, Char]]) extends T_A[Int, T_A[(Boolean,Int), T_A[Char, Boolean]]]
case class CC_B() extends T_A[Int, T_A[(Boolean,Int), T_A[Char, Boolean]]]

val v_a: T_A[Int, T_A[(Boolean,Int), T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}