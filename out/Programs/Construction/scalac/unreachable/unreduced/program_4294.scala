package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: T_A[Boolean, Char]) extends T_A[Boolean, T_A[T_A[Int, (Int,Byte)], T_A[(Char,Int), Int]]]
case class CC_B() extends T_A[Boolean, T_A[T_A[Int, (Int,Byte)], T_A[(Char,Int), Int]]]

val v_a: T_A[Boolean, T_A[T_A[Int, (Int,Byte)], T_A[(Char,Int), Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}