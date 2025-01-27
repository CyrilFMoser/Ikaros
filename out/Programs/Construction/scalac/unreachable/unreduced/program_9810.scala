package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, (((Char,Byte),Char),T_A[(Int,Byte), Int])]
case class CC_B(a: T_A[T_A[Char, Char], CC_A[Boolean]], b: T_B[T_B[Char, Int], ((Int,Int),(Byte,Int))], c: CC_A[T_A[Boolean, Char]]) extends T_A[Byte, (((Char,Byte),Char),T_A[(Int,Byte), Int])]
case class CC_C[F](a: CC_B) extends T_B[F, Int]

val v_a: T_A[Byte, (((Char,Byte),Char),T_A[(Int,Byte), Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}