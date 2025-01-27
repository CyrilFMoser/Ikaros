package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Boolean, b: T_A[T_B[Byte, Char], T_B[Int, Int]], c: T_B[T_A[Char, Int], T_A[Int, (Char,Boolean)]]) extends T_A[T_B[T_A[Int, Char], T_B[Byte, Char]], T_A[T_A[Boolean, Byte], Boolean]]
case class CC_B(a: CC_A) extends T_A[T_B[T_A[Int, Char], T_B[Byte, Char]], T_A[T_A[Boolean, Byte], Boolean]]
case class CC_C[E, F](a: CC_A) extends T_B[E, F]
case class CC_D() extends T_B[CC_B, CC_C[CC_B, Byte]]
case class CC_E[G](a: (CC_B,T_B[CC_A, CC_B]), b: T_B[CC_B, CC_C[CC_B, Byte]]) extends T_B[G, Char]

val v_a: T_B[CC_B, CC_C[CC_B, Byte]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
  case CC_D() => 1 
}
}