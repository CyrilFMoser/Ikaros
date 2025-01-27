package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,Int)]) extends T_A[T_A[Char]]
case class CC_B(a: Byte, b: T_A[T_A[Char]], c: Boolean) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}