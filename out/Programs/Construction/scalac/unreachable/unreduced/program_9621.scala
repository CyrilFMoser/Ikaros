package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Byte, (Byte,Byte)]) extends T_A[T_B[T_B[Char, Boolean], T_A[Int]]]
case class CC_B[D](a: (T_B[Byte, CC_A],T_B[Int, CC_A])) extends T_B[D, CC_A]
case class CC_C[E](a: CC_B[E], b: CC_A) extends T_B[E, CC_A]
case class CC_D[F]() extends T_B[F, CC_A]

val v_a: T_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_B((_,_)), CC_A(_)) => 1 
}
}
// This is not matched: CC_D()