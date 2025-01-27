package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean) extends T_A[T_A[T_B[Boolean, Int], T_A[Char, (Char,Byte)]], E]
case class CC_B[F](a: F) extends T_A[T_A[T_B[Boolean, Int], T_A[Char, (Char,Byte)]], F]
case class CC_C[G](a: CC_A[G], b: CC_A[G], c: (T_A[Int, Boolean],T_B[Byte, Int])) extends T_A[T_A[T_B[Boolean, Int], T_A[Char, (Char,Byte)]], G]

val v_a: T_A[T_A[T_B[Boolean, Int], T_A[Char, (Char,Byte)]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(true) => 0 
  case CC_A(false) => 1 
  case CC_B(_) => 2 
  case CC_C(_, _, (_,_)) => 3 
}
}