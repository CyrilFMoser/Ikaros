package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[(Boolean,Byte)], T_B[Boolean, Int]], b: T_B[(Byte,Char), T_A[Byte]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C[D](a: D, b: T_B[D, CC_A]) extends T_B[D, CC_A]
case class CC_D(a: Int) extends T_B[CC_B, CC_A]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}