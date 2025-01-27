package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[CC_A, T_B[T_A, CC_A]], c: T_A) extends T_A
case class CC_C(a: Char, b: Byte) extends T_A
case class CC_D[C]() extends T_B[C, CC_C]
case class CC_E[D](a: Char, b: T_B[D, D], c: (T_B[T_A, (Int,Char)],CC_A)) extends T_B[D, CC_C]
case class CC_F[E](a: E, b: T_B[E, CC_C], c: E) extends T_B[E, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_A(CC_C(_, _)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(_, _) => 4 
}
}