package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean, b: Int, c: T_B[T_A[Boolean]]) extends T_A[T_B[T_B[Int]]]
case class CC_B() extends T_A[T_B[T_B[Int]]]
case class CC_C[C](a: T_A[C], b: CC_A, c: CC_B) extends T_B[C]
case class CC_D(a: T_B[CC_C[CC_B]], b: T_B[T_B[Byte]]) extends T_B[Byte]

val v_a: T_A[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(true, 12, CC_C(_, _, _)) => 0 
  case CC_A(true, _, CC_C(_, _, _)) => 1 
  case CC_A(false, 12, CC_C(_, _, _)) => 2 
  case CC_A(false, _, CC_C(_, _, _)) => 3 
  case CC_B() => 4 
}
}