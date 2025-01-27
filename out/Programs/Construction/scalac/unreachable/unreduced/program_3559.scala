package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Byte, c: (Int,T_A[Char, Byte])) extends T_A[T_A[T_A[Boolean, Byte], T_A[Boolean, Boolean]], C]
case class CC_B[D](a: CC_A[D]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Boolean, Boolean]], D]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Boolean, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (12,_)) => 0 
  case CC_A(_, _, (_,_)) => 1 
  case CC_B(CC_A(_, _, _)) => 2 
}
}