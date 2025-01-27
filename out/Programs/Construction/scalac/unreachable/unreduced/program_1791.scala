package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, T_A[Byte]], b: T_B[(Byte,Boolean), Byte], c: T_A[T_A[Boolean]]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C(a: T_A[Char], b: T_A[Byte]) extends T_A[Byte]
case class CC_D() extends T_B[T_A[Byte], T_A[T_A[CC_B]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}