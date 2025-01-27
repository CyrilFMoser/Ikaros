package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Byte], b: Byte, c: T_A[C, C]) extends T_A[C, Byte]
case class CC_B(a: T_A[Boolean, T_A[Byte, Byte]], b: T_A[Char, Byte], c: T_A[CC_A[Byte], (Boolean,Int)]) extends T_A[Char, Byte]
case class CC_C[D](a: Boolean) extends T_A[D, Byte]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), 0, _) => 0 
  case CC_A(CC_C(_), 0, _) => 1 
  case CC_A(CC_A(_, _, _), _, _) => 2 
  case CC_A(CC_C(_), _, _) => 3 
  case CC_C(_) => 4 
}
}