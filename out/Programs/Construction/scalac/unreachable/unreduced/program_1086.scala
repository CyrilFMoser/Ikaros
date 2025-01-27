package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, (T_A[Boolean, Char],(Boolean,Byte))]
case class CC_B[D, E](a: Int, b: Boolean, c: D) extends T_A[D, (T_A[Boolean, Char],(Boolean,Byte))]
case class CC_C[F](a: CC_B[T_A[F, F], T_A[F, (Byte,Byte)]], b: F, c: T_A[F, F]) extends T_A[F, (T_A[Boolean, Char],(Boolean,Byte))]

val v_a: T_A[Byte, (T_A[Boolean, Char],(Boolean,Byte))] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, true, 0) => 1 
  case CC_B(_, false, 0) => 2 
  case CC_B(_, true, _) => 3 
  case CC_B(_, false, _) => 4 
  case CC_C(_, _, _) => 5 
}
}