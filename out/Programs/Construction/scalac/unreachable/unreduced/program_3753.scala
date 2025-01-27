package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,(Int,Boolean)), T_B[Int, Boolean]], b: T_B[Boolean, (T_A,T_A)]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[Char, Byte]) extends T_A
case class CC_D(a: (Boolean,CC_C), b: T_B[T_B[CC_C, Char], T_B[CC_B, CC_B]]) extends T_B[T_B[CC_C, Char], T_B[CC_B, CC_B]]
case class CC_E() extends T_B[T_B[CC_C, Char], T_B[CC_B, CC_B]]
case class CC_F(a: (Int,CC_D)) extends T_B[T_B[CC_C, Char], T_B[CC_B, CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}