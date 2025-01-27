package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Boolean, C], b: T_A[C, C], c: C) extends T_A[T_A[(Char,Char), Boolean], C]
case class CC_B() extends T_A[T_A[(Char,Char), Boolean], T_A[T_A[Char, Boolean], T_A[Byte, Byte]]]

val v_a: T_A[T_A[(Char,Char), Boolean], T_A[T_A[Char, Boolean], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}