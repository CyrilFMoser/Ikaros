package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Char]]) extends T_A[T_A[T_A[(Int,Byte)]]]
case class CC_B() extends T_A[T_A[T_A[(Int,Byte)]]]
case class CC_C(a: T_A[CC_B]) extends T_A[T_A[T_A[(Int,Byte)]]]

val v_a: T_A[T_A[T_A[(Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}