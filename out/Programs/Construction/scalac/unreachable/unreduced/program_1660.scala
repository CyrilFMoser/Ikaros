package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, (Char,Int)],Boolean), b: T_A[C, C], c: (T_A[Byte, Char],T_A[(Int,Int), Boolean])) extends T_A[T_A[T_A[Boolean, Byte], T_A[Byte, Boolean]], C]
case class CC_B[D](a: Char, b: Boolean) extends T_A[T_A[T_A[Boolean, Byte], T_A[Byte, Boolean]], D]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Byte, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, (_,_)) => 0 
  case CC_B('x', _) => 1 
  case CC_B(_, _) => 2 
}
}