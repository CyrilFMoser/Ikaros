package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Byte,Byte)]], b: T_A[T_A[Int]], c: T_A[(Int,Boolean)]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Int]]]
case class CC_C() extends T_A[CC_A]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}