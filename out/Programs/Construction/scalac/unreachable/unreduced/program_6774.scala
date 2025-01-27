package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, (Int,Int)]], b: T_B[T_B[T_A, (Char,Byte)], T_A], c: Boolean) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: CC_B, b: C) extends T_B[C, CC_B]
case class CC_D[D]() extends T_B[D, CC_B]

val v_a: T_B[CC_A, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _)) => 0 
  case CC_D() => 1 
}
}