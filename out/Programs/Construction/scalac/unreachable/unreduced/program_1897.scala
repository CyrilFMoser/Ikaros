package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Boolean,Byte)], b: T_A[T_A[Boolean]], c: T_A[Char]) extends T_A[T_B[T_A[Boolean]]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D](a: T_B[D], b: D, c: T_A[D]) extends T_B[D]
case class CC_D() extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, _) => 1 
  case CC_C(CC_C(CC_B(), _, _), _, _) => 2 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, _) => 3 
  case CC_C(CC_D(), _, _) => 4 
  case CC_D() => 5 
}
}
// This is not matched: CC_C(CC_C(CC_D(), _, _), _, _)