package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Boolean], T_A[(Int,Int), Int]]) extends T_A[T_A[(Byte,Int), T_A[(Int,Int), Char]], T_A[T_A[Boolean, Boolean], Byte]]
case class CC_B() extends T_A[T_A[(Byte,Int), T_A[(Int,Int), Char]], T_A[T_A[Boolean, Boolean], Byte]]

val v_a: T_A[T_A[(Byte,Int), T_A[(Int,Int), Char]], T_A[T_A[Boolean, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}