package Program_2 

 object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,(Char,Int)), b: Byte) extends T_A
case class CC_B(a: T_B[CC_A]) extends T_A
case class CC_C[B](a: B) extends T_B[B]
case class CC_D[C](a: C, b: C) extends T_B[C]
case class CC_E(a: CC_C[(Byte,Char)]) extends T_B[T_A]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}