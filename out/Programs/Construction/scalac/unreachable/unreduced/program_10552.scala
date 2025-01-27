package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Byte], T_A[Char, Char]], b: T_A[T_A[Boolean, Char], (Boolean,Char)]) extends T_A[((Char,Byte),T_A[(Char,Byte), Int]), (T_A[Int, Boolean],T_A[Char, Byte])]
case class CC_B() extends T_A[Char, CC_A]
case class CC_C(a: Int, b: Byte) extends T_A[((Char,Byte),T_A[(Char,Byte), Int]), (T_A[Int, Boolean],T_A[Char, Byte])]

val v_a: T_A[((Char,Byte),T_A[(Char,Byte), Int]), (T_A[Int, Boolean],T_A[Char, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, 0) => 1 
}
}
// This is not matched: CC_C(_, _)