package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Byte, b: T_A[T_A[Boolean, Char], (Char,Boolean)], c: T_A[T_A[Char, (Int,Byte)], (Boolean,Boolean)]) extends T_A[T_B[Boolean], T_A[(Char,Char), (Int,Char)]]
case class CC_B(a: (T_A[(Int,Byte), Char],Char), b: Byte) extends T_A[T_B[Boolean], T_A[(Char,Char), (Int,Char)]]
case class CC_C() extends T_A[T_B[Boolean], T_A[(Char,Char), (Int,Char)]]
case class CC_D[D](a: (CC_C,Int), b: Int) extends T_B[D]
case class CC_E[E](a: E, b: E) extends T_B[E]

val v_a: T_A[T_B[Boolean], T_A[(Char,Char), (Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}