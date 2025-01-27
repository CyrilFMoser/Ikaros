package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: T_A[Boolean, Char]) extends T_A[T_A[T_A[Char, Boolean], Byte], ((Boolean,Byte),T_A[Char, Boolean])]
case class CC_B() extends T_A[T_A[T_A[Char, Boolean], Byte], ((Boolean,Byte),T_A[Char, Boolean])]
case class CC_C[C](a: C) extends T_A[C, CC_A]

val v_a: T_A[T_A[T_A[Char, Boolean], Byte], ((Boolean,Byte),T_A[Char, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}