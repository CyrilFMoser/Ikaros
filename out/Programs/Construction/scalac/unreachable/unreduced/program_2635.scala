package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, C], c: T_A[C, T_A[C, C]]) extends T_A[T_A[C, C], C]
case class CC_B(a: (T_A[Byte, (Boolean,Byte)],Byte), b: Int) extends T_A[T_A[((Byte,Char),T_A[Char, Byte]), ((Byte,Char),T_A[Char, Byte])], ((Byte,Char),T_A[Char, Byte])]
case class CC_C[D](a: D) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_) => 1 
}
}