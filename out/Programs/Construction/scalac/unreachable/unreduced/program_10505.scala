package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_B[Byte]]]
case class CC_B(a: T_B[T_A[CC_A]], b: T_B[T_B[(Boolean,Int)]]) extends T_A[T_A[T_B[Byte]]]
case class CC_C() extends T_A[T_A[T_B[Byte]]]
case class CC_D[C](a: CC_C, b: T_A[C]) extends T_B[C]

val v_a: T_A[T_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(_, _), CC_D(_, _)) => 1 
  case CC_C() => 2 
}
}