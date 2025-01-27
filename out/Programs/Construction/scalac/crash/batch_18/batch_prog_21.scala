package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B(a: CC_A[T_B[Boolean, Char], T_B[Byte, Byte]], b: CC_A[(Boolean,Byte), T_B[Int, Int]], c: T_A[CC_A[Byte, Boolean], Boolean]) extends T_B[T_A[T_B[Char, Boolean], (Char,Int)], Byte]

val v_a: T_B[T_A[T_B[Char, Boolean], (Char,Int)], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
}
}