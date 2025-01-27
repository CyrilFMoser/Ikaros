package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D) extends T_A[D]
case class CC_B(a: CC_A[Char], b: CC_A[Char], c: CC_A[Byte]) extends T_A[T_B[Byte, (Char,Char)]]
case class CC_C(a: Byte, b: CC_A[CC_B]) extends T_A[T_B[Byte, (Char,Char)]]
case class CC_D(a: T_A[(Byte,Char)], b: T_A[Boolean]) extends T_B[((Boolean,Int),Char), T_A[Byte]]

val v_a: T_A[T_B[Byte, (Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, CC_A(_, _)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)) => 2 
  case CC_B(_, CC_A(_, _), _) => 3 
  case CC_A(_, _) => 4 
  case CC_A(CC_C(_, _), _) => 5 
  case CC_A(CC_A(_, _), _) => 6 
  case CC_C(_, _) => 7 
  case CC_C(0, _) => 8 
}
}