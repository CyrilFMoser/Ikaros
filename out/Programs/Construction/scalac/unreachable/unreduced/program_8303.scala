package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: T_B[((Byte,Byte),T_A), T_B[T_A, (Byte,Boolean)]]) extends T_A
case class CC_B(a: T_B[T_B[Boolean, CC_A], T_B[Int, CC_A]], b: T_B[T_A, (CC_A,CC_A)], c: CC_A) extends T_A
case class CC_C(a: CC_A, b: CC_A, c: CC_B) extends T_A
case class CC_D[C](a: C, b: T_A, c: C) extends T_B[(T_A,CC_C), C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}