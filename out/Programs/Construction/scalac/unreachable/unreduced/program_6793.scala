package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Char) extends T_A[T_A[Byte]]
case class CC_B(a: Char, b: T_A[T_A[Byte]], c: CC_A) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
}
}