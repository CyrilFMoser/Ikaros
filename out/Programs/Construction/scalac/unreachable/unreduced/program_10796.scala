package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Boolean], T_A[Char, Int]]) extends T_A[T_A[T_A[Boolean, Int], (Byte,Byte)], T_A[T_A[Byte, Char], T_A[Boolean, Int]]]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Boolean, Int], (Byte,Byte)], T_A[T_A[Byte, Char], T_A[Boolean, Int]]]

val v_a: T_A[T_A[T_A[Boolean, Int], (Byte,Byte)], T_A[T_A[Byte, Char], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}