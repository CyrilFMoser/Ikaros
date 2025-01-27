package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Char, Char], ((Char,Char),Byte)], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[Char, Char], ((Char,Char),Byte)], D]
case class CC_C[E](a: T_A[E, E]) extends T_A[T_A[T_A[Char, Char], ((Char,Char),Byte)], E]

val v_a: T_A[T_A[T_A[Char, Char], ((Char,Char),Byte)], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}