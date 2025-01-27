package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, T_A[C, C]], c: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: (((Byte,Char),Byte),T_A[Char, Char]), b: (T_A[Byte, Boolean],T_A[Byte, Byte]), c: D) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_, _, _), _, _) => 1 
  case CC_B(_, _, _) => 2 
}
}