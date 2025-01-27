package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: Char) extends T_A[T_A[T_A[Char, Char], T_A[Boolean, (Boolean,Byte)]], C]
case class CC_B[D, E]() extends T_A[T_A[T_A[Char, Char], T_A[Boolean, (Boolean,Byte)]], D]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Boolean, (Boolean,Byte)]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}