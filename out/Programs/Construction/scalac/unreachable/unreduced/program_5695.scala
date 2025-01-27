package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[E]) extends T_A[D, E]
case class CC_B() extends T_A[((Byte,Char),Boolean), (T_B[Byte],T_A[Byte, Int])]
case class CC_C(a: Int) extends T_A[((Byte,Char),Boolean), (T_B[Byte],T_A[Byte, Int])]
case class CC_D[F](a: CC_B, b: CC_B) extends T_B[CC_A[T_A[CC_B, (Int,Byte)], T_A[Int, CC_B]]]
case class CC_E(a: CC_C, b: CC_C) extends T_B[CC_A[T_A[CC_B, (Int,Byte)], T_A[Int, CC_B]]]

val v_a: T_A[((Byte,Char),Boolean), (T_B[Byte],T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}