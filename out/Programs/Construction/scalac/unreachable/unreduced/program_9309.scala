package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char) extends T_A[(T_B[Char],Byte), D]
case class CC_B(a: Boolean, b: T_A[T_A[Char, (Byte,Boolean)], T_B[Int]]) extends T_A[(T_B[Char],Byte), Int]
case class CC_C[E]() extends T_B[E]

val v_a: T_A[(T_B[Char],Byte), Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(true, _) => 1 
  case CC_B(false, _) => 2 
}
}