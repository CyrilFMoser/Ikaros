package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[Byte]]]
case class CC_B(a: T_A[T_B[CC_A]]) extends T_A[T_B[T_B[Byte]]]
case class CC_C[C](a: T_B[C], b: T_A[C], c: T_A[C]) extends T_B[C]
case class CC_D[D]() extends T_B[D]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, _) => 0 
  case CC_C(CC_C(CC_D(), _, _), _, _) => 1 
  case CC_C(CC_D(), _, _) => 2 
  case CC_D() => 3 
}
}