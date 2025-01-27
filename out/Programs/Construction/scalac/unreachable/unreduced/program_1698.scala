package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Int], (Int,Boolean)], b: Byte, c: T_A[(Int,Char), T_A[Boolean, Int]]) extends T_A[(T_A[Byte, Byte],T_A[Int, Boolean]), T_A[T_A[Int, Int], Byte]]
case class CC_B() extends T_A[(T_A[Byte, Byte],T_A[Int, Boolean]), T_A[T_A[Int, Int], Byte]]
case class CC_C() extends T_A[(T_A[Byte, Byte],T_A[Int, Boolean]), T_A[T_A[Int, Int], Byte]]

val v_a: T_A[(T_A[Byte, Byte],T_A[Int, Boolean]), T_A[T_A[Int, Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}