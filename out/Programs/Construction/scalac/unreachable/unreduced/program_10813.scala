package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[T_A[T_B[Int]]]
case class CC_B(a: T_A[(Char,Byte)]) extends T_A[T_A[T_B[Int]]]
case class CC_C(a: T_B[T_A[CC_B]], b: (T_A[CC_B],T_A[Int])) extends T_A[T_A[T_B[Int]]]
case class CC_D(a: T_B[CC_C]) extends T_B[T_B[CC_C]]

val v_a: T_A[T_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}