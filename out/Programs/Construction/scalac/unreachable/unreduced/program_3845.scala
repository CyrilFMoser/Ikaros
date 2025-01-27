package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, T_A[(Boolean,Int), Byte]]) extends T_A[T_A[(Char,Char), T_A[Int, Byte]], T_A[T_A[(Int,Int), Boolean], Char]]
case class CC_B(a: (Boolean,Boolean)) extends T_A[T_A[(Char,Char), T_A[Int, Byte]], T_A[T_A[(Int,Int), Boolean], Char]]
case class CC_C() extends T_A[T_A[(Char,Char), T_A[Int, Byte]], T_A[T_A[(Int,Int), Boolean], Char]]

val v_a: T_A[T_A[(Char,Char), T_A[Int, Byte]], T_A[T_A[(Int,Int), Boolean], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}