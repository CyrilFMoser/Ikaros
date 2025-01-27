package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_B[T_B[(Char,Char), T_A], Boolean], c: T_B[Int, T_A]) extends T_A
case class CC_B(a: CC_A, b: (((Boolean,Byte),T_A),(CC_A,T_A))) extends T_A
case class CC_C(a: Int) extends T_A
case class CC_D[C](a: T_B[C, C], b: C) extends T_B[C, T_B[CC_C, CC_A]]
case class CC_E[D]() extends T_B[D, T_B[CC_C, CC_A]]
case class CC_F(a: CC_C, b: T_A) extends T_B[Byte, T_B[CC_C, CC_A]]

val v_a: T_B[CC_B, T_B[CC_C, CC_A]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_, _)) => 0 
  case CC_E() => 1 
}
}