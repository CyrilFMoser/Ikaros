package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[(Byte,Byte)]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C[D](a: T_B[CC_B, T_B[CC_B, Int]], b: D, c: T_A[D]) extends T_B[CC_B, D]
case class CC_D[F]() extends T_B[CC_B, F]

val v_a: T_B[CC_B, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, CC_C(_, _, _), _), _, _) => 0 
  case CC_C(CC_C(_, CC_D(), _), _, _) => 1 
  case CC_C(CC_D(), _, _) => 2 
  case CC_D() => 3 
}
}