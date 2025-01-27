package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, (T_A[Char, Byte],T_A[Boolean, Int])]
case class CC_B[D](a: D, b: Int) extends T_A[D, (T_A[Char, Byte],T_A[Boolean, Int])]
case class CC_C[E](a: CC_B[E]) extends T_A[E, (T_A[Char, Byte],T_A[Boolean, Int])]

val v_a: T_A[Char, (T_A[Char, Byte],T_A[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B(_, 12)) => 2 
  case CC_C(CC_B(_, _)) => 3 
}
}