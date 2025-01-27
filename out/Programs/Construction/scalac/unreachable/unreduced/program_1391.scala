package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Byte]]) extends T_A[T_A[T_A[(Char,Char)]]]
case class CC_B() extends T_A[T_A[T_A[(Char,Char)]]]

val v_a: T_A[T_A[T_A[(Char,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}