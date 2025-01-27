package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Char]], b: T_A[Byte], c: T_B[Int]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B() extends T_A[T_A[T_B[Boolean]]]
case class CC_C() extends T_A[T_A[T_B[Boolean]]]
case class CC_D(a: CC_C, b: CC_A) extends T_B[(CC_B,T_B[CC_B])]

val v_a: T_A[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}