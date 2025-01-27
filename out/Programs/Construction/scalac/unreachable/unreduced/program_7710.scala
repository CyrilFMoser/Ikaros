package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Char,Char)]], b: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_A, b: Int, c: CC_A) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, 12, _) => 2 
  case CC_C(_, _, _) => 3 
}
}