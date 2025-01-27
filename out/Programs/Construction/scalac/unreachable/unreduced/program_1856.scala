package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Boolean], Char]) extends T_A[Byte, T_A[T_A[Int, Int], T_A[(Char,Int), Int]]]
case class CC_B() extends T_A[Byte, T_A[T_A[Int, Int], T_A[(Char,Int), Int]]]

val v_a: T_A[Byte, T_A[T_A[Int, Int], T_A[(Char,Int), Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}