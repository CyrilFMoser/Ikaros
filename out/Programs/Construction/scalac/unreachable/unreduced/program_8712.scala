package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Char], T_A[(Int,Int), Byte]], b: T_A[Byte, T_A[Boolean, Int]]) extends T_A[(T_A[Boolean, (Char,Byte)],T_A[Int, Boolean]), T_A[T_A[Byte, Boolean], Byte]]
case class CC_B() extends T_A[(T_A[Boolean, (Char,Byte)],T_A[Int, Boolean]), T_A[T_A[Byte, Boolean], Byte]]

val v_a: T_A[(T_A[Boolean, (Char,Byte)],T_A[Int, Boolean]), T_A[T_A[Byte, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}