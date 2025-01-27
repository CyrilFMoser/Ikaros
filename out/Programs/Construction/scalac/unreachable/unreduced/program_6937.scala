package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[T_A[Boolean]], b: T_A[T_A[CC_A]], c: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}