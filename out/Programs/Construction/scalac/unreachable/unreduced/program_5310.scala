package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Char,Char), T_A[Char, Boolean]]) extends T_A[Char, T_A[T_A[Byte, (Int,Int)], T_A[Int, Boolean]]]
case class CC_B() extends T_A[Char, T_A[T_A[Byte, (Int,Int)], T_A[Int, Boolean]]]
case class CC_C(a: T_A[Byte, Boolean]) extends T_A[Char, T_A[T_A[Byte, (Int,Int)], T_A[Int, Boolean]]]

val v_a: T_A[Char, T_A[T_A[Byte, (Int,Int)], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}