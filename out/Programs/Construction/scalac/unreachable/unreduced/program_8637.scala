package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B], c: T_A[B]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A[T_A[Byte]], b: T_A[T_A[(Char,Char)]], c: CC_A[Byte]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
}
}