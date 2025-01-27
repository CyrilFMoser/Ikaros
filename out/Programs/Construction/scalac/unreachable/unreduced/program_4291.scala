package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Boolean], T_A[Byte, Int]]) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Boolean]], T_A[T_A[Byte, (Byte,Int)], T_A[Boolean, Char]]]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Boolean]], T_A[T_A[Byte, (Byte,Int)], T_A[Boolean, Char]]]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Int, Boolean]], T_A[T_A[Byte, (Byte,Int)], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}