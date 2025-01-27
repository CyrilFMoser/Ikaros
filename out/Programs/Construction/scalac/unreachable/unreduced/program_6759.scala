package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: Boolean, c: T_A[(Boolean,Byte)]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A, b: (CC_A,T_A[CC_A]), c: T_A[Char]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}