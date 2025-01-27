package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,Byte)], b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[(Int,Char)]]]
case class CC_B(a: (T_A[Char],Int)) extends T_A[T_A[T_A[(Int,Char)]]]
case class CC_C() extends T_A[T_A[T_A[(Int,Char)]]]

val v_a: T_A[T_A[T_A[(Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_)) => 1 
  case CC_C() => 2 
}
}