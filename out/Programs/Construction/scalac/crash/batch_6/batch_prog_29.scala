package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, (T_A[(Byte,Byte), Char],T_A[Int, Byte])]
case class CC_B[D](a: D) extends T_A[D, (T_A[(Byte,Byte), Char],T_A[Int, Byte])]
case class CC_C[E]() extends T_A[E, (T_A[(Byte,Byte), Char],T_A[Int, Byte])]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}