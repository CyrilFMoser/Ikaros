package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Byte]]) extends T_A[T_A[T_A[(Char,Int)]]]
case class CC_B(a: T_A[(CC_A,CC_A)], b: T_A[T_A[CC_A]], c: T_A[CC_A]) extends T_A[T_A[T_A[(Char,Int)]]]
case class CC_C() extends T_A[T_A[T_A[(Char,Int)]]]

val v_a: T_A[T_A[T_A[(Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}