package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: C) extends T_A[C, T_A[T_A[Int, Boolean], Char]]
case class CC_B() extends T_A[(Boolean,T_A[Byte, Boolean]), T_A[T_A[Int, Boolean], Char]]

val v_a: T_A[(Boolean,T_A[Byte, Boolean]), T_A[T_A[Int, Boolean], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
}
}