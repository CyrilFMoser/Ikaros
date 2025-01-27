package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean) extends T_A[T_A[T_A[Boolean, Char], T_A[Byte, Char]], C]
case class CC_B(a: T_A[CC_A[Boolean], T_A[Int, Boolean]], b: T_A[T_A[Char, Byte], T_A[(Char,Byte), Boolean]]) extends T_A[T_A[T_A[Boolean, Char], T_A[Byte, Char]], (Byte,T_A[(Char,Char), Boolean])]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Byte, Char]], (Byte,T_A[(Char,Char), Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}