package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: C) extends T_A[C, T_A[T_A[(Char,Byte), Byte], T_A[Int, Boolean]]]
case class CC_B[D](a: D) extends T_A[D, T_A[T_A[(Char,Byte), Byte], T_A[Int, Boolean]]]
case class CC_C(a: CC_A[T_A[Boolean, Boolean]]) extends T_A[Char, T_A[T_A[(Char,Byte), Byte], T_A[Int, Boolean]]]

val v_a: T_A[Char, T_A[T_A[(Char,Byte), Byte], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(_, _, _)) => 2 
}
}