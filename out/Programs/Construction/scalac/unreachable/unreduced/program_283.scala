package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Char, T_B[T_A, T_A]], c: (Byte,T_B[T_A, T_A])) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: C) extends T_B[C, (Int,Int)]
case class CC_D[D](a: D, b: Boolean, c: (T_A,CC_A)) extends T_B[D, (Int,Int)]
case class CC_E(a: (CC_A,T_B[T_A, T_A]), b: CC_D[CC_A], c: CC_D[T_B[CC_B, CC_A]]) extends T_B[Boolean, (Int,Int)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}