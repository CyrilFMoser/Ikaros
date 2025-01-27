package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Char, Byte], T_B[Boolean, Char]]]
case class CC_B() extends T_A[T_B[T_B[Char, Byte], T_B[Boolean, Char]]]
case class CC_C() extends T_A[T_B[T_B[Char, Byte], T_B[Boolean, Char]]]
case class CC_D[D](a: D, b: T_A[D]) extends T_B[Char, D]
case class CC_E() extends T_B[Char, T_A[CC_D[CC_B]]]
case class CC_F(a: CC_D[CC_A]) extends T_B[Char, T_A[CC_D[CC_B]]]

val v_a: T_B[Char, T_A[CC_D[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E() => 1 
  case CC_F(CC_D(_, _)) => 2 
}
}