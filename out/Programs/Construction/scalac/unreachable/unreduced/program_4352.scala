package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Int]], c: T_A[T_A[Int]]) extends T_A[T_A[T_A[(Byte,Byte)]]]
case class CC_B() extends T_A[T_A[T_A[(Byte,Byte)]]]

val v_a: T_A[T_A[T_A[(Byte,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}