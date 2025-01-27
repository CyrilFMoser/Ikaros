package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[Byte, E]
case class CC_B[F](a: T_B[F, F], b: (T_A[Byte, Char],Char)) extends T_A[Byte, F]
case class CC_C(a: CC_B[(Byte,Int)], b: T_A[CC_A[Byte], ((Int,Byte),Char)]) extends T_A[Byte, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (CC_B(_, _),_)) => 1 
  case CC_B(_, (CC_C(_, _),_)) => 2 
  case CC_C(CC_B(_, _), _) => 3 
}
}
// This is not matched: CC_B(_, (CC_A(_),_))