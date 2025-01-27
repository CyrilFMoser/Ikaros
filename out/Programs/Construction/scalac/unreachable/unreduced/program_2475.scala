package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: C) extends T_A[T_B[T_B[Byte]]]
case class CC_B[D]() extends T_A[T_B[T_B[Byte]]]
case class CC_C(a: T_A[T_A[Boolean]], b: Byte) extends T_A[T_B[T_B[Byte]]]
case class CC_D() extends T_B[Boolean]

val v_a: T_A[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}