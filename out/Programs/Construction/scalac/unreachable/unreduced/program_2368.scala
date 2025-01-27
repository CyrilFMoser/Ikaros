package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, Byte], c: T_A[T_A[C, C], C]) extends T_A[C, Byte]
case class CC_B(a: (T_A[Boolean, Byte],T_A[Char, Byte])) extends T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], Byte]
case class CC_C(a: Char) extends T_A[CC_B, Byte]

val v_a: T_A[CC_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C('x') => 1 
  case CC_C(_) => 2 
}
}