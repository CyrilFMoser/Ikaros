package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,Int)], b: (T_A[Boolean],T_A[(Int,Boolean)])) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_A[CC_B], b: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}