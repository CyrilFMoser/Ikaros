package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[T_A[T_B[Byte]]]
case class CC_B() extends T_A[T_A[T_B[Byte]]]
case class CC_C(a: T_B[(CC_B,CC_B)], b: T_A[T_B[CC_B]], c: T_B[T_B[CC_B]]) extends T_A[T_A[T_B[Byte]]]
case class CC_D(a: T_A[CC_B], b: T_B[T_A[Boolean]]) extends T_B[T_A[Boolean]]
case class CC_E(a: T_B[T_A[Boolean]], b: Char) extends T_B[Int]

val v_a: T_A[T_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A()