package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Byte, T_A[T_A[(Int,Boolean), Char], T_A[Char, (Byte,Byte)]]]
case class CC_B(a: CC_A, b: CC_A, c: T_A[CC_A, CC_A]) extends T_A[Byte, T_A[T_A[(Int,Boolean), Char], T_A[Char, (Byte,Byte)]]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[Byte, T_A[T_A[(Int,Boolean), Char], T_A[Char, (Byte,Byte)]]]

val v_a: T_A[Byte, T_A[T_A[(Int,Boolean), Char], T_A[Char, (Byte,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
  case CC_C(CC_B(_, _, _), _) => 2 
}
}