package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Byte,Int)], b: T_B[T_A[Char]]) extends T_A[T_B[T_B[Byte]]]
case class CC_B() extends T_A[T_B[T_B[Byte]]]
case class CC_C(a: T_B[CC_A], b: T_A[(CC_B,CC_B)], c: T_A[T_A[CC_B]]) extends T_A[T_B[T_B[Byte]]]
case class CC_D(a: Int) extends T_B[Boolean]

val v_a: T_A[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}