package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Int], Char], b: T_A[T_A[Int, Char], Byte], c: T_A[T_A[Byte, Char], T_A[Byte, Boolean]]) extends T_A[T_A[T_A[Boolean, Char], T_A[Byte, Int]], T_A[T_A[Boolean, Int], (Byte,Char)]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Boolean, Char], T_A[Byte, Int]], T_A[T_A[Boolean, Int], (Byte,Char)]]
case class CC_C(a: CC_B, b: CC_B) extends T_A[T_A[T_A[Boolean, Char], T_A[Byte, Int]], T_A[T_A[Boolean, Int], (Byte,Char)]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Byte, Int]], T_A[T_A[Boolean, Int], (Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), CC_B(_)) => 2 
}
}