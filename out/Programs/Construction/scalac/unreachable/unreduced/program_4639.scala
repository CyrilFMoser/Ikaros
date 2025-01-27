package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Boolean) extends T_A[T_A[T_A[Char]]]
case class CC_B[B](a: CC_A, b: CC_A, c: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, true) => 0 
  case CC_A(_, false) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}