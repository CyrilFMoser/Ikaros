package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: T_A[T_A[(Byte,Char), (Byte,Char)], (Byte,Char)]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, (_,_))) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
}
}